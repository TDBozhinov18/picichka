public class Topping {
    private String meat;
    private String vegetables;
    private String chesee;
    private String sos;
    private double weight;


    public Topping(){
        this.meat="Svinsko";
        this.vegetables="Krastavici";
        this.chesee="domashno";
        this.sos="barbeku";
        this.weight = 24.45;
    }

    public Topping(String meat, String vegetables, String chesee, String sos, double weight) {
        this.meat = meat;
        this.vegetables = vegetables;
        this.chesee = chesee;
        this.sos = sos;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getChesee() {
        return chesee;
    }

    public void setChesee(String chesee) {
        this.chesee = chesee;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "meat='" + meat + '\'' +
                ", vegetables='" + vegetables + '\'' +
                ", chesee='" + chesee + '\'' +
                ", sos='" + sos + '\'' +
                ", weight='" + weight + "\'" +
                '}';
    }
}
