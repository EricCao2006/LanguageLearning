package Bank;

import java.util.Scanner;

/**客户类*/
public class Cust {

    /**客户信息 */
    String name;
    long ID;
    /**默认密码为八个0 */
    int password = 00000000;
    /**默认余额为0 */
    int amount = 0;

    /**客户权限 */
    
    /**存款 */
    public void deposit(){
        System.out.println(Strings.amount);
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if(amount < 0){
            System.out.println(Strings.negative_amount);
        }
        else{
            this.amount += amount;
            System.out.println(Strings.success_deposit);
        }
        scanner.close();
    }
    
    /**取款,需要输入密码 */
    public void withdraw(){
        System.out.println(Strings.password);
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();
        if(password == this.password){
            System.out.println(Strings.amount);
            int amount = scanner.nextInt();
            if(amount < 0){
                System.out.println(Strings.negative_amount);
            }
            else if(amount > this.amount){
                System.out.println(Strings.insufficient_balance);
            }
            else{
                this.amount -= amount;
                System.out.println(Strings.success_withdraw);
            }
        }
        else{
            System.out.println(Strings.wrong_pwd);
        }
        scanner.close();
    }
    
    /**转账,需要输入密码 */
    public void transfer(){
        System.out.println(Strings.password);
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();
        if(password == this.password){
            System.out.println(Strings.amount);
            int amount = scanner.nextInt();
            if(amount < 0){
                System.out.println(Strings.negative_amount);
            }
            else{
                System.out.println(Strings.to_account_id);
                long to_account_id = scanner.nextLong();
                Cust to_account = Accounts.getAccount(to_account_id);
                if(to_account == null){
                    System.out.println(Strings.inexist_id);
                }
                else{
                    if(amount > this.amount){
                        System.out.println(Strings.insufficient_balance);
                    }
                    else{
                        this.amount -= amount;
                        to_account.amount += amount;
                        System.out.println(Strings.success_transfer);
                    }
                }
            }
        }
        else{
            System.out.println(Strings.wrong_pwd);
        }
        scanner.close();
    }    
    
    /**查询余额,需要输入密码 */
    public void query_balance(){
        System.out.println(Strings.password);
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();
        if(password == this.password){
            System.out.println(Strings.balance + this.amount);
        }
        else{
            System.out.println(Strings.wrong_pwd);
        }
        scanner.close();
    }
    
    /**修改密码 */
    public void change_pwd(){
        while (true){
            System.out.println(Strings.old_pwd);
            Scanner scanner = new Scanner(System.in);
            int old_pwd = scanner.nextInt();
            /**旧密码正确则进入修改密码流程 */
            if(old_pwd == this.password){  
                while (true){
                    System.out.println(Strings.new_pwd);
                    int new_pwd = scanner.nextInt();
                    System.out.println(Strings.confirm_pwd);
                    int confirm_pwd = scanner.nextInt();
                    /**两次输入的密码相同则修改成功*/
                    if(new_pwd == confirm_pwd){
                        this.password = new_pwd;
                        System.out.println(Strings.change_pwd_success);
                        scanner.close();
                        break;
                    }
                    /**否则提示错误 */
                    else{
                        System.out.println(Strings.different_pwd);
                        continue;
                    }
                }
                break;
            }
            /**否则提示错误 */
            else{
                System.out.println(Strings.wrong_pwd);
                continue;
            }
        }
    }

}
