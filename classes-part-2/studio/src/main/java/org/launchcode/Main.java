package org.launchcode;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        MenuItem ChaiTea = new MenuItem(3.14, "A tea to warm your cold heart", "Tea", true);
        MenuItem GarlicBurger = new MenuItem(3.75, "Greasy goodness", "Main", false);
        MenuItem BonelessWings = new MenuItem(5.00, "Sweet BBQ or Spicy Buffalo", "Appetizer", true);

        HashMap<MenuItem, , String, > menuMap = new HashMap<>();
//        menuMap.put(ChaiTea,"Chai Tea" );
//        menuMap.put(GarlicBurger, "Garlic Burger");
//        menuMap.put(BonelessWings, "Boneless Wings");

        for (String menu : menuMap.values()) {
            System.out.println(menu);
        }
    }
}
