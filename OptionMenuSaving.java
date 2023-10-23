import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenuSaving extends SavingAccount{
    DecimalFormat moneyFormat = new DecimalFormat("'$'##,##");
    HashMap<Integer,Integer> data = new HashMap<>();
    Scanner menuInput = new Scanner(System.in);

    public void login(){
        int x=1;
        do{
            try {
                data.put(333,111);
                data.put(444,222);
                System.out.println("enter the customer number : ");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("enter the pin number : ");
                setPinNumber(menuInput.nextInt());
            }catch (Exception e){
                System.out.println("sorry not characters numbers only ");
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if(data.containsKey(cn) && data.get(cn)==pn){
                getSavingAccount();
            }else {
                System.out.println("wrong customer number or pin number ");
                x=2;
            }

        }while(x==1);
    }

    public void getSavingAccount(){
        System.out.println("---------Welcome Saving Account--------");
        System.out.println("1-View Balance ");
        System.out.println("2-Withdraw");
        System.out.println("3-Deposit");
        System.out.println("4-Exit");
        int selection = input.nextInt();
        switch (selection){
            case 1:
                System.out.println("the saving balance is : "+moneyFormat.format(getSavingBalance()));
                getSavingAccount();
                break;
            case 2:
                getSavingWithdrawInput();
                getSavingAccount();
                break;
            case 3:
                getSavingDepositInput();
                getSavingAccount();
                break;
            case 4:
                System.out.println("thanks .. goodbye");
            default:
                System.out.println("sorry is wrong choice ");
                getSavingAccount();
                break;

        }
    }
}
