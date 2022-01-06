package com.familyIncomeAndExpensesSoftware;

public class FamilyAccount {
    public static void main(String[] args) {
        int balance = 10000;
        boolean isFlag = true;
        String details = ("Income-Expense" + "\t" + "AccBalance" + "\t" + "In-ExBalance" + "\t" + "Statement" + "\n");

        while (isFlag) {
            System.out.println("----------------Family Account Software------------------------\n");
            System.out.println("                1 Account Details");
            System.out.println("                2 Income Record");
            System.out.println("                3 Expense Record");
            System.out.println("                4 Quit\n");
            System.out.print("                Select <1-4> :");

            char selection = Utility.readMenuSelection();

            switch (selection) {

                case '1':
                    //System.out.println("                1 Account Details");

                    System.out.println("----------------Current In-Ex Details Record----------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------------------\n");
                    break;

                case '2':
                    //System.out.println("                2 Income Record");

                    System.out.print("Amount of income this time :");
                    int addMoney = Utility.readNumber();
                    System.out.print("This income statement :");
                    String addInfo = Utility.readString();
                    balance += addMoney;

                    details += ("Income" + "\t\t\t" + balance + "\t\t\t" + addMoney + "\t\t\t" + addInfo + "\n");


                    break;

                case '3':
                    //System.out.println("                3 Expense Record");

                    System.out.print("Amount of expense this time :");
                    int minusMoney = Utility.readNumber();
                    System.out.print("This expense statement :");
                    String minusInfo = Utility.readString();
                    if (balance >= minusMoney){
                        balance -= minusMoney;
                        details += ("Expense" + "\t\t\t" + balance + "\t\t\t" + minusMoney + "\t\t\t" + minusInfo + "\n");
                    }else{
                        System.out.println("Expenditure exceeds the account limit and payment fails");
                    }
                    break;

                case '4':
                    //System.out.println("                4 Quit\n");

                    System.out.print("Confirm to exit?(Y/N) :");

                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;



            }
        }
    }
}
