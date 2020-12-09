package _1105_Kocsma;

public class Drink {
    private String type;
    private float price;
    private float glass;
    private float alcoholAmount;
    private float quantity;
    public Drink(String type, float price, float quantity) {
        this.type = type;
        this.price = price;
        if (type.equals("wine")) {
            alcoholAmount = 0.09F;
            glass = 0.2F;
        }
        if (type.equals("beer")) {
            alcoholAmount = 0.045F;
            glass = 0.5F;
        }
        if (type.equals("shot")){
            alcoholAmount = 0.4F;
            glass = 0.05F;
        }
        if (type.equals("water")){
            alcoholAmount = 0;
            glass = 0.2F;
        }
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getGlass() {
        return glass;
    }

    public void setGlass(float glass) {
        this.glass = glass;
    }

    public float getAlcoholAmount() {
        return alcoholAmount;
    }

    public void setAlcoholAmount(float alcoholAmount) {
        this.alcoholAmount = alcoholAmount;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", glass=" + glass +
                ", alcoholAmount=" + alcoholAmount +
                ", quantity=" + quantity +
                '}';
    }
}

