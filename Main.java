import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        int choice = 0;
        while (true){
            System.out.println(" 1- Most repeated value");
            System.out.println(" 2- Sort");
            System.out.println(" 3- Shuffle");
            System.out.println(" 4- Find the largest prime");
            System.out.println(" 5- Find the smallest prime");
            System.out.println(" 6- Check palindrome");
            System.out.println(" 7- Check sorted");
            System.out.println(" 8- Count primes");
            System.out.println(" 9- Reverse array");
            System.out.println("10- Shift array");
            System.out.println("11- Distinct array");
            System.out.println("12- Get the maximum 3 numbers");
            System.out.println("13- Get the minimum 3 numbers");
            System.out.println("14- Get average");
            System.out.println("15- Get median");
            System.out.println("16- Return only primes");
            System.out.println("17- Zero if less than zero");
            System.out.println("18- Execute all functions");
            System.out.println("19- Exit");
            System.out.println("Please enter your choice ... ");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                choice = Integer.parseInt(br.readLine());
            }
            catch (Exception e){
                System.out.println(e);}
            if (choice == 1){
                // Most repeated value
            }
            else if (choice == 2){
                // Sort
            }
            else if (choice == 3){
                // Shuffle
            }else if (choice == 4){
                // Find the largest prime
            }else if (choice == 5){
                // Find the smallest prime
            }else if (choice == 6){
                // Check palindrome
            }else if (choice == 7){
                // Check sorted
            }else if (choice == 8){
                // Count primes
            }else if (choice == 9){
                // Reverse array
            }else if (choice == 10){
                // Shift array
            }else if (choice == 11){
                // Distinct array
            }else if (choice == 12){
                // Get the maximum 3 numbers
            }else if (choice == 13){
                // Get the minimum 3 numbers
            }else if (choice == 14){
                // Get average
            }else if (choice == 15){
                // Get median
            }else if (choice == 16){
                // Return only primes
            }else if (choice == 17){
                // Zero if less than zero
            }else if (choice == 18){
                // Execute all functions
            }
            else
                break;  //exit
        }
    }

    public ArrayList<String> shift_array (ArrayList<String> arr) {
        ArrayList<String> shifted_arr = new ArrayList<>();
        shifted_arr.add(arr.get(arr.size()-1));
        for (int i = 0; i < arr.size() - 1; i ++)
            shifted_arr.add(arr.get(i));
        return shifted_arr;
    }
}
