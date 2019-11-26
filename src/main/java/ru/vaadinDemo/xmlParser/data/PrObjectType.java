package ru.vaadinDemo.xmlParser.data;

import org.xml.sax.SAXException;
import ru.vaadinDemo.entityes.PrObject;
import ru.vaadinDemo.xmlParser.processing.JAXBProcessor;

import javax.xml.bind.JAXBException;

public class PrObjectType extends JAXBProcessor<PrObject> {
    private static final String TAG_NAME = "Database_1DataSet/Database_1DataSet/PRobject";

    public PrObjectType() throws JAXBException {
        super(PrObject.class, TAG_NAME);
    }

    public PrObjectType(String schemaName) throws JAXBException, SAXException {
        super(PrObject.class, TAG_NAME, schemaName);
    }

    @Override
    public void doWork(PrObject element) {
        // System.out.println("CPASO_ID = " + element.getCpasoId());
    }
}
