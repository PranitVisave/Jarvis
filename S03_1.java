import java.util.Scanner;

public class S03_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cities (n): ");
        int n = sc.nextInt();

        String[] cities = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            cities[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (cities[j].compareTo(cities[j + 1]) > 0) {
                    String temp = cities[j];
                    cities[j] = cities[j + 1];
                    cities[j + 1] = temp;
                }

        System.out.println("\nCities in ascending order:");
        for (int i=0; i<n;i++) {
            System.out.println(cities[i]);
        }

        sc.close();
    }
}
