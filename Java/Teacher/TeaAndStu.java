
public class TeaAndStu {
	public static void main(String[] args) {
		Stu xh = new Stu();
//		Stu xg = xh;
		Teacher tW = new Teacher(xh);
		Teacher tZ = new Teacher();
		
		tW.ID = 383;
		tW.name = "zxh";
		
		xh.age = 17;
		xh.name = "wbl";
		xh.ID = 111;
		xh.mathS = 60;
		
//		xg.age = 17;
//		xg.name = "mxg";
//		xg.ID = 222;
//		xg.mathS = 65;
		
		tW.print();
		
		tW.teach();
		tZ.teach();
		
		xh.print();
//		t.print();
		
//		xg.print();
//		
//		xh.study();
//		
//		xg.print();
	}

}
class Teacher
{
	String name;
	int ID;
	Stu stu;
	
	Teacher()
	{}
	Teacher(Stu s)
	{
		stu = s;
	}
	
	void teach()
	{
		stu.study();
	}
	void print()
	{
		stu.print();
	}
}
class Stu
{
	int age;
	int ID;
	String name;
	double mathS;
	double engS;
	
	void study()
	{
		mathS++;
	}
	void print()
	{
		System.out.println("你好，"+name+"的math : "+mathS);
		//printf("%d",a);
	}
}

