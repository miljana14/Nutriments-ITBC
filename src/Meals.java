import java.util.ArrayList;
import java.util.List;

public class Meals {
    private List<Meal> meals;

    public Meals(List<Meal> meals) {
        this.meals = meals;
    }

    public Meals() {
        this.meals = new ArrayList<>();
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m){
        if (!meals.contains(m)){
            meals.add(m);
        }
        return false;
    }

    public void remove(Meal m){
        if (meals.contains(m)){
            meals.remove(m);
        }
    }

    public List<Meal> search(String s){
        List<Meal> list = new ArrayList<>();
        for (Meal m : meals){
            if (m.getName().contains(s)){
                list.add(m);
            }
        }
        return list;
    }

    public List<Meal> search(List<Nutriment> nutriment){
        //vraca ona jela koja mogu da se naprave od prosledjene liste namirnica
        List<Meal> list = new ArrayList<>();
        for (Meal m : meals){
            if (m.getNutriments().containsAll(nutriment)){
                list.add(m);
            }
        }
        return list;
    }

    public List<Meal> search(double kcal){
        List<Meal> list = new ArrayList<>();
        for (Meal m : meals){
            if (m.getKcal() < kcal){
                list.add(m);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        String s = "";
        for(Meal m : meals){
            s += m.getId() + " | Name: " + m.getName() + "\n";
        }
        return s;
    }
}
