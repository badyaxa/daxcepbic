package com.badyaxa.daxcepbic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

import static com.badyaxa.daxcepbic.DaxcepbicApplication.VERSION_OF_THIS_APP;

@Slf4j
@RestController
public class HomePageController {


    @GetMapping
    public String home() {

        log.info("-------------HomePageController.home()-------------");

        return "Local Time Is  <b>" + LocalTime.now() + "</b>" +
                "<br>" +
                "<h4>DAXCEPBIC ver. " + VERSION_OF_THIS_APP + "</h4>" +
                "<br>" +
                "<a href=\"/swagger-ui.html\" target=\"_blank\">swagger-ui</a>" +
                "<br>" +
                "<br>" +
                "<a href=\"https://github.com/badyaxa/daxcepbic\" target=\"_blank\">github repo</a>";
    }
}
