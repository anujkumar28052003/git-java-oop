package com.company;
import java.util.Scanner;
public class Multi {


        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = s.nextInt();
            int b = s.nextInt();
            int c=0;
            for (int i=1;i<=b;i++)
            {
                c=c+a;
            }
            System.out.printf("The product of two numbers is %s%n",c);
        }



}
