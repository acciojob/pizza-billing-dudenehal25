package com.driver;

public class Pizza {

    private int price = 0;
    private final Boolean isVeg;
    private String bill = "";

    boolean isCheseAdded = false;
    boolean isTopingAdded = false;
    boolean addTakeAway = false;

    boolean isBiiled = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here

        if(isVeg){
            bill = bill + "Base Price Of The Pizza: 300\n";
            price = price + 300;
        }
        else{
            bill = bill + "Base Price Of The Pizza: 400 \n";
            price = price + 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheseAdded){
            isCheseAdded = true;
            bill = bill + "Extra Cheese Added: 80\n";
            price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopingAdded && isVeg){
            bill = bill + "Extra Toppings Added: 70\n";
            price += 70;
            isTopingAdded = true;
        } else if (!isTopingAdded) {
            bill = bill + "Extra Toppings Added: 120\n";
            price += 120;
            isTopingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!addTakeAway){
            bill =  bill + "Paperbag Added: 20\n";
            price += 20;
            addTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBiiled){
            return "";
        }
        else {
            bill = bill + "Total Price: " + price + "\n";
            isBiiled = true;
            return this.bill;
        }
    }
}
