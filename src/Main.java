public class Main {
    public static void main(String[] args) {
        int accountAmount = 100;
        int transferAmount = 3100;
        int bonusRubles;
        int bonusConditions = 100;
        int finalInvoice;

        if (transferAmount > 1000) {
            bonusRubles = transferAmount/bonusConditions;
            finalInvoice = accountAmount + transferAmount + bonusRubles;
        } else {
            finalInvoice = accountAmount + transferAmount;
            bonusRubles = 0;
        }

        System.out.println(finalInvoice);
        System.out.println(bonusRubles);
    }
}