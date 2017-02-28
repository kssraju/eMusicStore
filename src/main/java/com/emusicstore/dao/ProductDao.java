package com.emusicstore.dao;


import com.emusicstore.model.Product;

import java.util.List;


public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(int id);

    List<Product> getProductList();

    void deleteProduct(int id);

    void editProduct(Product product);
}
