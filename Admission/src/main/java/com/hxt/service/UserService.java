/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hxt.service;

import com.hxt.pojo.Users;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author vutrongthang
 */
public interface UserService extends UserDetailsService {

    boolean saveUser(Users user);

    Users getUserByUsername(String username);

    List<Users> getUsers(String username);
}
