package com.example.springtest.controller;

import com.example.springtest.Form.NameForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class FormController {

    ArrayList<NameForm> names = new ArrayList<NameForm>();

    @RequestMapping(path = "processFormPostHTMLReturn", method = RequestMethod.POST)
    public String postFormProcessor(NameForm nameForm) {
        names.add(nameForm);
        NameForm.printArray(names);
        return "redirect:returnForm.html";
    }
}
