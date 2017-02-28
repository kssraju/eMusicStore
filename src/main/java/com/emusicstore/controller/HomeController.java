package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/productList")
    public String getProductList(Model model) {
        List<Product> productList = productDao.getProductList();
        model.addAttribute("productList", productList);

        return "productList";
    }


    @RequestMapping("/product/{productId}")
    public String getProduct(@PathVariable int productId, Model model) throws IOException {
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);

        return "product";
    }
}
