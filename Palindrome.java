package JavaCodes;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int r;
         while(n>0){
             r=n%10;
             sum=(sum*10)+r;
             n=n/10;
         }

        if(sum==temp)
        {
            System.out.println("PALINDROME NUMBER");
        }
        else
        {
            System.out.println("NOT PALINDROME");
        }

    }
}
