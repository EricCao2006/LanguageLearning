//输入与输出

import java.util.Scanner;

public class InputAndOutput 
{
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner stdIn = new Scanner(System.in);
        //创建变量并读取输入
        int i=stdIn.nextInt();
        double d=stdIn.nextDouble();
        String s=stdIn.next();
        //输出变量
        System.out.println("整数"+i);
        System.out.println("浮点数"+d);
        System.out.println("字符串"+s);
        //关闭Scanner对象
        stdIn.close();
    }
}
