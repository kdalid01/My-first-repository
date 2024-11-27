import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printPerson();

        Scanner sc = new Scanner(System.in);
    }

    private static void printPerson() {
        var person01 = new PersonObject("John", "Willij", 40);
        System.out.println(person01);
    }
}