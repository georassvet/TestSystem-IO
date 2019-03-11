import dao.TestDAO;
import model.Answer;
import model.Question;
import model.Test;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestSystem {

    public static void start(){
        try {
            Test test = TestDAO.getTest();
            test.startTest();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void showMenu(){
        boolean alive =true;
        do {
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Начать тест");
            System.out.println("2. Добавить вопрос");
            System.out.println("3. Выйти");
            Scanner sc = new Scanner(System.in);

            switch (sc.next()){
                case "1":{
                    start();
                    break;
                }
                case "2":{
                    System.out.println("ToDo");
                    break;
                }
                case "3":{
                    alive=false;
                    break;
                }
            }
        }while (alive);
    }

    public static void main(String[] args) {
        showMenu();
    }
}
