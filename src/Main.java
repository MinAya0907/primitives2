public class Main {
    public static void main(String[] args) {

        int current = 500;
        int payment = 1001;
        int bonus = 0;


        if (payment > 1000) {
            bonus = payment / 100;

            System.out.println("Бонусные рубли: " + bonus);
        } else {
            System.out.println("Бонусные рубли: 0");
        }
        int result = current + payment + bonus;
        System.out.println("Итоговый счет: " + result);


    }
}