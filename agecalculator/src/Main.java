import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.GregorianCalendar;


// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //declare variable for age calculation
        int bornYear,currentYear,agrInYear;
        //get the bornYear from user as input
        bornYear= Integer.parseInt(JOptionPane.showInputDialog("Enter your born year"));
//        System.out.println(bornYear);
        //to get the current year from calendar
        GregorianCalendar calendar=new GregorianCalendar();
        currentYear=calendar.get(GregorianCalendar.YEAR);
        //to get the age inb year
        agrInYear=currentYear-bornYear;
        //tp show the age in dialog
        JOptionPane.showMessageDialog(null,"Your age is"+agrInYear);
    }
}