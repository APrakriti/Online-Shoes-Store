package com.aprakriti.shoesstore.Pojo;

/**
 * Created by aprakriti on 5/30/2017.
 */

public class MyOrderPojo {
    public String Mycolor,Mysize,Myquantity, Mydeliverydate, Mydeliveryaddress, MyPrice, MyDescription;

    public MyOrderPojo(){

    }

    public MyOrderPojo(String mycolor, String mysize, String myquantity, String mydeliverydate,
                       String mydeliveryaddress, String myPrice, String myDescription) {
        Mycolor = mycolor;
        Mysize = mysize;
        Myquantity = myquantity;
        Mydeliverydate = mydeliverydate;
        Mydeliveryaddress = mydeliveryaddress;
        MyPrice = myPrice;
        MyDescription = myDescription;
    }


    public String getMycolor() {
        return Mycolor;
    }

    public void setMycolor(String mycolor) {
        Mycolor = mycolor;
    }

    public String getMysize() {
        return Mysize;
    }

    public void setMysize(String mysize) {
        Mysize = mysize;
    }

    public String getMyquantity() {
        return Myquantity;
    }

    public void setMyquantity(String myquantity) {
        Myquantity = myquantity;
    }

    public String getMydeliverydate() {
        return Mydeliverydate;
    }

    public void setMydeliverydate(String mydeliverydate) {
        Mydeliverydate = mydeliverydate;
    }

    public String getMydeliveryaddress() {
        return Mydeliveryaddress;
    }

    public void setMydeliveryaddress(String mydeliveryaddress) {
        Mydeliveryaddress = mydeliveryaddress;
    }

    public String getMyPrice() {
        return MyPrice;
    }

    public void setMyPrice(String myPrice) {
        MyPrice = myPrice;
    }

    public String getMyDescription() {
        return MyDescription;
    }

    public void setMyDescription(String myDescription) {
        MyDescription = myDescription;
    }
}
