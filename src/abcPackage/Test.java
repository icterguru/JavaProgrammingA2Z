package abcPackage;
public class Test {
	public static void main(String[] args) {
//		int count = 1;
		for (int count = 1, row = 1; row < 5; row++, count++)
		{
			for (int i = 0; i < count; i++)
				System.out.print ('*');
			System.out.print ('\n');
		}
	}
}
