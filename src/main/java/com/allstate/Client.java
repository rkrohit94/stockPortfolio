package com.allstate;

import java.util.ArrayList;

/**
 * Created by localadmin on 02/01/17.
 */
public class Client {
    String name;
    String gender;
    int age;
    int myCashBalance;
    ArrayList<Portfolios> portfolio = new ArrayList<Portfolios>();


    public Client(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMyCashBalance() {
        return myCashBalance;
    }

    public void setMyCashBalance(int myCashBalance) {
        this.myCashBalance = myCashBalance;
    }

    public void addFund(int fund){
        myCashBalance += fund;
    }

    public void withdrawFund(int fund){
        myCashBalance -= fund;
    }

    public String purchaseStock(Stock stock, int quantity){
        int price = stock.getCurrentPrice();
        if(myCashBalance <=price*quantity){
            return "Insufficient fund!!";
        }else{
            Portfolios portfolios = new Portfolios();
            portfolios.setName("tech");
            myCashBalance -= price*quantity;
            stock.setPurchasePrice(price);
            stock.setShares(quantity);
            portfolios.stocks.add(stock);
            portfolio.add(portfolios);
            return "Purchase sucess..";
        }
    }
    public void sellStock(Stock stock, int quantity){
        int price = stock.getCurrentPrice();
        myCashBalance += price*quantity;
        int shares= stock.getShares();
        shares -= quantity;
        stock.setShares(shares);
    }
}
