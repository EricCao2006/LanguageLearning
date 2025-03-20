package Bank;

import java.util.Scanner;

/**主界面逻辑 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Strings.welcome);
        int choice = 1;
        while(true){
            /** 登录界面逻辑 */
            System.out.println(Strings.menu_login);
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            Cust cust;
            switch(choice){
                case 1:
                    cust=Bank.login();
                    break;
                case 2:
                    cust=Bank.register();
                    break;
                case 3:
                    System.out.println(Strings.bye);
                    System.exit(0);
                default:
                    System.out.println(Strings.case_inexist);
                    continue;
            }
            /** 主界面逻辑 */
            System.out.println(Strings.menu_main);
            choice = scanner.nextInt();
            scanner.close();
            switch(choice){
                case 1:
                    cust.deposit();
                    break;
                case 2:
                    cust.withdraw();
                    break;
                case 3:
                    cust.transfer();
                    break;
                case 4:
                    cust.query_balance();
                    break;
                case 5:
                    cust.change_pwd();
                    break;
                case 6:
                    break;
                default:
                    System.out.println(Strings.case_inexist);
                    continue;
            }
        }
    }
}
