public class Pizza {
    private String name;
    private String dought;
    private Topping topping;

    public Pizza(){
        this.name="Milka";
        this.dought="bqlo";
        this.topping=new Topping();
    }

    public Pizza(String name, String dought, Topping topping) {
        this.name = name;
        this.dought = dought;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDought() {
        return dought;
    }

    public void setDought(String dought) {
        this.dought = dought;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dought='" + dought + '\'' +
                ", topping=" + topping +
                '}';
    }
}
