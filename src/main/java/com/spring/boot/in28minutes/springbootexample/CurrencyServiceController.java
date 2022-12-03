package com.spring.boot.in28minutes.springbootexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    private CurrencyService currencyService;

    @RequestMapping("/currency")
    public CurrencyService getCurrencyService(){
        return currencyService;
    }
}
