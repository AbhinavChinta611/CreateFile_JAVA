import java.io.File;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("demo.txt");
			if(file.createNewFile())
			{
				System.out.println("File Created successfully");
			}
			else
			{
				System.out.println("File Creation Failure");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}