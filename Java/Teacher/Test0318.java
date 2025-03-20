
import java.util.Scanner;

public class Test0318
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cust st = new Cust();
//		Cust st1 = new Cust();
//		Cust st2 = new Cust();
//		Cust st3 = new Cust();
//		
//		st.init(100,111,111,"zxh");
//		st1.init(200,222,222,"zxg");
//		st2.init(300,333,333,"zxf");
//		st3.init(400,444,444,"zxm");
		
		Cust st[] = new Cust[4];
		
		st[0] = new Cust();
		st[1] = new Cust();
		st[2] = new Cust();
		st[3] = new Cust();
		
		st[0].init(100,111,111,"zxh");
		st[1].init(200,222,222,"zxg");
		st[2].init(300,333,333,"zxf");
		st[3].init(400,444,444,"zxm");
		
		
		while (true)
		{
			System.out.println("input your ID");
			int newID = new Scanner(System.in).nextInt();
			switch (newID)
			{
			case 111:
				st[0].run();
				break;
			case 222:
				st[1].run();
				break;
			case 333:
				st[2].run();
				break;
			case 444:
				st[3].run();
				break;
			default:
				break;
			}
			System.out.println("switch off? Y_off;N_on");
			String comm= new Scanner(System.in).next();
			if(comm.equals("Y"))
			{
				System.out.println(comm+"  47");
				break;
			}
			System.out.println(comm+"  50");
		}
		System.out.println("byebye");
	}
}
//需求
class Cust
{
	
	String name;
	int ID;
	int cash;
	int password;
	
	void init(int c,int id,int p,String n)
	{
		cash = c;
		ID = id;
		password = p;
		name = n;
	}
	
	void run()
	{
		boolean flag = true;
		while(flag)
		{
			System.out.println("-----------Menu----------");
			System.out.println("-----save 1----");
			System.out.println("-----withdraw 2-------");
			System.out.println("-----print 3-------");
			System.out.println("-----exit  0-------");
			int com = new Scanner(System.in).nextInt();
			switch (com) {
			case 1:
				saveC();
				break;
			case 2:
				withDC();
				break;
			case 3:
				print();
				break;
			case 0:
				flag = false;
				break;
			default:
				break;
			}
		}
	}

	void saveC()
	{
		System.out.println("input your save number");
		int newC = new Scanner(System.in).nextInt();
		cash += newC;
	}
	void withDC()
	{
		System.out.println("input your withdraw number");
		int newC = new Scanner(System.in).nextInt();
		cash -= newC;
	}
	void print()
	{
		System.out.println(name+" cash = "+cash);
	}
}
