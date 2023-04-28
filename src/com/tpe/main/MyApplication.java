package com.tpe.main;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SmsService;
import com.tpe.service.WhatsAppService;

public class MyApplication {
    public static void main(String[] args) {

        //create object from message class
        Message message = new Message();
        message.setMessage("Orders had been submitted to cargo...");

        //********** LEVEL 1 **********
        //I want to send message using mail service
//        MessageService mailService = new MailService();
//        mailService.sendMessage(message);
//
//        //it was working fine, but instead of Mail Service we want to send message using SMS
//        MessageService smsService = new SmsService();
//        smsService.sendMessage(message);

        //send message using WhatsApp message
//        MessageService whatsAppService = new WhatsAppService();
//        whatsAppService.sendMessage(message);

        //this is better to use interface but let's make improvement: we will decide on run time
        // which service to use

        ////********** LEVEL 2 **********
//        String serviceName = "mailService";
//        MessageService service;
//
//        if(args.length>0){
//            serviceName = args[0];
//        }
//        if(serviceName.equalsIgnoreCase("smsService")){
//            service = new SmsService();
//        }else if(serviceName.equalsIgnoreCase("whatsappService")){
//            service = new WhatsAppService();
//        }else{
//            service = new MailService();
//        }
//        service.sendMessage(message);

        //********** LEVEL 3 **********
        Repo repo = new DBRepository();
        MessageService mailService = new MailService(repo);
        mailService.sendMessage(message);
        mailService.saveMessage(message);

        //in this task we have:
           //we tried to have loosely coupling:
              //1)used interface instead of concrete classes
              //2)used DI

    }
}
