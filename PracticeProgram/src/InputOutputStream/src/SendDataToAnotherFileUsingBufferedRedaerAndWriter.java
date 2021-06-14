import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SendDataToAnotherFileUsingBufferedRedaerAndWriter {
	public static void main(String[] args) {
		
		String path1,path2;
		FileReader fr;
		FileWriter fw;
		BufferedReader br; //it is efficient to read the data 
		BufferedWriter bw; //it is efficient to write the data
		String doc;
		try {
		path1="E:\\InoutOutput\\input.txt";
		path2="E:\\InoutOutput\\output.txt";
		
		
			fr=new FileReader(path1);
			br =new BufferedReader(fr);
			
			fw=new FileWriter(path2);
			bw=new BufferedWriter(fw);
			
			while((doc=br.readLine()) !=null)
			{
				bw.write(doc);
			}
			bw.flush();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
