public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.setBalance(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount){
        this.history.add(super.getBalance()-amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.history.toString());
        System.out.println("Largest amount of product: "+this.history.maxValue());
        System.out.println("Smallest amount of product: "+this.history.minValue());
        System.out.println("Average: "+this.history.average());
    }

    public String history(){
        return history.toString();
    }
}
