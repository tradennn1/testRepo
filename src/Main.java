import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Практика

        //1
        String Yahoo = "Hello World";
        //2
        final int NUM = 89;
        //3
        String word = "300";
        //4
        Yahoo = NUM + word;
        //5
        System.out.println(Yahoo + NUM + word);
        //6
        if (NUM<0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM>0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }
        //789
        System.out.println("Введите ваше имя");
        Scanner MyTextInput = new Scanner(System.in);
        String MyText = MyTextInput.next();
        System.out.println("Привет! " + MyText);
    }
}
