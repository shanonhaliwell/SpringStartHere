package springstarthere.ch8_ex6.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springstarthere.ch8_ex6.service.ProductService;
import springstarthere.ch8_ex6.models.Product;

@Controller
public class ProductsController {
    
    // instance variables
    private final ProductService productService;

    // constructor
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    // import org.springframework.web.bind.annotation.RequestMethod;
    //@PostMapping(path = "/products")
    @RequestMapping(path = "/products", method = RequestMethod.POST)
    //public String addProduct (@RequestParam String name, @RequestParam double price, Model model) {
    public String addProduct (Product p, Model model) {

        /*
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        */
        
        this.productService.addProduct(p);

        List<Product> listOfProducts = productService.findAll();

        model.addAttribute("products", listOfProducts);

        return "products.html";
    
    }


    @RequestMapping(path = "/products")
    public String viewProducts(Model model) {

        // get the product list from the service
        //var listOfProducts = this.productService.findAll();
        List<Product> listOfProducts = this.productService.findAll();

        // send list of products to the view
        model.addAttribute("products", listOfProducts);

        // return the view name, which will be taken and rendered by the dispatcher servlet
        return "products.html";

    }
    
}