/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.controllers;

import com.hxt.pojo.Banners;
import com.hxt.pojo.Faculties;
import com.hxt.service.BannerService;
import com.hxt.service.FacultiesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vutrongthang
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BannerService bannerService;
    @Autowired
    private FacultiesService facultiesService;

    @GetMapping("/faculties")
    public String adminFaculty(Model model) {
        List<Faculties> faculties = facultiesService.getFacultieses();
        model.addAttribute("faculties", faculties);
        model.addAttribute("faculties", new Faculties());
        return "faculty";
    }

    @PostMapping("/faculties")
    public String addFaculties(Model model,
            @ModelAttribute(value = "faculties") Faculties f) {
        if (this.facultiesService.addOrUpdateFaculties(f) == true) {
            return "redirect:/admin/faculties";
        } else {
            model.addAttribute("errMsg", "Something Wrong!!!");
        }

        return "faculty";
    }

    @GetMapping("/banners")
    public String adminBanners(Model model) {
        List<Banners> banners = bannerService.getBannerses();
        model.addAttribute("banners", banners);
        return "banners";
    }
}
