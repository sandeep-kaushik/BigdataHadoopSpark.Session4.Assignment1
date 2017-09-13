package assignment;

class sum1
{
	public  int Sum1(int x,int y)
	{
		return(x+y);
    }

public  int Sum1(int x,int y,int z)
{
return(x+y+z);
    }
}
public class M_overloading {
	public static void main(String[] args) {
        sum1 obj = new sum1();
        System.out.println(obj.Sum1(12,4));
        System.out.println(obj.Sum1(1,23,34));


}
}
