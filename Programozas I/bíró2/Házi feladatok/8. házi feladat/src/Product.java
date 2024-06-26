public class Product {
    private String name;
    private int amount;
    private boolean important;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isImportant() {
        return important;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public Product(String name, int amount, boolean important) {
        this.name = name;
        this.amount = amount;
        this.important = important;
    }
}
