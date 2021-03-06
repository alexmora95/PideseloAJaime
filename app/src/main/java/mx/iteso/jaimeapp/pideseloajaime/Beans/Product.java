package mx.iteso.jaimeapp.pideseloajaime.Beans;

import android.graphics.drawable.Drawable;
import android.widget.Button;

public class Product {
    protected Drawable productImage;
    protected String productName;
    protected double productPrice;
    protected Button productButton;

    public Product(Drawable productImage, String productName, double productPrice) {
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Button getProductButton() {
        return productButton;
    }

    public void setProductButton(Button productButton) {
        this.productButton = productButton;
    }

    public Drawable getProductImage() {
        return productImage;
    }

    public void setProductImage(Drawable productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


}
