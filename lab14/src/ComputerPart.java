public class ComputerPart {

    private String model;
    private double cost;

    public ComputerPart() {
        this("", 0.0);
    }

    public ComputerPart(String model, double cost) {
        setModel(model);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {
        return String.format("%s, $%.2f", model, cost);
    }

}
