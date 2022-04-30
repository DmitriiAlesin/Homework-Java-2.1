public class Main {
    public static void main(String[] args) {

        int balanceBefore = 100; //сумма на балансе до внесения

        int summaReplenishment = 1100; //сумма пополнения

        int minLimit = 100; //если больше этой суммы то рассчитывется бонус

        int limitBonus = 100; //бонус за каждые minLimit

        int bonusSumma;

        if (summaReplenishment > minLimit) {

            bonusSumma = summaReplenishment / limitBonus;

        } else {

            bonusSumma = 0;
        }
        System.out.println("Итоговая сумма :");
        System.out.println(balanceBefore + summaReplenishment + bonusSumma);
        System.out.println("Сумма баллов :");
        System.out.println(summaReplenishment / limitBonus);
    }

}