package javacollectionsandstreams.javagenerics;
interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getMealType() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getMealType() { return "Keto"; }
}

class Meal<T extends MealPlan> {
    private T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    T generateMeal() {
        return plan;
    }
}

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        System.out.println(vegMeal.generateMeal().getMealType());
        System.out.println(ketoMeal.generateMeal().getMealType());
    }
}
