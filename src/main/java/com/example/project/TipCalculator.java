package com.example.project;
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double decimalPercentage = (percent / 100f) + 1;            //learned to divide by 100 https://stackoverflow.com/questions/16961275/dividing-by-100-returns-0
        double totalTip1 = (cost * decimalPercentage) - cost;
        double totalTip = Math.round(totalTip1 * 100.0) / 100.0;                            //I learned rounding from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double totalBill1 = totalTip1 + cost;
        double totalBill = Math.round(totalBill1 * 100.0) / 100.0;
        double PerPersonBeforeTip1 = cost / people;
        double PerPersonBeforeTip = Math.round(PerPersonBeforeTip1 * 100.0) / 100.0;
        double TipPerPerson1 = totalTip1 / people;
        double TipPerPerson = Math.round(TipPerPerson1 * 100.0) / 100.0;
        double TotalCostPerPerson1 = totalBill1 / people;
        double TotalCostPerPerson = Math.round(TotalCostPerPerson1 * 100.0) / 100.0;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + totalTip + "\n");
        result.append("Total Bill with tip: $" + totalBill + "\n");
        result.append("Per person cost before tip: $" + PerPersonBeforeTip + "\n");
        result.append("Tip per person: $" + TipPerPerson + "\n");
        result.append("Total cost per person: $" + TotalCostPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
