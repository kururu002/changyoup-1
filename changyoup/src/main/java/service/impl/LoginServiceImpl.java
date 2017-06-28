package service.impl;

import dao.LoginDao;
import dao.impl.LoginDaoImpl;

public class LoginServiceImpl implements service.LoginService {

    private LoginDao logindao;

    public void setLogindao(LoginDaoImpl loginDao) {
        this.logindao = loginDao;
    }

    @Override
    public int login(String username, String password) {
        return logindao.login(username, password);
    }

}