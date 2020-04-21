package ru.inbox.savinov_vu.controller;

import ru.inbox.savinov_vu.input.InputService;
import ru.inbox.savinov_vu.output.OutputService;
import ru.inbox.savinov_vu.processor.ProcessorService;

import java.util.List;



public class Messenger {


    private final ProcessorService processorService;

    private final InputService inputService;

    private final OutputService outputService;


    public Messenger(ProcessorService processorService, InputService inputService, OutputService outputService) {
        this.processorService = processorService;
        this.inputService = inputService;
        this.outputService = outputService;
    }


    public void execute() {
        List<String> messages = inputService.getMessages();
        List<String> processedStrings = processorService.process(messages);
        outputService.print(processedStrings);
    }


}
