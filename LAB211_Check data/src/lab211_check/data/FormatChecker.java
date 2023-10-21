/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_check.data;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author dotha
 */
public class FormatChecker {
    public static String checkPhone(String phone) {
        if (!Pattern.matches("\\d{10}", phone)) {
            return "Phone number must be 10 digits";
        }
        return "";
    }

    public static String checkEmail(String email) {
        if (!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
            return "Email must be in the correct format";
        }
        return "";
    }

    public static String checkDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return "Date must be in the correct format (dd/MM/yyyy)";
        }

        return "";
    }
}