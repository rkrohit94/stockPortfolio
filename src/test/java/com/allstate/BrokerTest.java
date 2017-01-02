package com.allstate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class BrokerTest {

     @Test
    public void broker_initConstructor(){
         Broker broker = new Broker("Zerodha");
         Assert.assertEquals(broker.getName(),"Zerodha");
     }

    @Test
    public void broker_addClientTest() {
        Broker broker = new Broker("zerodha");
        Client client = new Client("sumit","male", 30);
        broker.addClient(client);
        Assert.assertNotNull(broker.clients);
    }


}