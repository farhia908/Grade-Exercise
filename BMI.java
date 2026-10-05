package GradedExercise2;

public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    //constructors
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public BMI(String name, double weight, double height){
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;

    }
    //Get BMI
    public double getBMI(){
        return (weight * 703) / (height * height);
    }

    // BMI status..
    public String getStatus(){
        double bmi = getBMI();

        if (bmi < 18.5){
            return "Underweight";
        }
        else if (bmi < 25.0){
            return "Normal";
        }
        else if (bmi < 30.0){
            return "Overweight";
        }
       else {
           return "Obese";
        }
    }
    // Getters..
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }

    public static void main(String[] args){
        BMI displayInfo = new BMI("Farah", 20, 160, 75);
        System.out.println("Name: " + displayInfo.getName());
        System.out.println("Age: " + displayInfo.getAge());
        System.out.println("Weight: " + displayInfo.getWeight());
        System.out.println("Height: " + displayInfo.getHeight());

        System.out.println("BMI: " + displayInfo.getBMI());
        System.out.println("Status: " + displayInfo.getStatus());
    }
}
