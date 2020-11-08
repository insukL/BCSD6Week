package problem2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import problem2.service.ThrowException;

@Controller
public class Problem2Controller {
    private ThrowException throwException;

    @Autowired
    public void setThrowException(ThrowException throwException){
        this.throwException = throwException;
    }

    @RequestMapping(value = {"/problem2"}, method = RequestMethod.GET)
    public String getException(){
        throwException.throwNullpointerException();
        return "problem2";
    }
}
