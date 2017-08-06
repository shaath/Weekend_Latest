package methods;

public class Reuse {

	public static void main(String[] args)
	{
		BasicMethods b=new BasicMethods();
//		b.function3();
		
//		int res=b.sum(400,300);
//		System.out.println(res);
		
		b.launch_Br("firefox", "http://primusbank.qedgetech.com");
		b.send_Text("id", "txtuId", "Admin");
		b.send_Text("id", "txtPword", "Admin");
		b.click("id", "login");
		
	}

}
