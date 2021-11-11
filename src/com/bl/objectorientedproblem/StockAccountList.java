package com.bl.objectorientedproblem;

import java.util.Scanner;

public class StockAccountList {
    Scanner scanner = new Scanner(System.in);

    int NumOfStocks1, NumOfShares1, SharePrice1;
    int NumOfStocks2, NumOfShares2, SharePrice2;
    int NumOfStocks3, NumOfShares3, SharePrice3;

    public StockAccountList() {
        System.out.println("Enter the Stock1");
        NumOfStocks1 = scanner.nextInt();
        System.out.println("Enter the Stock1 Shares");
        NumOfShares1 = scanner.nextInt();
        System.out.println("Enter the Stock1 Price");
        SharePrice1 = scanner.nextInt();
        System.out.println("Enter the Stock2");
        NumOfStocks2 = scanner.nextInt();
        System.out.println("Enter the Stock2 Shares");
        NumOfShares2 = scanner.nextInt();
        System.out.println("Enter the Stock2 Price");
        SharePrice2 = scanner.nextInt();
        System.out.println("Enter the Stock3 Stock");
        NumOfStocks3 = scanner.nextInt();
        System.out.println("Enter the Stock Shares");
        NumOfShares3 = scanner.nextInt();
        System.out.println("Enter the Price");
        SharePrice3 = scanner.nextInt();
    }

    void nameOfStocks(String shareName1, String shareName2, String shareName3) {
        shareName1 = "Tata Power Share";
        shareName2 = "Adani Share";
        shareName3 = "MRF Tyres Share";
        System.out.println("Share I have :- " + shareName1 + " , " + shareName2 + " , " + shareName3);
    }

    void Debit() {
        Scanner sc = new Scanner(System.in);
        Scanner ammount = new Scanner(System.in);
        System.out.println("Enter the Share Num You Want to Sell:- ");
        System.out.println("1 for Tata Power, 2 for Adani, 3 for MRF Tyres");
        int shareName = ammount.nextInt();
        if (shareName == 1 || shareName == 2 || shareName == 3) {
            System.out.println("Enter Share Amount :- ");
            int shareAmount = ammount.nextInt();
            if (shareAmount <= SharePrice1 && shareName == 1) {
                System.out.println("You Sold Tata Power Share of Amount :- " + shareAmount
                        + " Now Share Remaining Amount are :- " + (SharePrice1 - shareAmount));
            } else if (shareAmount <= SharePrice2 && shareName == 2) {
                System.out.println("You sold Adani Share of Amount :- " + shareAmount
                        + " Now Share Remaining Amount are:- " + (SharePrice2 - shareAmount));
            } else if (shareAmount <= SharePrice3 && shareName == 3) {
                System.out.println("You sold MRF Tyres Share of Amount :- " + shareAmount
                        + " Now Share Remaining Amount are:- " + (SharePrice3 - shareAmount));
            } else {

                System.out.println("You don't have that much amount, Enter less amount");
            }
        } else {
            System.out.println("Enter proper number.");
        }
    }

    void Display() {
        int oneStock1 = SharePrice1 / NumOfStocks1;
        int oneShare1 = oneStock1 / NumOfShares1;
        System.out.println("The value of Tata Power one Stock:- " + oneStock1 + " and total Stocks I have-> " + NumOfStocks1);
        System.out.println("The value of Tata Power one Share:- " + oneShare1 + " and total Stocks I have-> "
                                                                              + NumOfShares1 + " Shares, worth " + SharePrice1 + "rs");
        System.out.println();
        int oneStock2 = SharePrice2 / NumOfStocks2;
        int oneShare2 = oneStock2 / NumOfShares2;
        System.out.println("The value of Adani one Stock:- " + oneStock2 + " and total Stocks I have-> " + NumOfStocks2);
        System.out.println("The value of Adani one Share:- " + oneShare2 + " and total Stocks I have-> " + NumOfShares2
                                                                         + " Shares, worth " + SharePrice2 + "rs");
        System.out.println();
        int oneStock3 = SharePrice3 / NumOfStocks3;
        int oneShare3 = oneStock3 / NumOfShares3;
        System.out.println("The value of MRF Tyres one Stock:- " + oneStock3 + " and total Stocks I have-> " + NumOfStocks3);
        System.out.println("The value of MRF Tyres one Share:- " + oneShare3 + " and total Stocks I have-> "
                                                                 + NumOfShares3 + " Shares, worth "
                                                                 + SharePrice3 + "rs");
    }
}
