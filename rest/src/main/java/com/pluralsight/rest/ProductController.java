package com.pluralsight.rest;


import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/rest/products")
public class ProductController
{


    @RequestMapping(method=RequestMethod.GET, path = "/{id}")
    public Product findById (@PathVariable("id") int productId)
    {
        return new Product("Gift", "Gifts", 12.0, productId);

    }

    @GetMapping
    public List<Product> findAll()
    {
        List<Product> results = new ArrayList<>();
        results.add(new Product("Gift", "Gifts", 12.0, 1));
        results.add(new Product("Another Gift", "And more Gifts", 24.0, 2));

        return results;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Product addProducts (@RequestBody Product product) {
        System.out.println(product);
        return product;
    }


    @RequestMapping(path = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") int productId){
        System.out.println("deleted product " + productId);
    }

}
