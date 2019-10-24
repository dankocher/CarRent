
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Auto> Cars = new ArrayList<>();


   public static void main(String[] args){
//     test();
       menu();
    }
//    private static void test(){
//        String color = "cplor";
//        String mark = "bmw";
//        String model = "x5";
//        String number = "15342";
//        int year = 1423;
//
//
//        for(int i = 0; i<5; i++){
//            Cars.add(auto);
//        }
//    }

    private static void menu(){
        System.out.println("1 - добавить машину\n2 - удалить машину\n3 - редактировать машину\n4 - показать все машины\n5 - найти машину по марке и модели\n6 - найти машину по номеру");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case (1):
                addCar();
               break;
            case (2):
                removeCar();
                break;
            case (3):
                editCar();
                break;
            case (4):
                showCars(true);
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

    private static void removeCar(){
       if(Cars.isEmpty()){
           System.out.println("Машин нет");
           menu();
       }
//       showCarsForRemove();
        showCars(false);
        System.out.println("Какую машину хотите удалить?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Cars.remove(n-1);
        System.out.println("Машина удалена. Хотите удалить еще?(yes/no)");
        String s = scanner.next();
        if(s.equalsIgnoreCase("yes")){
            removeCar();
        } else if(s.equalsIgnoreCase("no")){
            showCars(true);

        }

    }

    private static void showCars(Boolean showMenu ){
       int i = 1;
       for(Auto auto:Cars){
           System.out.println("-----"+i+"-----");
           i++;
           auto.show();
       }
       if(showMenu) {
           menu();
       }
    }

//    private static void  showCarsForRemove(){
//        int i = 1;
//        for(Auto auto:Cars){
//            System.out.println("-----"+i+"-----");
//            i++;
//            auto.show();
//        }
//    }

    private static void editCar(){
       if(Cars.isEmpty()){
           System.out.println("Машин нет");
           menu();
       }
       showCars(false);
       Scanner scanner = new Scanner(System.in);
       System.out.println("Какую машину хотите изменить?");
       int n = scanner.nextInt();
       Cars.get(n-1).show();
        System.out.println("Что хотите изменить?(марка/модель/номер/год/цвет)");
        String s = scanner.next();
        switch (s){
            case ("марка"):
                System.out.println("Введите новую марку машины");
                String ma = scanner.next();
                Cars.get(n-1).setMark(ma);
                System.out.println("Марка машины изменена");
                showCars(true);
                break;
            case ("модель"):
                System.out.println("Введите новую модель машины");
                String mo = scanner.next();
                Cars.get(n-1).setModel(mo);
                System.out.println("Модель машины изменена");
                showCars(true);
                break;
            case ("номер"):
                System.out.println("Введите новый номер машины");
                String num = scanner.next();
                Cars.get(n-1).setNumber(num);
                System.out.println("Номер машины изменен");
                showCars(true);
                break;
            case ("год"):
                System.out.println("Введите новый год машины");
                int y = scanner.nextInt();
                Cars.get(n-1).setYear(y);
                System.out.println("Год машины изменен");
                showCars(true);
                break;
            case ("цвет"):
                System.out.println("Введите новый цвет машины");
                String co = scanner.next();
                Cars.get(n-1).setColor(co);
                System.out.println("Цвет машины изменен");
                showCars(true);
                break;
        }


       }

    }

