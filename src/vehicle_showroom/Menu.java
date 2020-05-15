package vehicle_showroom;

import java.util.Scanner;


public class Menu {
    int menuOption;
    AddVehicle addvehicle = new AddVehicle();
    RemoveVehicle removevehicle = new RemoveVehicle();
    ///VehicleVisitors vehiclevisitors = new VehicleVisitors();
    
    void menuDisplayMenu() {
        System.out.println("Vehicle Showroom");
        
        System.out.println("1 Add Vehicle");
        System.out.println("2 Remove Vehicle");
        System.out.println("3 Show List of Vehicles with Current Expected Visitors");
        System.out.println("4 Show List of Vehicles with Details");
    }
    
    void menuChooseOption()
    {
        System.out.print("Choose Option ( 1 / 2 / 3 / 4): ");
        Scanner scanner = new Scanner(System.in);
        menuOption = scanner.nextInt();
        
        switch(menuOption) {
            case 1:
                addvehicle.addVehicleDisplayMenu();
                addvehicle.addVehicleChooseOption();
                ///System.out.println("Add Vehicle");
                break;
            case 2:
                removevehicle.removeVehicleDisplayMenu();
                removevehicle.removeVehicleChooseOption();
                ///System.out.println("Remove Vehicle");
                break;
            case 3:
                System.out.println("\nExpected Visitors Number: " + CVehicle.m_visitorNumber);
                System.out.println("Normal Vehicle: " + NormalVehicle.nv);
                System.out.println("Sports Vehicle: " + SportsVehicle.sv);
                System.out.println("Heavy Vehicle: " + HeavyVehicle.hv);
                
                menuDisplayMenu();
                menuChooseOption();
                break;
            case 4:
                System.out.println("\nNormal Vehicle Details.");
                System.out.println("------------------------\n");
                NormalVehicle normalvehicle = new NormalVehicle();
                normalvehicle.details();
        
                System.out.println("\nSports Vehicle Details.");
                System.out.println("------------------------\n");
                SportsVehicle sportsvehicle = new SportsVehicle();
                sportsvehicle.details();
        
                System.out.println("\nHeavy Vehicle Details.");
                System.out.println("------------------------\n");
                HeavyVehicle heavyvehicle = new HeavyVehicle();
                heavyvehicle.details();
                
                //menuDisplayMenu();
                //menuChooseOption();
                break;
        }
        
    }
}
