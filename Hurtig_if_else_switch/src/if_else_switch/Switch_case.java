package if_else_switch;
import java.util.Scanner;
public class Switch_case {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast dit navn");
        String name = sc.nextLine();
        System.out.println("Uge dag i tal");
        int ugeDag = sc.nextInt();

        switch (ugeDag) {
            case 1:
                System.out.println(name + " Det er idag Mandag");
                break;
            case 2:
                System.out.println(name + " Det er idag Tirsdag");
                break;
            case 3:
                System.out.println(name + " Det er idag Ondsdag");
                break;
            case 4:
                System.out.println(name + " Det er idag Torsdag");
                break;
            case 5:
                System.out.println(name + " Det er idag Fredag");
                break;
            case 6:
                System.out.println(name + " Det er idag Lørdag");
                break;
            case 7:
                System.out.println(name + " Det er idag Søndag");
                break;
        }

    }






}
