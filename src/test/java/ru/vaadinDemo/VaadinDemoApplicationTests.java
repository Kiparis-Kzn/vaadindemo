package ru.vaadinDemo;

import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.vaadinDemo.entityes.PrObject;
import ru.vaadinDemo.xmlParser.bench.XMLBenchmarkInputStream;
import ru.vaadinDemo.xmlParser.data.PrObjectType;
import ru.vaadinDemo.xmlParser.processing.TagEngine;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class VaadinDemoApplicationTests {

    private static String ROOT_TAG = "Database_1DataSet";

    @Test
    @Ignore
    public void contextLoads() {
    }

    @Test
    public void speedTest() throws Throwable {
        URL xmlUrl = getClass().getClassLoader().getResource("input.xml");
        String filePath = xmlUrl.getFile();
        System.out.println("Start parsing file:" + filePath);
        Runtime runtime = Runtime.getRuntime();
        System.gc();
        System.out.println("XML parsing old method");
        test_old_with_time(filePath);
        System.out.println("Used Memory:"
                + (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + "MB");
        System.out.println("----------------------------------------------------------");
        System.gc();
        System.out.println("XML parsing pure stax method");
        test_pure_stax_with_time(xmlUrl);
        System.out.println("Used Memory:"
                + (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + "MB");
        System.out.println("----------------------------------------------------------");
        System.gc();
        System.out.println("XML parsing new method");
        test_new_with_time(xmlUrl);
        System.out.println("Used Memory:"
                + (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + "MB");
        System.out.println("----------------------------------------------------------");
    }

    private void test_new_with_time(URL xmlUrl) throws Throwable {
        long millis = System.currentTimeMillis();
        test_new(xmlUrl);
        long endMillis = System.currentTimeMillis();
        System.out.println("Runtime: " + (endMillis - millis) + "ms");
    }

    private void test_new(URL xmlUrl) throws Throwable {
        TagEngine tagEngine = new TagEngine();
        PrObjectType prObjectType = new PrObjectType();
        //byte[] buf = FileUtils.readFileToByteArray(new File(filePath));
//        ByteArrayInputStream xml = new ByteArrayInputStream(buf);
        XMLBenchmarkInputStream xstream =
                new XMLBenchmarkInputStream(ROOT_TAG, xmlUrl.openStream());
        tagEngine.add(prObjectType);
        tagEngine.process(xstream);
    }

    private void test_pure_stax_with_time(URL xmlUrl) throws Throwable {
        long millis = System.currentTimeMillis();
        test_pure_stax(xmlUrl);
        long endMillis = System.currentTimeMillis();
        System.out.println("Runtime: " + (endMillis - millis) + "ms");
    }

    private void test_pure_stax(URL xmlURL) throws IOException, XMLStreamException {
        int count = 0;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(xmlURL.openStream());
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("PRobject")) {
//                        System.out.println("Найден объект");
                        count++;
                    }
                }
            }
            System.out.println("Найдено " + count + " объектов");
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void test_old_with_time(String filePath) {
        long millis = System.currentTimeMillis();
        test_old(filePath);
        long endMillis = System.currentTimeMillis();
        System.out.println("Runtime: " + (endMillis - millis) + "ms");
    }

    private void test_old(String filePath) {
        try {
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = dBuilder.parse(new File(filePath));
            NodeList nList = doc.getElementsByTagName("PRobject");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                PrObject prObject = new PrObject();
                NodeList nodeList = nNode.getChildNodes();

                for (int i = 0; i < nodeList.getLength(); i++) {
                    String itemNodeName = nodeList.item(i).getNodeName();
                    String itemNodeValue = nodeList.item(i).getTextContent();

                    switch (itemNodeName) {
                        case "CPASO_ID":
                            prObject.setCpasoId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPPRT_ID":
                            prObject.setCprtId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASO_NAME":
                            prObject.setCpasoName(itemNodeValue);
                            break;
                        case "CPASO_INVENTORY_NUMBER":
                            prObject.setCpasoInventoryNumber(itemNodeValue);
                            break;
                        case "CPASO_USAGES":
                            prObject.setCpasoUsage(itemNodeValue);
                            break;
                        case "CPASO_PASS_NUM":
                            prObject.setCpasoPassNum(itemNodeValue);
                            break;
                        case "CPASO_PASS_DATE":
                            prObject.setCpasoPassDate(stringToDate(itemNodeValue));
                            break;
                        case "CPSIT_ID":
                            prObject.setCpsitId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASO_SQUARE":
                            prObject.setCpasoSquare(itemNodeValue);
                            break;
                        case "ORMSU_ID_SQUARE":
                            prObject.setOrmsuIdSquare(Long.parseLong(itemNodeValue));
                            break;
                        case "ORADR_ADRESS_ID":
                            prObject.setOradrAdressId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASO_START_DATE":
                            prObject.setCpasoStartDate(itemNodeValue);
                            break;
                        case "CPASO_NOTE":
                            prObject.setCpasoNote(itemNodeValue);
                            break;
                        case "CPCST_AMOUNT_1":
                            prObject.setCpcstAmount1(itemNodeValue);
                            break;
                        case "ORMSU_ID_AMOUNT_1":
                            prObject.setOrmsuIdAmount1(Long.parseLong(itemNodeValue));
                            break;
                        case "CPCST_DATE_AMOUNT_1":
                            prObject.setCpcstDateAmount1(stringToDate(itemNodeValue));
                            break;
                        case "CPCST_AMOUNT_2":
                            prObject.setCpcsAmount2(itemNodeValue);
                            break;
                        case "ORMSU_ID_AMOUNT_2":
                            prObject.setOrmsuIdAmount2(Long.parseLong(itemNodeValue));
                            break;
                        case "CPCST_DATE_AMOUNT_2":
                            prObject.setCpcstDateAmount2(stringToDate(itemNodeValue));
                            break;
                        case "CPOEF_VALUE_ET":
                            prObject.setCpoefValueEt(itemNodeValue);
                            break;
                        case "CPOEF_VALUE_F":
                            prObject.setCpoefValueF(itemNodeValue);
                            break;
                        case "CPOEF_VALUE_IZ":
                            prObject.setCpoefValueIz(itemNodeValue);
                            break;
                        case "CPOEF_VALUE_N":
                            prObject.setCpoefValueN(itemNodeValue);
                            break;
                        case "CPOEF_VALUE_K":
                            prObject.setCpoefValueK(itemNodeValue);
                            break;
                        case "CPOEF_VALUE_M":
                            prObject.setCpoefValueM(itemNodeValue);
                            break;
                        case "CPOEF_VALUE_PR":
                            prObject.setCpoefValuePr(itemNodeValue);
                            break;
                        case "CPOEF_VALUE_OB":
                            prObject.setCpoefValueOb(itemNodeValue);
                            break;
                        case "ORMSU_ID_SQUARE_P":
                            prObject.setOrmsuIdSquareP(Long.parseLong(itemNodeValue));
                            break;
                        case "ORMSU_ID_SQUARE_V":
                            prObject.setOrmsuIdSquareV(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASO_KOLVO":
                            prObject.setCpasoKolvo(itemNodeValue);
                            break;
                        case "CPAUT_ID":
                            prObject.setCpautId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPINF_SV_ID":
                            prObject.setCpinfSvId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPOBS_ID":
                            prObject.setCpobsId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASC_SERIES":
                            prObject.setCpascSeries(itemNodeValue);
                            break;
                        case "CPASC_CODE":
                            prObject.setCpascCode(itemNodeValue);
                            break;
                        case "CPASC_DATE":
                            prObject.setCpascDate(stringToDate(itemNodeValue));
                            break;
                        case "CPASC_SUB":
                            prObject.setCpascSub(itemNodeValue);
                            break;
                        case "CPINF_PASS_ID":
                            prObject.setCpinfPassId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASO_PASS_SUB":
                            prObject.setCpasoPassSub(itemNodeValue);
                            break;
                        case "CPINF_CAD_ID":
                            prObject.setCpinfCadId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPACA_CAD_DATE":
                            prObject.setCpacaCadDate(stringToDate(itemNodeValue));
                            break;
                        case "CPACA_CAD_SUB":
                            prObject.setCpacaCadSub(itemNodeValue);
                            break;
                        case "CPINF_RT_ID":
                            prObject.setCpinfRtId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPOBS_RT_ID":
                            prObject.setCpobsRtId(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASC_RT_SERIES":
                            prObject.setCpascRtSeries(itemNodeValue);
                            break;
                        case "CPASC_RT_CODE":
                            prObject.setCpascRtCode(itemNodeValue);
                            break;
                        case "CPASC_RT_DATE":
                            prObject.setCpascDate(stringToDate(itemNodeValue));
                            break;
                        case "CPASC_RT_SUB":
                            prObject.setCpascRtSub(itemNodeValue);
                            break;
                        case "CPASO_CADASTRE_CODE":
                            prObject.setCpasoCadastreCode(itemNodeValue);
                            break;
                        case "IE_GUID":
                            prObject.setIeGuide(itemNodeValue);
                            break;
                        case "ORMSU_ID_AM_CADASTRE":
                            prObject.setOrmsuIdAmCadastre(Long.parseLong(itemNodeValue));
                            break;
                        case "ORMSU_ID_SQUARE_BUILDING":
                            prObject.setOrmsuIdSquareBuilding(Long.parseLong(itemNodeValue));
                            break;
                        case "ORMSU_ID_SQUARE_H":
                            prObject.setOrmsuIdSquareH(Long.parseLong(itemNodeValue));
                            break;
                        case "CPASO_SQUARE_H":
                            prObject.setCpasoSquareH(itemNodeValue);
                            break;
                        case "FULL_ADRESS":
                            prObject.setFullAdress(itemNodeValue);
                            break;
                        case "CPPRT_NAME":
                            prObject.setCpprtName(itemNodeValue);
                            break;
                        case "ORMSU_CODE":
                            prObject.setOrmsuCode(itemNodeValue);
                            break;
                        case "CODE_1":
                            prObject.setCode1(itemNodeValue);
                            break;
                        case "CODE_2":
                            prObject.setCode2(itemNodeValue);
                            break;
                        case "CPOBS_NAME":
                            prObject.setCpobsName(itemNodeValue);
                            break;
                        case "CPAUT_CODE":
                            prObject.setCpautCode(itemNodeValue);
                            break;
                    }
                }
                // System.out.println(prObject.toString());
            }
            System.out.println("nList.getLength() = " + nList.getLength());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Date stringToDate(String string) {
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
        try {
            date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
