package ru.vaadinDemo.xmlParser.bench;

import ru.vaadinDemo.xmlParser.utils.MultiSequenceInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XMLBenchmarkInputStream extends MultiSequenceInputStream {
    private long byteCount;

    public XMLBenchmarkInputStream(String rootTag, InputStream xml) {
        super(new ByteArrayInputStream(("<" + rootTag + ">").getBytes()),
                xml,
                new ByteArrayInputStream(("</" + rootTag + ">").getBytes()));
    }

    @Override
    public int read() throws IOException {
        ++byteCount;
        return super.read();
    }

    public long getByteCount() {
        return byteCount;
    }
}