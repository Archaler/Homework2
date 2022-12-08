public class Main2 {
    public static void main(String[] args) {
       var firstFighter = 78.2;
       var secondFighter = 82.7;
       var totalWeight = firstFighter + secondFighter;
       System.out.println("Общий вес " + totalWeight+" кг!");

       var differenceWeight = (firstFighter - secondFighter);
               System.out.println("Разница " + differenceWeight + " кг!");
       var differnceWeightFighters = (secondFighter - firstFighter);
       System.out.println(differnceWeightFighters +" kg!");
        var differnceWeightFighters1 = (secondFighter % firstFighter);
       System.out.println(differnceWeightFighters1 + " kg!");

       var fullJobHours = 640;
       var oneJobHours = 8;
       var numberWorkers = fullJobHours / oneJobHours;
       System.out.println("Если в компании работает " + numberWorkers + " человек, то всего " + fullJobHours + " часов работы может быть поделено между сотрудниками");
    }
}