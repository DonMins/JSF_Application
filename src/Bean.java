import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;

@Stateless
@LocalBean
public class Bean {
    public  String concat(String s1, String s2) {
        return s1 + s2;
    }
}

