package com.example.springtest.controller;

import com.example.springtest.Form.NameForm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DirectoryController {

    ArrayList<NameForm> nameAndNum = new ArrayList<NameForm>();
    String mes = "this is a message";

    @RequestMapping(path = "/directory", method = RequestMethod.POST)
    public String postDirectory(
            @RequestParam(value = "name", defaultValue = "kino") String nameString,
            @RequestParam(value = "num", defaultValue = "no.1") String numString){
        return "hi--" + nameString + ", your num--" + numString;
    }
}
