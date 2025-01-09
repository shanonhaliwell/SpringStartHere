package springstarthere.ch8_ex6.service;

import java.util.List;
import java.util.ArrayList;

import springstarthere.ch8_ex6.models.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    // instance variable
    private List<Product> products;

    // constructor
    public ProductService() {
        this.products = new ArrayList<>();
    }

    // method
    public void addProduct(Product p) {
        this.products.add(p);
    }

    public List<Product> findAll() {
        return this.products;
    }
    
}
