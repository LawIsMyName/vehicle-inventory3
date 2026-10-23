package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Black", 32000, 18500);
        vehicles[2] = new Vehicle(101123, "Honda Civic", "Blue", 28000, 16500);
        vehicles[3] = new Vehicle(101124, "Chevrolet Malibu", "White", 52000, 12000);
        vehicles[4] = new Vehicle(101125, "Nissan Altima", "Silver", 39000, 14800);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Green", 61000, 22500);

        listOfVehicles(vehicles);
    }
    public static void listOfVehicles(Vehicle[] vehicles){

        int count = 6;

        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i]);
        }

    }
}





