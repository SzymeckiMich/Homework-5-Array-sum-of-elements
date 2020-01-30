import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] table = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5;i++){
            System.out.println("Enter " + (i+1) + " number");
            table[i]=scan.nextInt();
        }
        System.out.println("Sum of 1, 3 and 5 number is = " + (table[0]+table[2]+table[4]));
    }
}
