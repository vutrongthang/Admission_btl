/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.service.impl;

import com.hxt.pojo.Faculties;
import com.hxt.repository.FacultiesRepository;
import com.hxt.service.FacultiesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vutrongthang
 */
@Service
public class FacultiesServiceImpl implements FacultiesService {

    @Autowired
    FacultiesRepository facultiesRepository;

    @Override
    public List<Faculties> getFacultieses() {
        return facultiesRepository.getFacultieses();
    }

    @Override
    public Faculties getFacultiesId(int id) {
        return this.facultiesRepository.getFacultiesId(id);
    }

    @Override
    public boolean addOrUpdateFaculties(Faculties f) {
        return facultiesRepository.addOrUpdateFaculties(f);

    }

}
