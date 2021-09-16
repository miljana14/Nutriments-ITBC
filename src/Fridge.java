import java.util.List;

public class Fridge {
    private List<Nutriment> nutriments;

    public Fridge(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public void add(Nutriment n){
        if (!nutriments.contains(n)){
            nutriments.add(n);
        }else {
        n.setWeight(n.getWeight() + 1.0);
        }
    }

    public void remove(Nutriment n){
        if(nutriments.contains(n)){
            nutriments.remove(n);
        }
    }

    public void remove(Nutriment n, double weight){
        if (nutriments.contains(n)){
            n.setWeight(n.getWeight() - weight);
        }
    }



    @Override
    public String toString() {
        return "Fridge{" +
                "nutriments=" + nutriments +
                '}';
    }
}
