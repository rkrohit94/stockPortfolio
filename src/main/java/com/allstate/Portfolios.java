package com.allstate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by localadmin on 02/01/17.
 */
public class Portfolios {


    String name;
    ArrayList<Stock> stocks = new ArrayList<Stock>();

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
