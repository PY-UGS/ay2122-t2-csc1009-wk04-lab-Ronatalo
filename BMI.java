import java.util.Scanner;

public class BMI {

    private double weight;
    private double height;
    private double bmi;
    private String interpretation;

    public BMI(){
        weight = 0;
        height = 0; 
        bmi = 0;
        interpretation = "Normal";
    }

    public BMI(double weight, double height, String interpretation){
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        bmi = weight/(Math.pow(height, 2));
        return bmi;
    }

    public String getInterpretation(){
        if(bmi < 18.5){
            interpretation =  "Underweight";
        }

        if(bmi < 25.0 && bmi >= 18.5){
            interpretation = "Normal";
        }

        if(bmi < 30.0 && bmi >= 25.0){
            interpretation = "Overweight";
        }

        if(bmi >= 30.0){
            interpretation = "Obese";
        }
        return interpretation;
    }

    public void setWeight(double weight){
        this.weight = weight * 0.45359237;
    }

    public void setHeight(double height){
        this.height = height * 0.0254;
    }

    /*public void setInterpretation(String interpretation){
        this.interpretation = interpretation;
    }*/
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        BMI bmi1 = new BMI();

        System.out.println("Enter weight in pounds: ");
        bmi1.setWeight(input.nextDouble());
        
        System.out.println("Enter height in inches: ");
        bmi1.setHeight(input.nextDouble());
        input.close();

        System.out.println("BMI is " + bmi1.getBMI());
        System.out.println(bmi1.getInterpretation());
    }
}

