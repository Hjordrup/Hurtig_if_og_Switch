package if_else_switch;
import java.util.Scanner;
public class If {


    //psvm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indtast din alder");

        int alder = sc.nextInt();

        if (alder <18 ) {
            System.out.println("Du er ikke gamle nok til at bruge dette program");

        }else {
            System.out.println("Velkommen til programmet");
        }
    }



}
