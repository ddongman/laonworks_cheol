package com.laonworks502.team1st.service.users;

import com.laonworks502.team1st.model.users.GeneralUserBean;
import org.springframework.stereotype.Service;

@Service
public class GeneralUserServiceImpl implements GeneralUserService {

    @Override
    public String loginUser(String email, String passwd) {
        return null;
    }

    @Override
    public String logoutUser() {
        return null;
    }

    @Override
    public String joinCompany_User(GeneralUserBean general_userBean) {
        return null;
    }

    @Override
    public String amendCompany_User(GeneralUserBean general_userBean) {
        return null;
    }

    @Override
    public String findPasswdGeneral_User(GeneralUserBean general_userBean) {
        return null;
    }

    @Override
    public String quitCompany_User(String email, String exit_reason) {
        return null;
    }

}