package com.eShop.shiratama.service.users;

import com.eShop.shiratama.Dao.users.UsersDao;
import com.eShop.shiratama.entity.returnJson.template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

//  注册用户
    public HashMap insertUser(String username,String password){
        HashMap<String,Object> HashMap = new HashMap<>();

        if (usersDao.selectUser(username) == null){
            int data = usersDao.insertUser(username,password);
            if (data != 1){
                HashMap.put("data","注册失败");
                HashMap.put("status","400");
            } else {
                HashMap.put("data","注册成功");
                HashMap.put("status","200");
            }
        }else{
            HashMap.put("data","用户名已存在");
            HashMap.put("status","400");
        }

        return HashMap;
    }
    // verification code
    public template verificationCode(String verificationCode){
        template returnValue = new template();
        return returnValue;
    }
}
