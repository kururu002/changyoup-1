package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import service.LoginService;

public class LoginAction extends ActionSupport{
    private LoginService loginservice;
    private String password;
    private String username;
    
    
    public LoginService getLoginservice() {
        return loginservice;
    }


    public void setLoginservice(LoginService loginservice) {
        this.loginservice = loginservice;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String login(){
        int flag=loginservice.login(username, password);
        if(flag == 0){	
            return INPUT;
        }
        else if(flag == 1)
        {
            return SUCCESS;
        }
        else{
        	return ERROR;
        }
    }
}