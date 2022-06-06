package com.usbapp3.usbapp3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class WelcomeService{
    public String retrieveWelcomeMessage(){
        return "Good Morning!";
    }
}