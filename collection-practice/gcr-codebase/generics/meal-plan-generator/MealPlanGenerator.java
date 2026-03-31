public class MealPlanGenerator {

    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {
        System.out.println("Generating personalized meal plan...");
        System.out.println(mealPlan.getMealDetails());
    }
}
