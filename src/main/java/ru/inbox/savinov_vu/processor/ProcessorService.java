package ru.inbox.savinov_vu.processor;

import java.util.Collection;
import java.util.List;



public interface ProcessorService {

    List<String> process(Collection<String> stringCollection);

}
