package com.bl.objectorientedproblem;

public class Stock {
    public static void main(String[] args) {
        StockAccountList sareDetails = new StockAccountList();
        sareDetails.nameOfStocks(" ", " ", " ");
        System.out.println();
        sareDetails.Display();
        System.out.println();
        sareDetails.Debit();
    }
}
