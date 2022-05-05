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
    }
}