public class Main {
    public static void main(String[] args) {

        int balanceBefore = 100; //сумма на балансе до внесения

        int summaPopolnenie = 1100; //сумма платежа

        int minLimit = 100; //если больше этой суммы то рассчитывется бонус

        int limitBonus = 100; //бонус за каждые minLimit

        int bonusSumma;

        if (summaPopolnenie > minLimit) {

            bonusSumma = summaPopolnenie / limitBonus;

        } else {

            bonusSumma = 0;
        }
        System.out.println("Итоговая сумма :");
        System.out.println(balanceBefore + summaPopolnenie + bonusSumma);
        System.out.println("Сумма баллов :");
        System.out.println(summaPopolnenie / limitBonus);
    }

}