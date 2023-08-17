package hello_world;
import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class txt {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Name:");
        String Firstname=sc.nextLine();
        System.out.println("Enter the Last Name:");
        String Lastname=sc.nextLine();
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the First Name:"  + Firstname);
        System.out.println("Enter the Last Name:" + Lastname);
        System.out.println("Enter the Age:" + age);
    }

}
