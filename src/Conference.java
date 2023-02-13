public class Conference {
    private Dought dought;
    private Topping topping;
    private Pizza pizza;


    public Conference(){
        this.dought=new Dought();
        this.topping=new Topping();
        this.pizza=new Pizza();
    }

    public Conference(Dought dought, Topping topping, Pizza pizza) {
        this.dought = dought;
        this.topping = topping;
        this.pizza = pizza;
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

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "dought=" + dought +
                ", topping=" + topping +
                ", pizza=" + pizza +
                '}';
    }
}
