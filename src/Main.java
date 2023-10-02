public class Main {
    public static void main(String[] args) {
        // task 1

        Car firstCar = new Car(); // creates new object of the class Car
        firstCar.brand = "Volkswagen";
        firstCar.model = "Polo";
        firstCar.year = 2020;

        firstCar.startEngine();
        firstCar.stopEngine();

        // task 2

        Calculator smartInstance = new Calculator();  //creates new object of the class Car
        smartInstance.addition(5, 8);
        System.out.println(smartInstance.addition(5, 8));
        smartInstance.isGreather(5.13, 6.23);
        System.out.println(smartInstance.isGreather(5.13, 6.23));

        // task 3

        NumberManipulator manipulator = new NumberManipulator();


        int number = 3;
        System.out.println("Initial number:" + number);

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("Number after increment:" + incrementedNumber);

        int number2 = 5;
        System.out.println("Initial number:" + number2);

        int descrementNumber = manipulator.descrementByOne(number2);
        System.out.println("Number after descrement:" + descrementNumber);


    }
}
