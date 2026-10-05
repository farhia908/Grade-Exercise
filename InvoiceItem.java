package GradedExercise2;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    //constructor..
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    //Getters and setters
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPriced(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }
    public String toString(){
        return "InvoiceItem[id: " + id +
                "\n\tdesc: " + desc +
                "\n\tqty: " + qty +
                "\n\tunitPrice: " + unitPrice + "]";
    }

    public static void main(String[] arg){
        InvoiceItem item = new InvoiceItem("A201", "Laptop", 2, 500.0);
        System.out.println("Items: " + item);

        System.out.println(item.getTotal());
    }
}
