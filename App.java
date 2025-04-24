package teena;

import java.util.ResourceBundle;

public class App {
public int userLogin(String in_user,String in_pwd)
{
	ResourceBundle
	rd=ResourceBundle.getBundle("config");
	String username=rd.getString("Teena");
	String password=rd.getString("Shree56");
	if(in_user.equals(username)&&in_pwd.equals(password))
		return 1;
	else return 0;
}
}
