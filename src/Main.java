public class Main {
    public static void main(String[] args) {
        int initial_amount;   //начальная сумма на счете клиента
        int refill;           //сумма пополнения счета
        int bonus;            //количество начисляемых бонусов
        int current_balance;  //итоговый баланс клиента
        initial_amount = 100;  //входные данные_1
        refill = 1100;          //входные данные_2
        if (refill >= 1000) {
            bonus = 1 * refill / 100;
            current_balance = initial_amount + refill + bonus;
            System.out.println("Ваши бонусы");
            System.out.println(bonus);
            System.out.println("Ваш текущий баланс");
            System.out.println(current_balance);
        } else {
            current_balance = initial_amount + refill;
            System.out.println("Бонусы Вам не начислены");
            System.out.println("Ваш текущий баланс");
            System.out.println(current_balance);
        }
    }

}
