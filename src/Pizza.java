public class Pizza {
    private String name;
    private Dought dought;
    private Topping topping;

    public Pizza(){
        this.name="Milka";
        this.dought=new Dought();
        this.topping=new Topping();
    }

    public Pizza(String name, Dought dought, Topping topping) {
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

    public Dought getDought() {
        return dought;
    }

    public void setDought(Dought dought) {
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
