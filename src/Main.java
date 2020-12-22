public class Main {
    public static void main(String[] args) {
        float replenishment = 100.5F;
        float balance = 100.75F;
        if (replenishment>1000) {
            int bonus=(int) replenishment/100;
            balance=balance+replenishment+bonus;
        }
        else {
            balance=balance+replenishment;
             }
        System.out.println(balance);
    }
}
