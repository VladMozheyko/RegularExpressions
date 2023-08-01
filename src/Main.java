import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /*
    Задача
    Сделаем проверку на валидность имени
    Сделаем проверку на валидность пароля
     */


    static Scanner scanner = new Scanner(System.in);
    // TODO Модифицровать выражения для королей, т.е додавить в конце обязательное требование римских цифр, например: Ludovik XVII
    static String regex =  "^([A-Z][a-z]*\\s+)*[A-Z][a-z]*$";// = ([A-Z][a-z]*)((\\s{1}[A-Z][a-z]*)|$)*"; // Выражение объединяет одну большую букву, любое количество маленьких и пробел между словами любое количество раз

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(regex); // Проверяем регулярное выражение
        Matcher matcher;                          // Создаем ссылку на объект
        System.out.println("Введите имя");
        String str = scanner.nextLine();          // Получаем строку
        matcher = pattern.matcher(str);           // Передаем строку, по которой будем проверять в объект matcher
        System.out.println(matcher.matches());    // Выводим результат

    }

    /*
    ДЗ
    Сделать шаблон для пароля:
    1) Не менее 15 символов и не более 50
    2) Должны сочетаться большие и маленькие символы в первых 5 позициях   -> HhUjK
    3) После 5 позиции должен быть специальный символ: # @ $ % &
    4) После специального символа одна из чисел 1 4 5 7
    5) Дальше любые буквы кроме H , u F  возможны символы $ # %

     */
}
