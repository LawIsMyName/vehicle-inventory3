package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner Scanner = new Scanner(System.in);

        // call the array from the method
        Vehicle[] vehicles = createVehicles();

        // add variable as a placeholder at 0
        int  command = 0;

        // add while loop to display menu until the user inputs 5
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

            System.out.println("Enter your choice: ");
            command = Scanner.nextInt();
            Scanner.nextLine();

            // add switch statement to create cases where we call on methods to search for vehicles
            switch (command) {

                case (1) -> listAllVehicles(vehicles);
                case (2) -> findVehiclesByMakeModel(vehicles, Scanner);
                case (3) -> findVehiclesByPriceRange(vehicles, Scanner);
                case (4) -> findVehiclesByColor(vehicles, Scanner);
                case (5) -> System.out.println("goodbye");
                default -> System.out.println("Invalid command, please try again.");
            }
        }

    }

    // add method to search for vehicles by make & model
    public static void findVehiclesByColor(Vehicle[] vehicles, Scanner scanner) {

        System.out.print("Enter vehicle color: ");
        String color = scanner.nextLine();

        for (Vehicle currentVehicle : vehicles) {

            if (currentVehicle != null &&
                    currentVehicle.getColor().equalsIgnoreCase(color)) {

                System.out.println(currentVehicle);
            }
        }
    }

    // add method to search for vehicles by price range
    private static void findVehiclesByPriceRange(Vehicle[] vehicles, Scanner scanner) {

        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble();
        scanner.nextLine();

        for (Vehicle currentVehicle : vehicles) {

            if (currentVehicle != null &&
                    currentVehicle.getPrice() >= min &&
                    currentVehicle.getPrice() <= max) {

                System.out.println(currentVehicle);
            }
        }
    }

    // add method to search for vehicles by make & model
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

    // add method to create array and information inside
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

    // add method for 2 different types of for loops that way all info is printed
    public static void listAllVehicles(Vehicle[] vehicles){
        for (Vehicle vehicle : vehicles) {

            if (vehicle != null) {
                System.out.println(vehicle);
            }
        }

    }
}





