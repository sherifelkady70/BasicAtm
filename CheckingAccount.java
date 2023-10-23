public class CheckingAccount extends Account implements CheckingInterface{
    private double checkingBalance;

    public double getCheckingBalance() {
        return checkingBalance;
    }

    @Override
    public double calcCheckingWithdraw(double amount) {
        checkingBalance-=amount;
        return checkingBalance;
    }

    @Override
    public double calcCheckingDeposit(double amount) {
        checkingBalance+=amount;
        return checkingBalance;
    }

    @Override
    public void getCheckingWithdrawInput() {
        System.out.println("the Checking balance is : "+moneyFormat.format(checkingBalance));
        System.out.println("enter money you ant to Withdraw ");
        double amount = input.nextDouble();
        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("the new checking balance is : "+moneyFormat.format(checkingBalance));

        }else {
            System.out.println("sorry the number is negative ");
        }
    }

    @Override
    public void getCheckingDepositInput() {
        System.out.println("the Checking balance is : "+moneyFormat.format(checkingBalance));
        System.out.println("enter money you ant to Deposit ");
        double amount = input.nextDouble();
        if((checkingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("the new checking balance is : "+moneyFormat.format(checkingBalance));

        }else {
            System.out.println("sorry the number is negative ");
        }
    }
}
