package main;

import java.util.Scanner;
import services.CredentialServices;
import model.Employee;

import model.Employee;

public class Driver {
    public static boolean isString(String company) {
        try {
            Integer.parseInt(company);
        } catch (NumberFormatException ex) {
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    Employee employee = new Employee("Gaurav", "Bhushan");
    CredentialServices service = new CredentialServices();
    Scanner sc = new Scanner(System.in);
    int option;
    String dept = "";
    String company = "";
    do {
        System.out.println("Please Enter the department from the following");
        System.out.println("..............................");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        System.out.println("..............................");
        option = sc.nextInt();
        System.out.println("Enter the company name");
        System.out.println("..............................");

        company = sc.next();

        if (Driver.isString(company)) {
            System.out.println("You have entered a valid company name");
            switch (option) {
            case 1:
                dept = "tech";
                break;
            case 2:
                dept = "admin";
                break;
            case 3:
                dept = "hr";
                break;
            case 4:
                dept = "legal";
                break;
            default:
                System.out.println("Invalid input");
            }
            service.showCredentials(employee, dept, company);
        } else {
            System.out.println("Company name is not valid. Please enter a valid name.");

        }

    } while (option != 0);
    sc.close();
}
}
