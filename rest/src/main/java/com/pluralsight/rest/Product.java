package com.pluralsight.rest;

public class Product
{
    private int productId;
    private String name;
    private String category;
    private double price;

    public Product()
    {
    }

    public Product(String category, String name, double price, int productId)
    {
        this.category = category;
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }
}
