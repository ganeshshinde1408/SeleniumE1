package pomPackage;

import java.util.Random;

public class Worklib {
	public int randomNo()
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;
	}
}
