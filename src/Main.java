public class Main {
    public static void main(String[] args) {
        float replenishment = 1100.5F;
        float balance = 100.75F;
        if (replenishment>1000) {
            float bonus=replenishment/100;
            int final_bonus=(int) bonus;
            float final_balance=balance+replenishment+final_bonus;
            System.out.println(final_balance);
        }
        else {
            float final_balance=balance+replenishment;
            System.out.println(final_balance);
        }
    }
}
