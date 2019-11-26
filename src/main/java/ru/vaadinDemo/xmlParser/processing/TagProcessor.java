package ru.vaadinDemo.xmlParser.processing;

import javax.xml.stream.XMLStreamReader;

public interface TagProcessor {
    public String getTagPath();

    public void process(XMLStreamReader xmlStreamReader);
}
