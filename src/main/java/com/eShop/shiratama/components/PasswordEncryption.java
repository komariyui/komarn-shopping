package com.eShop.shiratama.components;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

@Component
public class PasswordEncryption {
    // Encryption password
    public String encode(CharSequence rawPassword){
        return DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes());
    }
    //decrypt password and contrast
    public boolean matches(CharSequence rawPassword,String encodedPassword){
        return encodedPassword.equals(DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes()));
    }
}
