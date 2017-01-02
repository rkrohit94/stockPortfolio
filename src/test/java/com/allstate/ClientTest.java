package com.allstate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class ClientTest {
    @Test
    public void broker_initConstructor(){
        Client broker = new Client("rohit","male", 22);
        Assert.assertEquals(broker.getName(),"rohit");
    }

    @Test
    public void broker_addFundTest(){
        Client client = new Client("rohit","male", 22);
        client.addFund(1000);
        Assert.assertEquals(client.getMyCashBalance(),1000);
    }
    @Test
    public void broker_withdrawFundTest(){
        Client client = new Client("rohit","male", 22);
        client.addFund(1000);
        client.withdrawFund(100);
        Assert.assertEquals(client.getMyCashBalance(),900);
    }

    @Test
    public void broker_purchaseStockTest(){
        Client client = new Client("rohit","male", 22);
        client.addFund(1000);
        Stock stock= new Stock("TCS");
        Assert.assertEquals(client.purchaseStock(stock, 10), "Purchase sucess..");
        Assert.assertNotEquals(client.getMyCashBalance(),1000);
    }
    @Test
    public void broker_purchaseStockTest1(){
        Client client = new Client("rohit","male", 22);
        client.addFund(100);
        Stock stock= new Stock("TCS");
        client.purchaseStock(stock, 50);
        Assert.assertEquals(client.purchaseStock(stock, 50), "Insufficient fund!!");
    }
    @Test
    public void broker_sellStockTest(){
        Client client = new Client("rohit","male", 22);
        client.addFund(1000);
        Stock stock= new Stock("TCS");
        client.purchaseStock(stock, 10);
        int balance = client.getMyCashBalance();
        client.sellStock(stock, 5);
        int balance2 = client.getMyCashBalance();
        Assert.assertNotEquals(balance2,balance);
//        System.out.println("jgdj"+balance+"jhdjhvd"+balance2);
        Assert.assertEquals(stock.getShares(),5);
    }
}