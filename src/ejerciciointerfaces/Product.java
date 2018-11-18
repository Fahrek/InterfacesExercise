package ejerciciointerfaces;

public class Product implements ProductInterfaces {

    private String id;
    private double value;

    public Product() {
    }

    public Product(String id, double value) {
        this.id = id;
        this.value = value;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setValue(double value){
        this.value = value;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public double productPer(int n) {
        return (double) value * (double) n;
    }

    @Override
    public void print() {
        System.out.println("ID: " + this.getID() + " | Valor: " + this.getValue());
    }

}
