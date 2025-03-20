package Bank;

import java.util.Scanner;
import java.time.Clock;

/**账户处理 */
public class Bank {

    /**ID生成 
     * 8位时间戳+4位随机数
    */
    public static long generateID() {
        /**获取时间戳前8位 */
        long timestamp = Clock.systemDefaultZone().millis();
        String timestampStr = String.valueOf(timestamp);
        String idStr = timestampStr.substring(0, 8);
        /**获取随机数4位 */
        int random = (int) (Math.random() * 10000);
        String randomStr = String.valueOf(random);
        /**拼接ID */
        String finalIdStr = idStr + randomStr;
        return Long.parseLong(finalIdStr);
    }

    /**注册账户 */
    public static Cust register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Strings.name);
        String name = scanner.nextLine();
        scanner.nextLine();//清除缓冲区
        while (true){
            System.out.println(Strings.password);
            int password = scanner.nextInt();
            System.out.println(Strings.confirm_pwd);
            scanner.nextLine();//清除缓冲区
            String confirm_pwd = scanner.nextLine();
            /**创建账户并存储到字典accounts中*/
            if (password == Integer.parseInt(confirm_pwd)) {
                System.out.println(Strings.success_register);
                long ID = generateID();
                System.out.println(Strings.your_id + ID);
                Cust cust = new Cust();
                cust.ID = ID;
                cust.name = name;
                Accounts.accounts.put(ID, cust);
                scanner.close();
                return cust;
            } 
            /**两次输入密码不一致 */
            else {
                System.out.println(Strings.different_pwd);
                continue;
            }
        }
    }

    /**登录账户 */
    public static Cust login() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(Strings.account_id);
            long ID = scanner.nextLong();
            scanner.nextLine();//清除缓冲区
            Cust cust = Accounts.accounts.get(ID);
            if (cust == null) {
                System.out.println(Strings.wrong_account);
                continue;
            }
            System.out.println(Strings.password);
            int password = scanner.nextInt();
            if (cust.password == password) {
                System.out.println(Strings.success_login);
                scanner.close();
                return cust;
            }
            System.out.println(Strings.wrong_pwd);
        }
    }
}
