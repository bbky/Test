import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Login {

	public static void main(String[] args) throws IOException {
		HashMap map = new HashMap();
		map.put("张三", "123");
		map.put("李四", "456");
		map.put("王五", "789");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String str = stdin.readLine();
//System.out.println(str);
		//此处输入","应为英文","号。
		int i =str.indexOf(",");
		//此处输入","应为中文","号。
		int j =str.indexOf("，");
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
			System.out.println("用户名不能为空！");
		} else {
			if(!map.containsKey(name)) {
				System.out.println("不存在名为" + name + "的用户！");		
			} else {
				String key =(String)map.get(name);
				if(key.equals(password)) {
					System.out.println("登录成功！");
				} else {
					System.out.println("密码错误！");					
				}
			}
		}
	}

}
