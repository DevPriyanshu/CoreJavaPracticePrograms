import java.io.File;

public class CheckingFileExistence {
	public static void main(String[] args) {
		String path1="E:\\InoutOutput\\input.txt";
		File f=new File(path1);
		if(f.exists())
		{
			if(f.isFile())
			{
				System.out.println("Path conatins file: ");
			}
			else
			{
				System.out.println("Path doesn't contains file");
			}
		}
		else
		{
			System.out.println("Invalid Path");
		}
	}
}
