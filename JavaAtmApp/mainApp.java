import java.util.Scanner;

public class mainApp {

    public static void main(String[] args) {

        int age = 0;
        double balance = 0;
        String name = "";
        String lastName = "";
        Boolean wantsAccount;
        String response;
        String password;
        int i = 0;
        Scanner scanner = new Scanner(System.in); // example of instaneation
        int optionNumber = 0;
        int withdraw = 0;
        int accountBalance = 0; // this one holds all the values. 
        int deposit = 0;        
        int withdrawAmount = 0; 
        String answer = "";
        

        System.out.print(" Do you want to Open Bank Account (yes/no) ");
        response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("yes")) {
            System.out.print(" Enter Name: ");
            name = scanner.nextLine();
            System.out.print(" Enter Last Name: ");
            lastName = scanner.nextLine();
            System.out.print("Set a Password: ");
            password = scanner.nextLine();
            System.out.println(" Account created succesfully for " + name + " " + lastName);

           
           
            while (optionNumber != 5) {
                optionNumber = 0;
                answer = "";
                System.out.println(" 1. Withdraw");
                System.out.println(" 2. Deposit");
                System.out.println(" 3. Close account");
                System.out.println(" 4. Freeze Account");
                System.out.println(" 5. Exit");

                System.out.print("Choose an option: ");
                optionNumber = scanner.nextInt();
                answer = scanner.nextLine();
            

                    

                if (optionNumber == 1) {

                    System.out.println("Withdrawing ");
                    System.out.print("Enter the amount you want to withdraw : ");
                    withdraw = scanner.nextInt(); 
                    System.out.println("Account balance is " + accountBalance);
                    accountBalance -= withdraw;
                    System.out.println("Account balance is " + accountBalance);

                        
                    }
                  
               if (optionNumber == 2) {
                    System.out.println("Depositing...");
                    System.out.println("Enter amount to deposit: ");
                    deposit = scanner.nextInt();
                    accountBalance += deposit;
                    System.out.println("Account Balance: $" + accountBalance);

                      } 


                else if (optionNumber == 3) {
                    System.out.println("Closing account...");
                    System.out.println(" Do you want to delete your account: yes/no ");
                    answer = scanner.nextLine().trim().toLowerCase();
                    
                } 
                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Account successfully deleted");
                        accountBalance = 0;
                        optionNumber = 5;
                    } 
                    else if (answer.equalsIgnoreCase("no")) {
                        System.out.println("Account NOT deleted");

                    }

                 else if (optionNumber == 4) {
                    System.out.println("Freezing account...");
                    System.out.println("Account successfully frozen "); 
                } 
                else if (optionNumber == 5) {
                    System.out.println("Exiting...");

                } 
               // else {
                   // System.out.println("Invalid option. Please try again.");
               // }

               // System.out.println(); // blank line for spacing
            
            } 
        } 
    } 
} 



    // if (withdraw > accountBalance) {
                    //    System.out.println("Insufficient funds  account balance: $" + accountBalance);
                     //   }
                     //   else {
                        
                     //       accountBalance -= withdrawAmount; 
                      //      System.out.println("Withdrawal successful. New balance: $" + accountBalance);
                      //       }
// scanner.close();

// while ( i < 1 ) {
// System.out.println(" 1. Withdraw");
// System.out.println(" 2. Deposit");
// System.out.println(" 3. Close account");
// System.out.println(" 4. Freeze Account");
// System.out.println(" 5. Exit");
// i++;
// }

// optionNumber = scanner.nextInt();
// if (optionNumber == 1) {
// System.out.println(" withdrawing... ");
// } else if (optionNumber == 2) {
// System.out.println(" Depositing...");

// } else if (optionNumber == 3) {
// System.out.println(" Close account...");
// } else if (optionNumber == 4) {
// System.out.println("Freezing Account...");

// } else if (optionNumber == 5) {
// System.out.println("Exit.. ");
// }

// }
// }

// Account created successfully for user input
// else {
// System.out.print("Not a valid opiton");
// }

// else {
// System.out.println(" Have a nice day");
// }

// try {
// optionNumber = scanner.nextInt();
// } catch (Exception e) {
// System.out.println("Please enter a number:"); // notes
// }

//
// public static void main(String[] args) {
// Call the menu
// showBankMenu();
// }
// public static void main showBankMenu() {
// System.out.print(" 1. Withdraw");
// System.out.print(" 2. Deposit");
// System.out.print(" 3. Close account");
// System.out.print(" 4. Freeze Account");
// Syetem.out.print(" 5. Exit");
//

// learn breaks how to implemnet them .