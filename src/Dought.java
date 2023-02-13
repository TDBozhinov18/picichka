public class Dought {
    private String Dought;
    private String Dought2;
    private double weight;

    public Dought(){
        this.Dought="Bqlo";
        this.Dought2="Hrupkavo";
        this.weight = 23.34;
    }

    public Dought(String dought, String dought2, double weight) {
        this.Dought = dought;
        this.Dought2 = dought2;
        this.weight = weight;
    }

    public String getDought() {
        return Dought;
    }

    public String getDought2() {
        return Dought2;
    }

    public void setDought(String dought) {
        Dought = dought;
    }

    public void setDought2(String dought2) {
        Dought2 = dought2;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dought{" +
                "Dought='" + Dought + '\'' +
                ", Dought2='" + Dought2 + '\'' +
                ", weight='" + weight + "\'" +
                '}';
    }
}
