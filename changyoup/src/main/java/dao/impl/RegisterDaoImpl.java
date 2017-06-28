package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.RegisterDao;
import model.User;

public class RegisterDaoImpl extends HibernateDaoSupport implements RegisterDao {

    @Override
    public boolean register(String username, String password) {
    	User user=new User();
    	user.setPassword(password);
    	user.setUsername(username);
    	user.setRole(1);
        List<User> u=this.getHibernateTemplate().find("from User where username=?",username);
        Boolean flag=true;
        if(u.size()>0){
            flag=false;            
        }
       
        if(this.getHibernateTemplate().save(user) == null){
            flag=false;            
        }
        return flag;
    }

}