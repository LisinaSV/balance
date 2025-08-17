public class Main {
    public static void main(String[] args) {
        int remains = 100;
        int payment = 1100;

        int bonus = payment / 100;
        if (payment < 1000) {
            bonus = 0;
        } else {
            bonus = payment/100;
        }
        int balance = payment + bonus + remains;
        System.out.println("Сумма на счете:" + balance);
    }
}