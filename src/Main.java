public class Main {

    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        int ticketPrice = 500;
        int amountOfRub = 20;

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int totalBonusMile = ticketPrice / amountOfRub;
        System.out.println(totalBonusMile + " милей начислено. ");
    }
}
