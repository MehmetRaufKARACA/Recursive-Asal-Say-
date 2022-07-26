import java.util.Scanner;

public class AsalSayi{

    static boolean isPrime(int a, int b){
        if(a <= 2)
            return (a == 2) ? true : false;
        if(a % b == 0)
            return false;
        if(b * b > a)
            return true;  
            
         return isPrime(a, b + 1);   
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz : ");
        number = scan.nextInt();

        if(isPrime(number, 2)){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }

    }
}