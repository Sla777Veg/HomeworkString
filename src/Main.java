public class Main {
    public static void main(String[] args) {
        //Задача1
        String firstName = "Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println(firstName+middleName+lastName );
        System.out.println(fullName);
        //Задача2
        String fullName1 = fullName.toUpperCase();
        System.out.println(fullName1);
        //Задача3
        fullName = fullName.replace("Ivanov Ivan Ivanovich", "Иванов Семён Семёнович");
        fullName = fullName.replace("ё","е");
        System.out.println(fullName);
    }
}