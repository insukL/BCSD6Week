package problem1.controller;

import problem1.service.FindElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Problem1Controller {
    private FindElement findElement;

    @Autowired
    public void setFindElement(FindElement findElement){
        this.findElement = findElement;
    }

    @RequestMapping(value = {"/problem1"}, method = RequestMethod.GET)
    public String find(){
        findElement.linearSearch(5);
        findElement.binarySearch(5);
        return "problem1";
    }
}
