package Bank;

/**语言字符串 */
public class Strings {

    /**欢迎 */
    static String welcome = "欢迎使用银行系统！" ;

    /** 登录菜单 */
    static String menu_login = 
        "1.登录\n" +
        "2.注册\n" +
        "3.退出";

    /** 主菜单 */
    static String menu_main = 
        "1.存款\n" +
        "2.取款\n" +
        "3.转账\n" +
        "4.查询余额\n" +
        "5.修改密码\n" +
        "6.返回登录界面";
    
    static String case_inexist = "选项不存在！" ;
    
    /**再见 */
    static String bye = "再见，欢迎下次使用！" ;

    /**登录相关 */
    static String account_id = "请输入账号：" ;
    static String wrong_account = "账号不存在！" ;
    static String wrong_pwd = "密码错误，请重新输入！" ;
    static String success_login = "登录成功！" ;
    static String login_welcome = "欢迎回来，" ;

    /**注册相关 */
    static String name = "请输入用户名：" ;
    static String password = "请输入密码：" ;
    static String confirm_pwd = "请再次输入密码：" ;
    static String success_register = "注册成功，请登录！" ;
    static String your_id = "您的账号为：" ;

    /**修改密码相关 */
    static String old_pwd = "请输入旧密码：" ;
    static String new_pwd = "请输入新密码：" ;
    static String same_pwd = "新密码不能与旧密码相同！" ;
    static String different_pwd = "两次输入的密码不一致！" ;
    static String change_pwd_success = "密码修改成功！" ;
    
    /**存取款相关 */
    static String amount = "请输入金额：" ;
    static String negative_amount = "金额不能为负数或零！";
    static String insufficient_balance = "余额不足！";
    static String success_deposit = "存款成功！" ;
    static String success_withdraw = "取款成功！" ;

    /**转账相关 */
    static String to_account_id = "请输入转账账号：" ;
    static String inexist_id = "转账账号不存在！" ;
    static String success_transfer = "转账成功！" ;
    static String balance = "您的余额为：" ;
}
