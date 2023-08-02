/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hxt.repository;

import com.hxt.pojo.Users;
import java.util.List;

/**
 *
 * @author vutrongthang
 */
public interface UserRepository {

    List<Users> getUsers(String username);

    Users getUserByUsername(String username);

    boolean saveUser(Users user);
}
