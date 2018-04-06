package employee;

public class Invoice implements IPayable{

    //Instance Variable
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    //Constructor
    public Invoice (String pN, String pD, int q, double pPI){
        this.partNumber = pN;
        this.partDescription = pD;
        this.quantity = q;
        this.pricePerItem = pPI;

    }


    //Getters and Setters
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }


    public double getPaymentAmount() {
        return (this.quantity * this.pricePerItem);
    }


}
