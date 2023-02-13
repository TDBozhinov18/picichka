public class Dought {
    private String Dought;
    private String Dought2;

    public Dought(){
        this.Dought="Bqlo";
        this.Dought2="Hrupkavo";
    }

    public Dought(String dought, String dought2) {
        this.Dought = dought;
        this.Dought2 = dought2;
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

    @Override
    public String toString() {
        return "Dought{" +
                "Dought='" + Dought + '\'' +
                ", Dought2='" + Dought2 + '\'' +
                '}';
    }
}
