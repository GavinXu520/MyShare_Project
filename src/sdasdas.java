import java.io.File;
import java.io.IOException;


public class sdasdas {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		
		File  file  = new File(".");
		System.out.println(file.getCanonicalPath());//获取当前项目的真实路径	
		
		
		System.out.println((Integer.MAX_VALUE+1)<Integer.MAX_VALUE);//越界了
		System.out.println(Integer.MAX_VALUE+1);//-2147483648
		System.out.println(Integer.MAX_VALUE);//2147483647
	}

}
