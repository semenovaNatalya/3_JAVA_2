public class Main {
    public static void main(String[] args) {
        int initialAmount;   //начальная сумма на счете клиента
        int refill;           //сумма пополнения счета
        int bonus;            //количество начисляемых бонусов
        int currentBalance;  //итоговый баланс клиента
        int limitBonus = 1000;
        initialAmount = 100;  //входные данные_1
        refill = 1100;          //входные данные_2
        if (refill > limitBonus) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        currentBalance = initialAmount + refill + bonus;
        System.out.println(bonus);
        System.out.println(currentBalance);
    }

}
