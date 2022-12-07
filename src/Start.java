import java.util.AbstractList;
import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {


        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your address?");
        house.address = scanner.nextLine();

        System.out.println("What is your floor number?");
        house.floorsNumber = scanner.nextInt();

        System.out.println("Resident names are....");
        house.residentsNames = scanner.next().split(",");


        System.out.printf(String.format("The address is %s ", house.getAddress()));
        System.out.printf("the floor number is  %d ", house.getFloorsNumber());
        System.out.printf("%s %s %s",(house.getResidentsNames()));




    }
}
