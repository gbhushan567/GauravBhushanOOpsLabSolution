package services;

import java.util.Random;

import model.Employee;

public class CredentialServices {
public char[] generatePassword(int len) {
    String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Small_chars = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String symbols = "!@#$%^&*_=+/.?<>)(~";
    String values = Capital_chars + Small_chars + numbers + symbols;
    
    //using random method
    Random random = new Random();
    
    char[] password = new char[len];
    
    for (int i = 0; i < len; i++) {
        // Use of charAt() method : to get character value
        // Use of nextInt() as it is scanning the values as int
        password[i] = values.charAt(random.nextInt(values.length()));
    }
    return password;
}

public String generateEmailAddress(Employee employee, String dept, String company) {
    return employee.getFirstName() + employee.getLastName() + "." + dept + "@" + company + ".com";
}
public void showCredentials(Employee employee, String dept, String company) {
    System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
    System.out.println("Email---> " + generateEmailAddress(employee, dept, company));
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Password---> ");
    stringBuilder.append(generatePassword(8));
    System.out.println(stringBuilder.toString());
}
}
