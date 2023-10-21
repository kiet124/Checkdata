/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211_check.data;
import java.util.Scanner;
/**
 *
 * @author dotha
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phone = "";
        String email = "";
        String date = "";

        while (phone.isEmpty()) {
            System.out.print("Enter phone number: ");
            phone = scanner.nextLine();
            String errorMessage = FormatChecker.checkPhone(phone);
            if (!errorMessage.isEmpty()) {
                System.out.println(errorMessage);
                phone = "";
            }
        }

        while (email.isEmpty()) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            String errorMessage = FormatChecker.checkEmail(email);
            if (!errorMessage.isEmpty()) {
                System.out.println(errorMessage);
                email = "";
            }
        }

        while (date.isEmpty()) {
            System.out.print("Enter date (dd/MM/yyyy): ");
            date = scanner.nextLine();
            String errorMessage = FormatChecker.checkDate(date);
            if (!errorMessage.isEmpty()) {
                System.out.println(errorMessage);
                date = "";
            }
        }

        System.out.println("All inputs are in the correct format.");
    }
}