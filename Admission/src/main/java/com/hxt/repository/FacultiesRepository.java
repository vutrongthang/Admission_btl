/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hxt.repository;

import com.hxt.pojo.Faculties;
import java.util.List;

/**
 *
 * @author vutrongthang
 */
public interface FacultiesRepository {
        List<Faculties>getFacultieses();
        Faculties getFacultiesId(int id);
}    

