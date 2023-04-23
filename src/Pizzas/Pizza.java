package Pizzas;

public class Pizza {

    private boolean isVeg;

    private int totalPrice;

    private int extraCheesePrice;

    private int paperBagPrice;

    private int toppingsPrice;

    private String bill;

    Pizza(boolean isVeg){

        if(isVeg){
            totalPrice = 300;
            this.bill = "Base Price of Veg Pizza :"+300 +"\n";
        }else{
            totalPrice = 400;
            this.bill = "Base Price Of Non Veg Pizza : "+400 +"\n";

        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;

        if(isVeg){
            this.toppingsPrice = 70;
        }else{
            this.toppingsPrice = 120;
        }

    }

    public void addExtraCheese(){
        totalPrice = totalPrice + extraCheesePrice;

        this.bill = this.bill + "Extra cheese added :"+extraCheesePrice+"\n";
    }

    public void addExtraToppings(){
        totalPrice = totalPrice + toppingsPrice;
        this.bill = this.bill + "Extra Toppings added :"+toppingsPrice+"\n";
    }

    public void paperBagAdded(){
        totalPrice = totalPrice + paperBagPrice;
        this.bill = this.bill + "Paper Bag added :"+paperBagPrice+"\n";
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public String getBill(){
        this.bill = this.bill + "Total Bill Price is :"+totalPrice+"\n";
        return bill;
    }


}
