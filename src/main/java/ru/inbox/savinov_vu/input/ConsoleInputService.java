package ru.inbox.savinov_vu.input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ConsoleInputService implements InputService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleInputService.class);

    private final BufferedReader reader;


    public ConsoleInputService(BufferedReader reader) {
        this.reader = reader;
    }


    @Override
    public List<String> getMessages() {
        try {
            return getMessagesList(reader);
        } catch (IOException e) {
            LOGGER.error("Not correct input", e);
            throw new RuntimeException(e);
        }
    }


    private List<String> getMessagesList(BufferedReader reader) throws IOException {
        int wordCount = getWordCount(reader);
        List<String> inputList = new ArrayList<>();
        for (int i = 0; i < wordCount; i++) {
            inputList.add(reader.readLine());
        }
        return inputList;
    }


    private int getWordCount(BufferedReader reader) throws IOException {
        while (true) {
            try {
                int wordCount = Integer.parseInt(reader.readLine());
                if (wordCount > 0 && wordCount <= 100) {
                    return wordCount;
                }
                LOGGER.warn("Not correct Number");
            } catch (NumberFormatException e) {
                LOGGER.warn("Not a Number", e);
            }
        }
    }
}
