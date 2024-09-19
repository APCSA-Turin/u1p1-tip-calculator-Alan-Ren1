package com.example.project;
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double decimalPercentage = (percent / 100f) + 1; //
        double totalTip = cost * decimalPercentage;
        double totalBill = totalTip + cost;
        double PerPersonBeforeTip = cost / people;
        double TipPerPerson = totalTip / people;
        double TotalCostPerPerson = totalBill / people;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + totalTip + "\n");
        result.append("Total Bill with tip: $" + totalBill + "\n");
        result.append("Per person cost before tip: $" + PerPersonBeforeTip + "\n");
        result.append("Tip per person: $" + TipPerPerson + "\n");
        result.append("Total cost per person: $" + TotalCostPerPerson + "\n");
        result.append("-------------------------------\n");
        result.append(percent / 100.0f);


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
