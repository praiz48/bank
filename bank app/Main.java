import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List <Acct> bank= new ArrayList<>(Arrays.asList(new Acct("kelvin",200.3),
                                                        new Acct("john",310.4),
                                                        new Acct("paul", 250.89)));
        int user;
        double amount;
        int choice;
        do {
            System.out.println("select from user 1 -" + bank.size());
            user = scanner.nextInt() - 1;
        } while (user>bank.size() || user<0);
        Acct main_user = bank.get(user);
        main_user.check_details();
        do {
            System.out.println(" would you like to \n 1. deposit \n 2. withdraw \n 3. check balance \n 4. logout");
            choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("how much");
                    amount= scanner.nextInt();
                    main_user.deposit(amount);
                    break;
                case 2:
                    System.out.println("how much");
                    amount= scanner.nextInt();
                    main_user.withdraw(amount);
                    break;
                case 3:
                    main_user.check_details();
                    break;
                case 4:
                    System.out.println("goodbye");
                    
                    scanner.close();
                    break;
            
                default:
                    System.out.println("not in th options");
                    break;
            }
        } while (choice!=4);
        
        
    }
}