package Pizzas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to have a veg pizza Type YES or NO");

        String ans = sc.next();

        Pizza pizza;

        if(ans.equals("YES")){
            pizza = new Pizza(true);
        }else{
            pizza = new Pizza(false);
        }

        /*
        Adding extra cheese
         */

        System.out.println("Would you like a extra Cheese : YES / NO");

        String extraCheeseAns = sc.next();

        if(extraCheeseAns.equals("YES")){
            pizza.addExtraCheese();
        }

        /*
            Extra toppings
         */

        System.out.println("Would you like a extra Toppings : YES / NO");

        String extraToppingsAns = sc.next();

        if(extraToppingsAns.equals("YES")){
            pizza.addExtraToppings();
        }



        System.out.println("Would you like a Paper Bag : YES / NO");

        String paperBagAns = sc.next();

        if(paperBagAns.equals("YES")){
            pizza.paperBagAdded();
        }

        System.out.println("Total amount is : "+pizza.getTotalPrice());

        //Bill angle



        System.out.println("Would you like a generate Bill : YES / NO");

        String BillAns = sc.next();

        if(BillAns.equals("YES")){
            String bill = pizza.getBill();
            System.out.println(bill);
        }
    }


}