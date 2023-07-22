/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.controllers;

import com.hxt.pojo.AdmissionInfo;
import com.hxt.pojo.Banners;
import com.hxt.pojo.Faculties;
//import com.hxt.service.AdmissionService;
//import com.hxt.service.BannerService;
//import com.hxt.service.FacultiesService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author vutrongthang
 */
@Controller
@Transactional
@ControllerAdvice
public class HomeController {

//    @Autowired
//    private FacultiesService facultiesService;
//    @Autowired
//    private BannerService bannerService;
//    @Autowired
//    private AdmissionService admissionService;
//
//    @ModelAttribute
//    public void commonAttributes(Model model) {
//        List<Banners> banners = this.bannerService.getBannerses();
//        model.addAttribute("banners", banners);
//    }
//
//    @RequestMapping("/")
//    public String index(Model model) {
//        // Lấy danh sách các khoa học trường từ FacultiesService
//        List<Faculties> faculties = facultiesService.getFacultieses();
//        model.addAttribute("faculties", faculties);
//
//        // Trả về tên view của trang chủ
//        return "index";
//    }

}
