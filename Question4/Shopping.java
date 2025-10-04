class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

public class Shopping {
    static int stock = 5;

    public static void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock)
            throw new OutOfStockException("Not enough items in stock!");
        else {
            stock -= quantity;
            System.out.println("Purchase successful! Remaining stock: " + stock);
        }
    }

    public static void main(String[] args) {
        try {
            purchase(10);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
