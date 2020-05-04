public class Main {
    public static void main(String[] args) {
        //Ввести текущий счет клиента в 4 строку после знака "="
        int balance = 100;
        //Ввести сумму пополнения счета в 6 строку после знака "="
        int refill = 1100;
        int bonusstep = 100;
        int newbalance;
        if (refill>=1000) {
            newbalance = balance+refill+refill/bonusstep;
        } else {
            newbalance = balance + refill;
        }
        System.out.println(newbalance);
    }
}


