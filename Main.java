//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Single dimensional array
            String[] products = {
                    "Cozy Nights Monarch mattress",
                    "Restonic Barbados mattress",
                    "Sealy Phuket mattress"
            };

            // Two dimensional array [3 products][3 months]
            int[][] sales = new int[3][3];

            for (int i = 0; i < products.length; i++) {
                System.out.println();
                for (int month = 0; month < 3; month++) {
                    System.out.print("Enter number of sales for month " + (month + 1) + " for " + products[i] + ": ");
                    sales[i][month] = scanner.nextInt();
                }
            }

            Product product = new Product(products, sales);
            PrintProduct printer = new PrintProduct(product);
            printer.PrintReport();

            scanner.close();
        }
    }


