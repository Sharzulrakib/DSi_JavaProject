package vehicle_showroom;

import java.util.Scanner;


public class RemoveVehicle {
    Integer removeVehicleOption;
    
    void removeVehicleDisplayMenu() {
        System.out.println("Vehicle Showroom");
        
        System.out.println("1 Normal Vehicle");
        System.out.println("2 Sports Vehicle");
        System.out.println("3 Heavy Vehicle");
        System.out.println("4 Back");
    }
    
    void removeVehicleChooseOption()
    {
        System.out.print("Choose Opntion ( 1 / 2 / 3 / 4): ");
        Scanner scanner = new Scanner(System.in);
        removeVehicleOption = scanner.nextInt();
        
        switch(removeVehicleOption) {
            case 1:
                NormalVehicle normalvehicle = new NormalVehicle();
                normalvehicle.removeVehicle();
                break;
            case 2:
                SportsVehicle sportsvehicle = new SportsVehicle();
                sportsvehicle.removeVehicle();
                break;
            case 3:
                HeavyVehicle heavyvehicle = new HeavyVehicle();
                heavyvehicle.removeVehicle();
                break;
            case 4:
                Menu menu = new Menu();
                menu.menuDisplayMenu();
                menu.menuChooseOption();
                break;
        }
    }
}
