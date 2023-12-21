/**
 * Product
 */
 class Product {

    private String name;
    private double price;
    private int  quantity;
    public Product(){
        this.name="Not set";
        this.price=0.0;
        this.quantity=0;
    }
    public Product(String n, double p, int q){
        this.name=n;
        this.price=p;
        this.quantity=q;
    }
    public double totalValue(){
        return price*quantity;
    }
    public void updateQuantity(int newquan){
        if(newquan>=0){
            quantity = newquan;
        }else{
            System.out.println("Quantity can't be negative");
        }
    }
    public double calculateDiscount(double discount){
        return price*quantity*(discount/100);
    }
    public void applyDiscount(double discount){
        double discountAmount = calculateDiscount(price);
        System.out.println("Discount granted:"+discountAmount);
    }
    public void productInfo(){
        System.out.println("Product Information");
        System.out.println("Name :"+name);
        System.out.println("Price :"+price);
        System.out.println("Quantity :"+quantity);
        System.out.println("Total :"+totalValue());
    }
}

 public class Products {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.productInfo();
        Product p2 = new Product("Egg",60,12);
        p2.productInfo();
        p2.applyDiscount(60.0);
    }
}
