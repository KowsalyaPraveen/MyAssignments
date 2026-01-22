package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st Way : Literal
		String name="TestLeaf";
		// 2nd Way : Instantiation
		String s=new String("TestLeaf");
		// name==ss ---> it will check memory reference instead of value
		if(name.equals(s))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are not same");
		}

	}

}
