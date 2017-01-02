package com.allstate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by localadmin on 02/01/17.
 */
public class Broker {
    String name;
    static ArrayList<Client> clients = new ArrayList<Client>();

    public Broker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClient(Client client){
        clients.add(client);

    }

//    public boolean findClient(Client client){
//        Iterator iterator = clients.iterator();
//        while (iterator.hasNext()){
//            if(client.getName())
//        }
//    }

}
