import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Login {

	public static void main(String[] args) throws IOException {
		HashMap map = new HashMap();
		map.put("����", "123");
		map.put("����", "456");
		map.put("����", "789");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String str = stdin.readLine();
//System.out.println(str);
		//�˴�����","ӦΪӢ��","�š�
		int i =str.indexOf(",");
		//�˴�����","ӦΪ����","�š�
		int j =str.indexOf("��");
		String name =null;
		String password =null;
		
//System.out.println(i);
		if(i !=-1) {
		name = str.substring(0, i);
		password = str.substring(i+1, str.length());
		} else {
				name = str.substring(0, j);
				password = str.substring(j+1, str.length());

		}
//System.out.println(password);
		if(name == null){
			System.out.println("�û�������Ϊ�գ�");
		} else {
			if(!map.containsKey(name)) {
				System.out.println("��������Ϊ" + name + "���û���");		
			} else {
				String key =(String)map.get(name);
				if(key.equals(password)) {
					System.out.println("��¼�ɹ���");
				} else {
					System.out.println("�������");					
				}
			}
		}
	}

}
