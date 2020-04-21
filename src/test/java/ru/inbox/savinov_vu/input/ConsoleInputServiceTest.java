package ru.inbox.savinov_vu.input;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;



@ExtendWith(MockitoExtension.class)
class ConsoleInputServiceTest {

    private ConsoleInputService consoleInputService;


    @BeforeEach
    void init() {
        try {
            BufferedReader reader = org.mockito.Mockito.mock(BufferedReader.class);
            when(reader.readLine())
                    .thenReturn("4")
                    .thenReturn("hi")
                    .thenReturn("yes")
                    .thenReturn("foo  bar")
                    .thenReturn("hello world");
            consoleInputService = new ConsoleInputService(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    void input_test() throws IOException {
        List<String> messages = consoleInputService.getMessages();
        assertEquals(messages.size(), 4);
        assertEquals(messages.get(0), "hi");
        assertEquals(messages.get(1), "yes");
        assertEquals(messages.get(2), "foo  bar");
        assertEquals(messages.get(3), "hello world");
    }

}