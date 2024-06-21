package ObjectPractices;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.engineStart();
        car.color = "RED";
        System.out.println(car.color);
        System.out.println("=======");
        car.engineStart();
        Car yourCar = new Car();
        yourCar.engineStart();
        yourCar.color = "PINK";
        yourCar.engineStart();

yourCar.model = "Mazda CX-9";
yourCar.seats = 4;
yourCar.engineSize = 3.7;
yourCar.color = "Red";
yourCar.year = 2014;
yourCar.gasRemain = 18;
int consumptionPerOneDrive = 3;

        if((yourCar.gasRemain -=consumptionPerOneDrive) <=10){
            System.out.println("So small amount of gas remain - 10 gal");
        } else {
            System.out.println("Let's drive more!");
        }
        yourCar.carInfo();
        System.out.println("==============");
        yourCar.gasRemain = 40;
        yourCar.travel();
        yourCar.travel();
        yourCar.travel();
        yourCar.travel();
        yourCar.travel();
    }
}
