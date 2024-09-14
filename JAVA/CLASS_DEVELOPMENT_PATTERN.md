# Padrão de desenvolvimento de classes

- Constantes
- Campos estáticos
- Campos de instância
- Construtores
- Métodos estáticos
- Métodos de instância
- Métodos auxiliares privados

## Exemplo

```java
package com.example.store.model;

import java.util.Date;

public class Product {
    // Constantes
    public static final String CATEGORY_ELECTRONICS = "Electronics";
    public static final String CATEGORY_CLOTHING = "Clothing";

    // Campos estáticos
    private static int productCounter = 0;

    // Campos de instância
    private int id;
    private String name;
    private String category;
    private double price;
    private Date creationDate;

    // Construtores
    public Product(String name, String category, double price) {
        this.id = ++productCounter;
        this.name = name;
        this.category = category;
        this.price = price;
        this.creationDate = new Date();
    }

    // Métodos estáticos
    public static int getProductCounter() {
        return productCounter;
    }

    // Métodos de instância
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", creationDate=" + creationDate +
                '}';
    }

    // Métodos auxiliares privados
    private boolean isValidCategory(String category) {
        return CATEGORY_ELECTRONICS.equals(category) || CATEGORY_CLOTHING.equals(category);
    }
}

```
## Uteis
[openJdk](https://adoptopenjdk.net/releases.html)