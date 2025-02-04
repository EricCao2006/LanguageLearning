//变量加法
class NumberPlus
{
    public static void main(String[] args)
    {
        //错误写法："1"+"2"=="12"
        System.out.println("1+2!="+"1"+"2");
        //正确写法：1+2==3
        System.out.println("1+2="+(1+2));
    }
}