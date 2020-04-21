package ru.inbox.savinov_vu.processor;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static ru.inbox.savinov_vu.constants.Constants.SPACE;
import static ru.inbox.savinov_vu.constants.Constants.SYMBOL_TO_BUTTON_MAP;
import static ru.inbox.savinov_vu.constants.Constants.SYMBOL_TO_CODE_MAP;



public class SimpleProcessorService implements ProcessorService {

    @Override
    public List<String> process(Collection<String> stringCollection) {
        return stringCollection.stream().map(this::process).collect(Collectors.toList());
    }


    private String process(String rawString) {
        char[] nextLineCharArray = rawString.toCharArray();
        char previous = nextLineCharArray[0];
        StringBuilder sb = new StringBuilder();
        sb.append(SYMBOL_TO_CODE_MAP.get(previous));
        for (int i = 1; i < nextLineCharArray.length; i++) {
            char current = nextLineCharArray[i];
            if (SYMBOL_TO_BUTTON_MAP.get(previous).equals(SYMBOL_TO_BUTTON_MAP.get(current))) {
                sb.append(SPACE);
            }
            previous = current;
            sb.append(SYMBOL_TO_CODE_MAP.get(previous));
        }
        return sb.toString();
    }

}
