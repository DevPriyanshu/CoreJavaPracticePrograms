import java.io.FileReader;
import java.io.FileWriter;

public class SendDataToAnotherFileUsingTReader {
	public static void main(String[] args) {
		 try {
			String path1 = "E:\\InoutOutput\\Input.txt";
			String path2 = "E:\\InoutOutput\\Output.txt";
			
			//is used to read data from the file. 
			//It returns data in byte format like FileInputStream class
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			
			int doc;
			 while((doc=fr.read()) != -1)
			 {
				 fw.write(doc);
			 }
			 fw.flush();//it means to clear the stream of any element that may be or maybe not inside the stream
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
