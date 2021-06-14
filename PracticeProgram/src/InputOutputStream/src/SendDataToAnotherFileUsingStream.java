import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SendDataToAnotherFileUsingStream {
	public static void main(String[] args) {
		
		try 
		{
			String path1="E:\\InoutOutput\\Input.txt";
			String path2="E:\\InoutOutput\\Output.txt";
			
			//FileInput Is used to read the data in passed path
			FileInputStream fis=new FileInputStream(path1);
			
			//FileOuput is used to write the data in passed path
			FileOutputStream fos=new FileOutputStream(path2);
			
			int doc;
			
			//read() is used to read the data
			while((doc=fis.read()) !=-1)
				{
					//write() is used to write the data 
					fos.write(doc);
				}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
