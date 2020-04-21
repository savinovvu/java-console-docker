package ru.inbox.savinov_vu.output;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



class ConsoleOutputServiceTest {

    private ConsoleOutputService consoleOutputService;

    private ByteArrayOutputStream outContent;

    private PrintStream originalOut;

    private PrintStream out;


    @BeforeEach
    void init() {
        consoleOutputService = new ConsoleOutputService();
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        out = new PrintStream(outContent);
        System.setOut(out);
    }


    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        out.close();
    }


    @Test
    void print() {
        List<String> strings = List.of("111", "222", "333", "4");
        consoleOutputService.print(strings);
        String string = outContent.toString();
        assertEquals("Case #1 111\nCase #2 222\nCase #3 333\nCase #4 4\n", string);
    }


}