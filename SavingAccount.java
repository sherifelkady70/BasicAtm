public class SavingAccount extends Account implements SavingInterface{
    private double savingBalance;


    public double getSavingBalance() {
        return savingBalance;
    }

    @Override
    public double calcSavingWithdraw(double amount) {
        savingBalance-=amount;
        return savingBalance;
    }

    @Override
    public double calcSavingDeposit(double amount) {
        savingBalance+=amount;
        return savingBalance;
    }

    @Override
    public void getSavingWithdrawInput() {
        System.out.println("the Saving balance is : "+moneyFormat.format(savingBalance));
        System.out.println("enter the money you want withdraw");
        double amount = input.nextDouble();
        if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("\n"+"the new saving balance is : "+moneyFormat.format(savingBalance));
        }else {
            System.out.println("sorry is negative number ");
        }
    }

    @Override
    public void getSavingDepositInput() {
        System.out.println("the saving balance is : "+moneyFormat.format(savingBalance));
        System.out.println("enter the money you want to deposit");
        double amount = input.nextDouble();
        if((savingBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("\n"+"the new saving balance is : "+moneyFormat.format(savingBalance));
        }else {
            System.out.println("sorry is negative number ");
        }
    }
}
