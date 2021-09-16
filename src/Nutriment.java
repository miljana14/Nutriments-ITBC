import java.util.ArrayList;
import java.util.List;

public abstract class Nutriment extends Grocery{

    private double weight;
    private double kcal;
    private double proteins;
    private double carbohydrates;
    private double fats;
    private double fiber;


    public Nutriment(String company, String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(company, name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public void update(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber){
        if(company != null){
            setCompany(company);
        }else{
            setCompany(getCompany());
        }
        if(name != null){
            setName(name);
        }else{
            setName(getName());
        }
        if (weight != null){
            setWeight(weight);
        }
        else{
            setWeight(getWeight());
        }
        if(kcal != null){
            setKcal(kcal);
        }else{
            setKcal(getKcal());
        }
        if(proteins != null){
            setProteins(proteins);
        }else{
            setProteins(getProteins());
        }
        if(carbohydrates != null){
            setCarbohydrates(carbohydrates);
        }else{
            setCarbohydrates(getCarbohydrates());
        }
        if(fats != null){
            setFats(fats);
        }else{
            setFats(getFats());
        }
        if(fiber != null){
            setFiber(fiber);
        }else{
            setFiber(getFiber());
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public double getWeight() {
        return weight;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getFiber() {
        return fiber;
    }

    @Override
    public double getKcal() {
        double totalKcal = (this.weight / 100) * kcal;
        return totalKcal;
    }

    public double getTotalProteins(){
        double totalProteins = (this.weight / 100) * proteins;
        return totalProteins;
    }

    public double getTotalCarbohydrates(){
        double totalCarbohydrates = (this.weight / 100) * carbohydrates;
        return totalCarbohydrates;
    }
    public double getTotalFats(){
        double totalFats = (this.weight / 100) * fats;
        return totalFats;
    }
    public double getTotalFiber(){
        double totalFiber = (this.weight / 100) * fiber;
        return totalFiber;
    }

    @Override
    public String toString() {
        return "Company: " + getCompany() +
                "\nName: " + getName() +
                "\nWeight: " + weight +
                "\nKcal=" + kcal +
                "\nProteins=" + proteins + "%" +
                "\nCarbohydrates=" + carbohydrates + "%" +
                "\nFats=" + fats + "%" +
                "\nFiber=" + fiber + "%";
    }

    public String totalNutrimentTable(){
        return "Company: " + getCompany() +
                "\nName: " + getName() +
                "\nWeight: " + weight +
                "\nKcal=" + getKcal() +
                "\nProteins=" + getTotalProteins() +
                "\nCarbohydrates=" + getTotalCarbohydrates() +
                "\nFats=" + getTotalFats() +
                "\nFiber=" + getTotalFiber();
    }
}
