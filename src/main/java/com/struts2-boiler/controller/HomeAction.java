package com.example.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeAction extends ActionSupport {
    private static final Logger logger = LoggerFactory.getLogger(HomeAction.class);
    private String message;

    public String execute() throws Exception {
        logger.debug("Executing HomeAction");
        message = "Hello from Struts2!";
        logger.debug("Message set to: {}", message);
        return SUCCESS;
    }

    public String getMessage() {
        logger.debug("Getting message: {}", message);
        return message;
    }

    public void setMessage(String message) {
        logger.debug("Setting message to: {}", message);
        this.message = message;
    }
}