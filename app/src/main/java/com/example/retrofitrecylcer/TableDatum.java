
package com.example.retrofitrecylcer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableDatum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("is_taxable")
    @Expose
    private String isTaxable;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("show_in_kitchen")
    @Expose
    private String showInKitchen;
    @SerializedName("verify_age")
    @Expose
    private String verifyAge;
    @SerializedName("sizes")
    @Expose
    private String sizes;
    @SerializedName("ordering")
    @Expose
    private String ordering;
    @SerializedName("is_deleted")
    @Expose
    private String isDeleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsTaxable() {
        return isTaxable;
    }

    public void setIsTaxable(String isTaxable) {
        this.isTaxable = isTaxable;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getShowInKitchen() {
        return showInKitchen;
    }

    public void setShowInKitchen(String showInKitchen) {
        this.showInKitchen = showInKitchen;
    }

    public String getVerifyAge() {
        return verifyAge;
    }

    public void setVerifyAge(String verifyAge) {
        this.verifyAge = verifyAge;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getOrdering() {
        return ordering;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

}
