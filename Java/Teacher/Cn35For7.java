import java.util.Scanner;

public class Cn35For7 {

	public static void main(String[] args) {
		//int ran[7];
		int ran[] = new int[7];
		int user[] = new int[7];
		int level = 0;
		System.out.println("input 7 integer:");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < user.length; i++) {
			
			int userTemp = scanner.nextInt();
			if(userTemp>=1&&userTemp<=35)
			{
				//user[i] = userTemp;
				boolean flag = false;//不相等，要
				for (int j = 0; j < i; j++)
				{
					//System.out.println("\tcompare "+i+" and "+j+".");
					if(userTemp==user[j])
					{
						System.out.println("input again");
						flag = true;//不要它
						break;
						//不要这个temp，重新产生第i个数
					}
				}
				if(flag==false)
					user[i] = userTemp;
				else
					i--;
			}
			else
			{
				System.out.println("your number outof range");
				i--;
			}
			//System.out.println(userTemp);
		}
		//生成数组
		for (int i = 0; i < 7; i++) 
		{
			double b = Math.random();
			int temp = (int)(b*35+1);
			boolean flag = false;//不相等，要
			for (int j = 0; j < i; j++)
			{
				//System.out.println("\tcompare "+i+" and "+j+".");
				if(temp==ran[j])
				{
					flag = true;//不要它
					break;
					//不要这个temp，重新产生第i个数
				}
			}
			if(flag==false)
				ran[i] = temp;
			else
				i--;
		}
		//判断
		for (int i = 0; i < 7; i++) {
            // 内层循环遍历第二个数组
            for (int j = 0; j < 7; j++) {
                if (user[i]== ran[j]) {
                    level++;
                    break; // 找到后立即跳出内层循环
                }
            }
        }
		
		//打印数组
		System.out.println("your lottery numbers:");
		for (int i = 0; i < 7; i++) {
			System.out.print(user[i]+" ");
		}
		System.out.println();
		System.out.println("中国福利彩票35选7");
		for (int i = 0; i < 7; i++) {
			System.out.print(ran[i]+" ");
		}
		System.out.println();
		System.out.println("same number = "+level+"!");
		//关闭输入流
		scanner.close();
	}
}
