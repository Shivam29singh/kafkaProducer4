package com.PODownload.Producer.controller;

import com.PODownload.Producer.model.POInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/po")
public class ApiController {

    @Autowired
    private MessageChannel output;
    @PostMapping
    public void registerUser(@RequestBody POInfo poInfo){
        System.out.println("POModel :: "+poInfo);

        Message<POInfo> message = MessageBuilder.withPayload(poInfo).build();
        boolean data = output.send(message);
        System.out.println(" Data : "+data);
    }

}
