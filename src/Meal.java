import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Meal implements Energy{
    private UUID id;

    private List<Nutriment> nutriments;
    private String name;

    public Meal(List<Nutriment> nutriments, String name) {
        this.nutriments = nutriments;
        this.name = name;
    }

    public Meal() {
        this.nutriments = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public String getName() {
        return name;
    }

    public void add(Nutriment n){
        if (!nutriments.contains(n)){
            nutriments.add(n);
        }
        else {
            n.setWeight(n.getWeight() + 1.0);
        }
    }

    public void remove(Nutriment n){
        if (nutriments.contains(n)){
            nutriments.remove(n);
        }
    }

    public void remove(Nutriment n, double weight){
        if (nutriments.contains(n)){
            n.setWeight(n.getWeight() - weight);
        }
    }

    @Override
    public double getKcal() {
        double sum = 0;
        for (Nutriment n: nutriments){
            sum += n.getKcal();
        }
        return sum; //vraca ukupnu kolicinu kalorija u jelu
    }

    public double getTotalQuantityOfNutrients(){
        double sum = 0;
        for (Nutriment n: nutriments){
            sum += n.getKcal() + n.getProteins() + n.getCarbohydrates() + n.getFats() + n.getFiber();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Meal meel = (Meal) o;
        if(this.id == meel.id){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "nutriments=" + nutriments +
                ", name='" + name + '\'' +
                '}';
    }
}
