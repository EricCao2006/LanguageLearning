//if,else,switch语句的使用

import java.util.Scanner;
public class IfElseSwitch {
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        int result = 0;
        if (num < 0)
            result = -1;
        else if (num == 0)
            result = 0;
        else
            result = 1;
        switch(result)
        {
            case -1:
                System.out.println("负数");
                break;
            case 0:
                System.out.println("零");
                break;
            default:
                System.out.println("正数");
                break;
        }
        stdIn.close();
    }
}
