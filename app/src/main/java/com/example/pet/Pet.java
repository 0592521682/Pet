package com.example.pet;

public class Pet {
    private String name;
    private String breed;
    private int imageResId;
    private String price;
    private float rating;

    public Pet(String name, String breed, int imageResId, String price, float rating) {
        this.name = name;
        this.breed = breed;
        this.imageResId = imageResId;
        this.price = price;
        this.rating = rating;
    }

    // Getter methods
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getImageResId() { return imageResId; }
    public String getPrice() { return price; }
    public float getRating() { return rating; }
}