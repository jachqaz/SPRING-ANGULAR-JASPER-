package com.tuto.spring.controller;

import com.tuto.spring.model.Base;
import com.tuto.spring.model.Category;
import com.tuto.spring.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/base")
@CrossOrigin
public class BaseController {
    @Autowired
    @Qualifier("BaseServiceImpl")
    BaseServiceImpl baseService;

    @PostMapping(value = "/saveCategory", headers = "Accept-application/json")
    public Base saveCategory(@RequestBody Category cat) {
        Base savedCategory = null;
        try {
            savedCategory = this.baseService.save(cat);
        } catch (Exception e) {
            if (savedCategory == null) {
                savedCategory = new Category();
            }
            savedCategory.setError(e.getMessage());
        }
        return savedCategory;
    }

    @GetMapping(value = "/deleteCate/{id}")
    public Boolean deleteCategory(@PathVariable Long id) {
        Boolean resp = false;
        try {
            this.baseService.delete(Category.class, id);
            resp = true;
        } catch (Exception e) {
            e.printStackTrace();
            resp = false;
        } finally {
            return resp;
        }
    }

    @GetMapping("/getAllCategories")
    public List<Category> getAllCategories() {
        return (List) baseService.getAll(Category.class);
    }
}
