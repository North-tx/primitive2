public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balans = 100;
        int add = 1350;
        int bonus = add / 100;
        if (add > 100) {
            balans = balans + add + bonus;
        } else {
            balans = balans + add;
        }
        System.out.println("Итоговый баланс = "+balans+"; Количество бонусных рублей = "+bonus);
    }
}
