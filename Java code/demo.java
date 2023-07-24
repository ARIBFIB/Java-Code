

public class demo{
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=300;

        int Total_money_in_wallet_RS=600;

        int purchase_product_RS=130;
        int Available_product_RS=150;

        int Remianing_money_Wallet=Total_money_in_wallet_RS-purchase_product_RS;



        System.out.println("How much do you have money in the wallet ? ");
        System.out.println("I have money in my wallet is :"+ Total_money_in_wallet_RS + "RS");

        System.out.println("How much do you spend money in market ? ");
        System.out.println("I have send money in market is :" + purchase_product_RS + "RS");

        System.out.println("How much Market have available Products in RS ?");
        System.out.println("The available Product in market is :"+Available_product_RS + "RS");

        System.out.println("How much Money is available in your Wallet ? ");
        System.out.println("Available Money in Wallet :"+Remianing_money_Wallet+ "RS");




    }
}



