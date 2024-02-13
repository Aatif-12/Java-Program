public class profit {
    public static void main(String[] args) {
        double income = 10000000.00;
        double expence = 7000000.00;
        double profit = income-expence;
        double profitpercentage = (profit*0.1);

        if(profit > 0){
            System.out.println("Company is in profit");
            System.out.println(profitpercentage);
        }

        else {
            System.out.println("Company is in Loss");
        }
    }
}
