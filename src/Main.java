public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");

        int ticketPrice = 13676; // стоимомть билета
        int oneMile = 20; // сумма начисленния за 1 милю

        int miles; // Объявляете переменные для количества милей
        if (ticketPrice < 0) {
            System.out.println("Стоимость билета не может быть отрицательной");
        } else {
            miles = ticketPrice / oneMile; // подсчёт количество милей
            System.out.println("Ваше количество миль: " + miles + ". Желаем хорошего полёта!");

        }
    }
}
