package ru.inbox.savinov_vu.processor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test_helpers.TestConstants.BIG_A;
import static test_helpers.TestConstants.BIG_A_PROCESSED;



class SimpleProcessorServiceTest {

    private SimpleProcessorService simpleProcessorService;


    @BeforeEach
    void init() {
        simpleProcessorService = new SimpleProcessorService();
    }


    @Test
    void process_simpleInput() {
        List<String> input = List.of("hi", "yes", "foo  bar", "hello world");
        List<String> result = simpleProcessorService.process(input);
        assertEquals(4, result.size(), "input size don't equals result size");
        assertEquals(result.get(0), "44 444", "incorrect processing: hi");
        assertEquals(result.get(1), "999337777", "incorrect processing: yes");
        assertEquals(result.get(2), "333666 6660 022 2777", "incorrect processing: foo  bar");
        assertEquals(result.get(3), "4433555 555666096667775553", "incorrect processing: hello world");
    }


    @Test
    void process_largeInput() {
        List<String> input = prepareLargeStringList();
        List<String> result = simpleProcessorService.process(input);
        assertEquals(100, result.size(), "input size don't equals result size");
        assertEquals(BIG_A_PROCESSED, result.get(0), "incorrect processing: BIG_A");
    }


    private List<String> prepareLargeStringList() {
        List<String> input = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            input.add(BIG_A);
        }
        return input;
    }

}