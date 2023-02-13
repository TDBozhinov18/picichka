public class Topping {
    private String meat;
    private String vegetables;
    private String chesee;
    private String sos;

    public Topping(){
        this.meat="Svinsko";
        this.vegetables="Krastavici";
        this.chesee="domashno";
        this.sos="barbeku";
    }

    public Topping(String meat, String vegetables, String chesee, String sos) {
        this.meat = meat;
        this.vegetables = vegetables;
        this.chesee = chesee;
        this.sos = sos;
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
                '}';
    }
}
