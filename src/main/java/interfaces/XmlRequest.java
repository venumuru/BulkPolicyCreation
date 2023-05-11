package interfaces;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public interface XmlRequest {

    static <T> String marshallRequest(T mappedClass, String soapEnvelope) {

        Class clazz = mappedClass.getClass();
        Marshaller jaxbMarshaller = null;
        StringWriter sw = new StringWriter();
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(clazz);
            jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            jaxbMarshaller.marshal(mappedClass, sw);
        } catch (JAXBException e) {
            System.out.println(e);
            //Log.LogError("Unable to marshall class: " + clazz, e);
            return null;
        }
        System.out.println(soapEnvelope + sw.toString() + " </soapenv:Body>\n" + "</soapenv:Envelope>");
        return soapEnvelope + sw.toString() + " </soapenv:Body>\n" + "</soapenv:Envelope>";
    }

    static <T> String marshallRequest(T mappedClass, String soapEnvelope, String endEnvelope) {

        Class clazz = mappedClass.getClass();
        Marshaller jaxbMarshaller = null;
        StringWriter sw = new StringWriter();
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(clazz);
            jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            jaxbMarshaller.marshal(mappedClass, sw);
        } catch (JAXBException e) {
            //Log.LogError("Unable to marshall class: " + clazz, e);
            return null;
        }
        System.out.println(soapEnvelope + sw.toString() + endEnvelope);
        return soapEnvelope + sw.toString() + endEnvelope;
    }


    default String getSoapEnvelope() {
        return "";
    }
    String generateAsXml();
}

