package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;

public class SmsService implements MessageService{

    private Repo repo;

    public SmsService(Repo repo) {
        this.repo = repo;
    }

    public void sendMessage(Message message){
        System.out.println("I am a SMS service. I am sending you this message: "+message.getMessage());

    }

    @Override
    public void saveMessage(Message message) {
     //   Repo repo = new FileRepository();
        repo.saveMessage(message);
    }
}
