package string;

/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы в формате "Ф.И.О". Учесть, что
 * входные параметры могут быть в любом регистре, а результирующая
 * строка должна быть в верхнем.
 */

public class Task3 {
    static void main() {
        System.out.println(getInitials("Vladislav", "Karmanchikov", "Andreevich"));
    }

    public static String getInitials(String firstName, String lastName, String patronymic) {
        return String.format(
            "%s.%s.%s",
            String.valueOf(lastName.charAt(0)),
            String.valueOf(firstName.charAt(0)),
            String.valueOf(patronymic.charAt(0))
        );
    }
}
