package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;

//in service class, mainly we write business
public class MailService implements MessageService{

    private Repo repo;//create field from Repo

    //create constructor

    public MailService(Repo repo) {
        this.repo = repo;
    }

    public void sendMessage(Message message){
        System.out.println("I am a mail service. I am sending you this message: "+message.getMessage());

    }

    @Override
    public void saveMessage(Message message) {
     //   Repo repo = new FileRepository();
        repo.saveMessage(message);
    }
}
