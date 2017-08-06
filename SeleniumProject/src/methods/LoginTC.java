package methods;

public class LoginTC {

	public static void main(String[] args)
	{
		OrgHRMMaster om=new OrgHRMMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);

		om.org_Close();
		System.out.println("Application Closed Successfuly");
	}

}
