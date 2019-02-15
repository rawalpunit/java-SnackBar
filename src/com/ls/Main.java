package com.ls;

public class Main
{

    public static void main(String[] args)
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food  = new VendingMachine("Food");
        VendingMachine drink  = new VendingMachine("Drink");
        VendingMachine office  = new VendingMachine("Office");

        Snack chips = new Snack("Chips",36, 1.75, food.getId());
        Snack chocBar = new Snack("Chocolate Bar",36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzels",30, 2.00, food.getId());
        Snack soda = new Snack("Soda",24, 2.50, drink.getId());
        Snack water = new Snack("Water",36, 2.75, drink.getId());

        soda.buyQty(3);
        System.out.println("Sodas remaining " + soda.getQty());

        jane.buyStuff(soda.getTotalCost(3));
        System.out.println("Jane's cash " + jane.getCashOnHand());




    }

}
