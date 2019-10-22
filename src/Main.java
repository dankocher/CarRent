import java.awt.*;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Auto> Cars = new ArrayList<>();
    Auto auto = new Auto();

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

    private static void addCar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку машины");
        String mark = scanner.next();
        System.out.println("Введите модель машины");
        String model = scanner.next();
        System.out.println("Введите номер машины");
        String number = scanner.next();
        System.out.println("Введите год машины");
        int year = scanner.nextInt();
        System.out.println("Введите цвет машины");
        String color = scanner.next();
        Auto auto = new Auto(color, mark, model, number, year);
        Cars.add(auto);
        menu();



    }
    private static void showCars(){

       for(int i = 0; i<Cars.size(); i++){

       }


        menu();
    }

}
