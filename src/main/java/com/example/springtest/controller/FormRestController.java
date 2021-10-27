package com.example.springtest.controller;

import com.example.springtest.Form.NameAgeForm;
import com.example.springtest.Form.NameForm;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FormRestController {

    ArrayList<NameForm> names = new ArrayList<NameForm>();
    ArrayList<NameAgeForm> namesAndAge = new ArrayList<NameAgeForm>();

    @RequestMapping(path = "/processFormGet")
    public String getFormProcessor(
            @RequestParam(value = "firstName", defaultValue = "Jaijun") String firstNameString,
            @RequestParam(value = "lastName", defaultValue = "Wang") String lastNameString) {
        return "Data on " + firstNameString + lastNameString;

    }

    @RequestMapping(path = "/processFormPost", method = RequestMethod.POST)
    public String postFormProcessor(NameForm nameForm) {
        System.out.println("submint name is " + nameForm.getFirstName() + nameForm.getSurname());
        names.add(nameForm);
        NameForm.printArray(names);
        return "Data on "+nameForm.getFirstName()+" "+nameForm.getSurname();

    }

    @RequestMapping(path = "/processAgeFormPost", method = RequestMethod.POST)
    public String postAgeFormProcessor(NameAgeForm nameAgeForm, BindingResult br) {
        System.out.println("submint name is " + nameAgeForm.getFirstName() + " " + nameAgeForm.getSurname() + " " + nameAgeForm.getAge());
        if (br.hasErrors()) {
            return br.getFieldError().toString();
        }else {
            namesAndAge.add(nameAgeForm);
            nameAgeForm.printAnotherArray(namesAndAge);
            return "Data on "+nameAgeForm.getFirstName()+" "+nameAgeForm.getSurname()+ " " + nameAgeForm.getAge();
        }
    }
}

