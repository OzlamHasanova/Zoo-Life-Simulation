package food;

public enum Food {
       HAY(5);
       private final int quantity;

    Food(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
