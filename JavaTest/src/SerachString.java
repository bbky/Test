import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SerachString {
		/**
		 * �÷����о������п��ܳ��ֵ��ַ�����������ͳ�ƣ���δ���ظ����ֵ��ַ������д������¶�ζ�ͬһ�ַ���ͳ�ƣ������
		 * @param args
		 * @throws IOException
		 */
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String str = stdin.readLine();
		String found = null;
		
		for(int m=0;m <=str.length();m++) {
			
			for(int n=m+2;n <= str.length();n++) {
				
				found = str.substring(m,n);
				int count =0;
				
				
					for(int i=0;i <=str.length();i++) {
						for(int j=i+2;j <= str.length();j++) {
							
							String goal = str.substring(i,j);
							if(found.equals(goal)) {
								count++;
							}
						}
					}
						System.out.println(found +" : "+ count);
				
			}
			
		}
	}
	/*
	private static boolean Exit(String found,String e[]) {
		boolean isExit = false;
		for(int i=0;i<e.length && e[i] != null;i++) {
			if(e[i].equalsIgnoreCase(found)) {
				isExit =true;
				return isExit;
			}
		}
		return isExit;
	}
	*/
}
