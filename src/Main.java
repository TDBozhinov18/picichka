import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pizza> pizzas = new ArrayList<>();
    }

    

    public static void printAllInfo(ArrayList<Pizza> pizzas) {
        for (Pizza h : pizzas) {
            System.out.println(h.getName().toString());
        }
    }

}

