package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        Vehicle[] vehicles = createVehicles();

        int  command = 0;

        while (command != 5) {

            System.out.println("""
                    
                    ===== VEHICLE MENU =====
                    1 - List all vehicles
                    2 - Search by make/model
                    3 - Search by price range
                    4 - Search by color
                    5 - Quit
                    ========================
                    """);
        }

        System.out.println("Enter your choice: ");
        command = Scanner.nextInt();
        Scanner.nextLine();

        switch (command) {
            case 1 -> listAllVehicles(vehicles);
            case 2 -> findVehiclesByMakeModel(vehicles, Scanner);
            case 3 -> findVehiclesBypriceRange(vehicles, Scanner);
            case 5 -> System.out.println("goodbye");
            default -> System.out.println("Invalid command, please try again.");
        }



        listAllVehicles(vehicles);
    }
    private static void findVehiclesByMakeModel(Vehicle[] vehicles, Scanner scanner) {

        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        for (Vehicle currentVehicle : vehicles) {

            if (currentVehicle != null &&
                    currentVehicle.getMakeModel().equalsIgnoreCase(makeModel)) {

                System.out.println(currentVehicle);
            }
        }
    }

    private static Vehicle[] createVehicles() {
        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Black", 32000, 18500);
        vehicles[2] = new Vehicle(101123, "Honda Civic", "Blue", 28000, 16500);
        vehicles[3] = new Vehicle(101124, "Chevrolet Malibu", "White", 52000, 12000);
        vehicles[4] = new Vehicle(101125, "Nissan Altima", "Silver", 39000, 14800);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Green", 61000, 22500);
        return vehicles;
    }

    public static void listAllVehicles(Vehicle[] vehicles){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        //        int count = 6;

//        for (int i = 0; i < count; i++) {
//            System.out.println(vehicles[i]);
//        }
    }
}





