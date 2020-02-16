package com.apress.springrecipes.hello;

import java.util.List;

public class HelloWorld {

    private List<Holiday> holidays;
    private String message;
   
    public void setMessage(String msg) {
        this.message = msg;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public List<Holiday> getHolidays() { 
    	return holidays; 
    }
    
    public void hello() {
        System.out.println("Hello! " + message);
    }
}
