/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.formatter;

import com.hxt.pojo.Users;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author vutrongthang
 */

public class UserFormatter implements Formatter<Users>{

     @Override
    public String print(Users t, Locale locale) {
        return String.valueOf(t.getUserId());
    }

    @Override
    public Users parse(String userId, Locale locale) throws ParseException {
        Users u = new Users();
        u.setUserId(Integer.parseInt(userId));
        
        return u;
    }
    
}

