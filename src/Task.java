import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "task")
@ManagedBean(name = "task")
@SessionScoped
@XmlType(propOrder = {"str1", "str2", "result"})
public class Task implements Serializable {
    @EJB

    private Bean bean;

    private String str1 = "";

    private String str2 = "";

    private String result = "";
    boolean ready = false;

    public Task(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public Task() {
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
    @XmlElement(name="argument1")
    public String getStr1() {
        return str1;
    }
    @XmlElement(name="argument2")
    public String getStr2() {
        return str2;
    }
    @XmlElement(name="result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean getReady() {
        return ready;
    }

      public String concat() {
          result = bean.concat(str1, str2);
          ready = true;
          return "result";
      }
}
