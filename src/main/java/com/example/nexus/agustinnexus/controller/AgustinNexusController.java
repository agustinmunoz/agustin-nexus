package com.example.nexus.agustinnexus.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin()
@RestController
public class AgustinNexusController {


    private static Logger logger = LoggerFactory.getLogger(AgustinNexusController.class);



    @GetMapping("/agustin-nexus")
    public String getUsers() throws Exception {

        return "hola Mundo";
    }

   







    }






