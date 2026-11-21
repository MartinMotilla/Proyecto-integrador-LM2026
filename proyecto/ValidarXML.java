import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.validation.SchemaFactory;
import javax.xml.transform.stream.StreamSource;

public class ValidarXML {

    public static void main(String[] args) {

        File xml = new File("proyecto/datos.xml");
        File xsd = new File("proyecto/datos.xsd");

        // Validación contra el DTD
        try {
            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();

            factory.setValidating(true);

            factory.setAttribute(
                    XMLConstants.ACCESS_EXTERNAL_DTD, "file");

            factory.newDocumentBuilder().parse(xml);

            System.out.println("DTD: VALIDACIÓN CORRECTA");

        } catch (Exception e) {
            System.out.println("ERROR EN DTD:");
            System.out.println(e.getMessage());
        }

        // Validación contra el XSD
        try {
            SchemaFactory schemaFactory =
                    SchemaFactory.newInstance(
                            XMLConstants.W3C_XML_SCHEMA_NS_URI);

            schemaFactory.setProperty(
                    XMLConstants.ACCESS_EXTERNAL_DTD, "file");

            schemaFactory.setProperty(
                    XMLConstants.ACCESS_EXTERNAL_SCHEMA, "file");

            var schema = schemaFactory.newSchema(xsd);
            var validator = schema.newValidator();

            validator.validate(new StreamSource(xml));

            System.out.println("XSD: VALIDACIÓN CORRECTA");

        } catch (Exception e) {
            System.out.println("ERROR EN XSD:");
            System.out.println(e.getMessage());
        }
    }
}
