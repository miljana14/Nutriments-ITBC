import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Nutriment f1 = new Food("Frikom", "povrce", 2.8, 5.6, 2.2, 4.5, 3.3, 2.9);
        Nutriment f2 = new Food("MlinProdukt", "Brasno", 2.8, 5.6, 2.2, 4.5, 3.3, 2.9);
        Nutriment f3 = new Food("Kravica", "Jogurt", 2.5, 1.6, 3.8, 2.3, 5.3, 1.9);
        Nutriment f4 = new Food("Premia", "Krastavac", 180, 3.3, 5.6, 1.3, 2.7, 0.2);
        List<Nutriment> listNutriments1 = new ArrayList<>();
        listNutriments1.add(f1);
        listNutriments1.add(f2);
//        f1.update(null, "mleko", null,3.3,6.2,2.3,1.2,15.8);
//        System.out.println(f1);
        List<Nutriment> listNutriments2 = new ArrayList<>();
        listNutriments2.add(f3);
        listNutriments2.add(f4);

        Meal meal1 = new Meal(listNutriments1, "corba");
        Meal meal2 = new Meal(listNutriments2, "salata");
        //System.out.println(meal1.getKcal());
        //System.out.println(meal1);
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(meal1);
        mealList1.add(meal2);

        Meals meals = new Meals(mealList1);
       // System.out.println(meals);

        Fridge fridge = new Fridge(listNutriments2);
        fridge.add(f1);
        fridge.add(f1);
       // fridge.remove(f1);
       // System.out.println(fridge);

        System.out.println(meals.search(listNutriments1));

    }
}
