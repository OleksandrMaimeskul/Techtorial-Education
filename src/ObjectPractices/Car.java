package ObjectPractices;

public class Car {

    String model;
    String color;
    int year;
    int seats;

    double engineSize;

    int gasRemain;

    public void engineStart () {
        System.out.println("Press the start button," +
                " don't forget to push the brake at the same time" + " the color of the  car is >> " + color);
    }
public void carInfo (){
    System.out.println("Model: " + model + ", year: " + year + ", with seats number: " + seats + ", with engine size: "
            + engineSize + ", with gas amount remain: " + gasRemain);
}
public void travel(){
        gasRemain = gasRemain-2;
    System.out.println("Left over gas is: " + gasRemain);
}

}
