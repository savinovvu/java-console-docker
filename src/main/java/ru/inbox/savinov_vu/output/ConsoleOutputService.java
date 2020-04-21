package ru.inbox.savinov_vu.output;

import java.util.List;



public class ConsoleOutputService implements OutputService {

    @Override
    public void print(List<String> printedStrings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < printedStrings.size(); i++) {
            stringBuilder.append("Case ");
            stringBuilder.append("#");
            stringBuilder.append(i + 1);
            stringBuilder.append(" ");
            stringBuilder.append(printedStrings.get(i));
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder.toString());
    }
}
