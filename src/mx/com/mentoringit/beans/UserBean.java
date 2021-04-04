package mx.com.mentoringit.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {
	
	private String name="";
	private String password;
	
	/**
	 * Validamos login y password
	 * @return
	 */
	public String login() {
		String result="";
		if(name.length()>0 && password.length()>0) {
			//cadena de control para usar con face-config.xml
			result="welcome";
			
		}else {
			//envia a la vista index
			result="index";
		}
		return result;
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
	
}
