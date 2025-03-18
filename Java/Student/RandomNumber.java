//用随机数生成随机日期

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int year=rand.nextInt(2025);
        int month=rand.nextInt(12);
        int day=rand.nextInt(31);
        System.out.println("随机日期："+year+"-"+month+"-"+day);
    }
}
