package com.eShop.shiratama.service.users;

import com.eShop.shiratama.Dao.users.UsersDao;
import com.eShop.shiratama.entity.UsersBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private testService testServices;

    //  register user
    public HashMap insertUser(UsersBean usersEntity){
        HashMap<String,Object> HashMap = new HashMap<>();
        //verification check
        if(testServices.getCode(usersEntity.getUsername()).equals(usersEntity.getVerificationCode())){
            System.out.println("success");
        }else{
            HashMap.put("data","验证码错误");
            HashMap.put("status","400");
            System.out.println("error");
            return HashMap;
        }


        if (usersDao.selectUser(usersEntity.getUsername()) == null){
            int data = usersDao.insertUser(usersEntity.getUsername(),usersEntity.getPassword());
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

}
