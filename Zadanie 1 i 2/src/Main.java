//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void Zadanie1(){
        int a = 200;
        int b = 100;
        int c;
        c = a + b;
        System.out.println("Wynik do zadania 1 = "+c);

    }
    public static void Zadanie2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe");
        int a = sc.nextInt();
        System.out.println("Wprowadz druga liczbe");
        int b = sc.nextInt();
        sc.close();
        if( a>0 && b>0){
            System.out.println("Liczby wieksze od zera");
        }
        else {
            System.out.println("jedna z liczb mniejsza od zera");
        }
    }

    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        Zadanie1();
        System.out.println("Zadanie 2");
        Zadanie2();
        

    }
}