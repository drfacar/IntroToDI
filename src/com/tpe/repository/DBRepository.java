package com.tpe.repository;

import com.tpe.domain.Message;

public class DBRepository implements Repo{
    public void saveMessage(Message message){
        System.out.println("Your message is saved to DataBase: "+message.getMessage());
    }
}
