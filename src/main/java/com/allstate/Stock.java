package com.allstate;

/**
 * Created by localadmin on 02/01/17.
 */
public class Stock {
    String name;
    int purchasePrice;
    int currentPrice;
    int shares;

    public Stock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getCurrentPrice() {
        currentPrice =(int)(Math.random()*10);
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }
}
