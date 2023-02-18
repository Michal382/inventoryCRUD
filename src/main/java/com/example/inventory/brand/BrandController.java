package com.example.inventory.brand;

import com.example.inventory.category.Category;
import com.example.inventory.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BrandController {

    @Autowired BrandRepository brandRepo;
    @Autowired CategoryRepository categoryRepo;

    @Autowired
    private BrandRepository brandrepo;

    @GetMapping("/brands/new")
    public String showCreateNewBrandForm(Model model){
        List<Category> listCategories = categoryRepo.findAll();

        model.addAttribute("listCategories", listCategories);
        model.addAttribute("brand", new Brand());

        return "brand_form";
    }

    @PostMapping("/brands/save")
    public String saveBrand(Brand brand){
        brandRepo.save(brand);

        return "redirect:/";
    }


}
