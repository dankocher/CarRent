import java.awt.*;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){


       menu();


    }

    private static void menu(){
        System.out.println("1 - добавить машину\n2 - удалить машину\n3 - редактировать машину\n4 - показать все машины\n5 - найти машину по марке и модели\n6 - найти машину по номеру");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case (1):
                addCar();
               break;
            case (2):
                System.out.println("2");
                break;
            case (3):
                System.out.println("3");
                break;
            case (4):
                showCars();
                break;
            case (5):
                System.out.println("5");
                break;
            case (6):
                System.out.println("6");
        }
    }

    public static void addCar(){
        ArrayList <Auto> Cars = new ArrayList<Auto>();
        Scanner scanner = new Scanner(System.in);
        Auto auto = new Auto();
        System.out.println("Введите марку машины");
        auto.setMark(scanner.next());
        System.out.println("Введите модель машины");
        auto.setModel(scanner.next());
        System.out.println("Введите номер машины");
        auto.setNumber(scanner.next());
        System.out.println("Введите год машины");
        auto.setYear(scanner.nextInt());
        System.out.println("Введите цвет машины");
        auto.setColor(scanner.next());
        Cars.add(auto);
        menu();



    }
    private static void showCars(){
        System.out.println();
        menu();
    }

}
