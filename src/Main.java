import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Видео из урока
        String phone = "900-345 84 76";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79003458476";
        if (phone.equals(expectedPhone)) {//сравнение без учета регистра equalsIgnoreCase
            System.out.println("успех");
        } else {
            System.out.println("неудача");
        }

        //Задание 1
        System.out.println("----------Задание 1:-------------");
        String firstName = "Ivan";
        String middleName  = "Ivanovich";
        String lastName  = "Ivanov";
        String fullName   =  lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2
        System.out.println("----------Задание 2:-------------");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задание 3
        System.out.println("----------Задание 3:-------------");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника  — " + fullName);

        //Задания повышенной сложности

        //Задание 5
        //К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        System.out.println("----------Задание 5:-------------");

        fullName = "Ivanov Ivan Ivanovich";
        int firstWhitespace = fullName.indexOf(' ');
        int secondWhitespace = fullName.indexOf(' ', firstWhitespace + 1);
        firstName = fullName.substring(firstWhitespace + 1, secondWhitespace);
        lastName = fullName.substring(0, firstWhitespace + 1);
        middleName = fullName.substring(secondWhitespace + 1);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        //Задание 6
        //Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        //Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.

        System.out.println("----------Задание 6:-------------");

        fullName = "ivanov ivan ivanovich";
        firstWhitespace = fullName.indexOf(' ');
        secondWhitespace = fullName.indexOf(' ', firstWhitespace + 1);
        char[] charedFullName = fullName.toCharArray();
        charedFullName[0] = Character.toUpperCase(charedFullName[0]);
        charedFullName[firstWhitespace + 1] = Character.toUpperCase(charedFullName[firstWhitespace + 1]);
        charedFullName[secondWhitespace + 1] = Character.toUpperCase(charedFullName[secondWhitespace + 1]);
        fullName = new String(charedFullName);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);

        //Задание 7
        //Имеется две строки.
        //Первая: "135"
        //Вторая: "246"
        //Соберите из двух строк одну, содержащую данные "123456".
        //Использовать сортировку нельзя.

        System.out.println("----------Задание 7:-------------");

        String firstLine = "135";
        String secondLine = "246";
        StringBuilder newLine = new StringBuilder();
        for (int i = 0; i < firstLine.length(); i++) {
            newLine.insert(newLine.length(), firstLine.charAt(i));
            newLine.insert(newLine.length(), secondLine.charAt(i));
        }
        System.out.println("Данные строки — " + newLine);

        //Задание 8
        //Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        //Нужно найти и напечатать буквы, которые дублируются в строке.
        //Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
        //В итоге в консоль должен быть выведен результат программы: "acdgijk".

        System.out.println("----------Задание 8:-------------");

        String nextLine = "aabccddefgghiijjkk";
        StringBuilder finishLine = new StringBuilder();
        for (int i = 0; i < nextLine.length()-1; i++) {
            if (nextLine.charAt(i) == nextLine.charAt(i+1)) {
                finishLine.insert(finishLine.length(), nextLine.charAt(i));
            }
        }
        System.out.println("Данные строки — " + finishLine);
    }
}