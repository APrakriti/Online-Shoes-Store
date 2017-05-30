package com.aprakriti.shoesstore.Pojo;

/**
 * Created by aprakriti on 5/25/2017.
 */

public class OrderPojo {
    public String id,name,email,color,size,quantity, deliverydate, deliveryaddress;

    public OrderPojo(){

    }

    public OrderPojo(String name, String id, String email, String color, String size, String quantity,
                     String deliverydate, String deliveryaddress) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.color = color;
        this.size = size;
        this.quantity = quantity;
        this.deliverydate = deliverydate;
        this.deliveryaddress = deliveryaddress;


    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }
}
