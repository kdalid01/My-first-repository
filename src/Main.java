import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var person01 = new PersonObject("John", "Willij", 40);
        System.out.println(person01);

        Scanner sc = new Scanner(System.in);

        var person02 = new PersonObject("Julia", "Kinky", 42);
        System.out.println(person02);
    }
}