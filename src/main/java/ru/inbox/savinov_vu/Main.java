package ru.inbox.savinov_vu;

import ru.inbox.savinov_vu.controller.Messenger;
import ru.inbox.savinov_vu.input.ConsoleInputService;
import ru.inbox.savinov_vu.input.InputService;
import ru.inbox.savinov_vu.output.ConsoleOutputService;
import ru.inbox.savinov_vu.output.OutputService;
import ru.inbox.savinov_vu.processor.ProcessorService;
import ru.inbox.savinov_vu.processor.SimpleProcessorService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ProcessorService processorService = new SimpleProcessorService();
            InputService consoleInputService = new ConsoleInputService(reader);
            OutputService consoleOutputService = new ConsoleOutputService();
            Messenger messenger = new Messenger(processorService, consoleInputService, consoleOutputService);
            messenger.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
