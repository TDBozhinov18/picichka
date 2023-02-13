import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pizza> pizzas = new ArrayList<>();
        ArrayList<Topping> toppings = new ArrayList<>();

    }
    public static boolean isCorrectDoughUsed(Pizza pizza, String name) {
        return pizza.getDought().getDought().equalsIgnoreCase(name);
    }

    public static boolean isCorrectToppingInPizzaAsInList(Pizza pizza, ArrayList<Topping> toppings) {
        for (Topping topping: toppings) {
            if (topping.equals(pizza.getTopping()))
                return true;
        }
        return false;
    }

    public static boolean isCorrectPizzaName(Pizza pizza) {
        return (pizza.getName().trim() != "" && pizza.getName().length() <= 15);
    }

    public static boolean isInWeightMeasurment(Dought dought) {
        return (dought.getWeight() > 0 && dought.getWeight() <= 200);
    }

    public static double caloriesOfPizza(Pizza pizza) {
        return pizza.getDought().getWeight() + pizza.getTopping().getWeight() * 10;
    }
}

