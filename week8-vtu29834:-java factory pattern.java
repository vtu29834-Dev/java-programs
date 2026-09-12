import java.util.*;

interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equals("pizza")) {
            return new Pizza();
        } else {
            return new Cake();
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String order = sc.nextLine();

        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(order);

        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());

        sc.close();
    }
}
output:-
  The factory returned class Cake
Someone ordered a Dessert!
