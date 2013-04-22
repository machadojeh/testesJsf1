package beans;

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;


@ManagedBean(name="user")
@SessionScoped

public class UserBean {
	
	private String name="";
	private String password="";

	public UserBean() {
		super();
	}

	public UserBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean testeTexto(){
		if(name.compareTo("mimimi") == 0)
			return true;
		return false;
	}
	
	public String getOla(){
		return "Ola "+name;
	}
}
