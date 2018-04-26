
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@ManagedBean
@SessionScoped
@FacesValidator("myValidator")

public class MyValidator implements Validator{
    private String str1;

    public String getMno() {
        return str1;
    }
    public void setMno(String str1) {
        this.str1 = str1;
    }
    public MyValidator() {
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String model =(String ) o;
        if(model.length()==0){
            FacesMessage msg = new FacesMessage(":( Ой, строчка то пустая :(");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);

        }

    }
}
