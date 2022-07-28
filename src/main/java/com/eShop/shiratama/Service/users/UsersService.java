package com.eShop.shiratama.service.users;

import com.eShop.shiratama.Dao.users.UsersDao;
import com.eShop.shiratama.entity.UsersBean;
import com.eShop.shiratama.entity.returnJson.template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Random;

@Service
@CacheConfig(cacheNames = "GoodsCache")
public class UsersService {

    @Autowired
    private UsersDao usersDao;



    //  register user
    public HashMap insertUser(UsersBean usersEntity){

        HashMap<String,Object> HashMap = new HashMap<>();

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
