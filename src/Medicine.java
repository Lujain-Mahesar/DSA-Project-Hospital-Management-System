/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SINDH
 */
public class Medicine {
   
    private int id;
    private String name;
    private double sellingPrice;
    private double buyingPrice;
    private int quantity;
    private String description;

    public Medicine() {
        this.id = 0;
        this.buyingPrice = 0;
        this.sellingPrice = 0;
        this.quantity = 0;
        this.name = " ";
        this.description = "";
    }

    
    public Medicine(int id, int buyingPrice, int sellingPrice, int quantity, String name, String description) {
        this.id = id;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

       public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

   public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", buyingPrice=" + buyingPrice + ", sellingPrice=" + sellingPrice + ", quantity=" + quantity + ", name=" + name + ", description=" + description + '}';
    }
    
    
    
    
}
