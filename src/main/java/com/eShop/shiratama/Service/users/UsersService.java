package com.eShop.shiratama.Service.users;

import com.eShop.shiratama.Dao.users.UsersDao;
import com.eShop.shiratama.entity.UsersBean;
import com.eShop.shiratama.error.exceptionClass.paramException;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Dictionary;
import java.util.HashMap;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private testService testServices;

    //check username
    public Boolean checkUsername(String username) throws paramException {
        if (usersDao.selectUser(username) == null){
            return false;
        }
        return true;
    }

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

//    用户登录
    public HashMap login(String username,String password){
        HashMap<String,Object> HashMap = new HashMap<>();
        if(!testServices.getCode(username).equals(testServices.createCode(username))){
            System.out.println("success");
        }else{
            HashMap.put("data","验证码错误");
            HashMap.put("status","400");
            System.out.println("error");
            return HashMap;
        }
        UsersBean user = usersDao.login(username,password);
        HashMap.put("data",user);
        HashMap.put("status","200");
        return HashMap;
    }
}
