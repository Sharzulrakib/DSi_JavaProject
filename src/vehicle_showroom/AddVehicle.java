package vehicle_showroom;

import java.util.Scanner;


public class AddVehicle {
    Integer addVehicleOption, addVehicleWeight;
    String addVehicleModelNumber, addVehicleEngineType, addVehicleEnginePower, addVehicleTireSize;
    
    void addVehicleDisplayMenu() {
        System.out.println("Vehicle Showroom");
        
        System.out.println("1 Normal Vehicle");
        System.out.println("2 Sports Vehicle");
        System.out.println("3 Heavy Vehicle");
        System.out.println("4 Back");
    }
    
    
    void addVehicleChooseOption()
    {
        System.out.print("Choose Opntion ( 1 / 2 / 3 / 4): ");
        Scanner scanner = new Scanner(System.in);
        addVehicleOption = scanner.nextInt();
        
        switch(addVehicleOption) {
            case 1:
                NormalVehicle normalvehicle = new NormalVehicle();
                normalvehicle.addVehicle();
                
                NormalVehicle.normalVector.add(normalvehicle);
                System.out.println("Normal Vehicle Creation and Addition Succeeded!");
                
                CVehicle.m_visitorNumberFlag++;
                CVehicle.m_visitorNumberHandler();
              
                Menu normalMenu = new Menu();
                normalMenu.menuDisplayMenu();
                normalMenu.menuChooseOption();
                break;
            case 2:
                SportsVehicle sportsvehicle = new SportsVehicle();
                sportsvehicle.addVehicle();
                
                SportsVehicle.sportsVector.add(sportsvehicle);
                System.out.println("Sports Vehicle Creation and Addition Succeeded!");
                
                CVehicle.m_visitorNumberFlag++;
                if(CVehicle.m_visitorNumberFlag==1) CVehicle.m_visitorNumber = 30;
                else if(CVehicle.m_visitorNumberFlag > 1) CVehicle.m_visitorNumber += 20;
                
                Menu sportsMenu = new Menu();
                sportsMenu.menuDisplayMenu();
                sportsMenu.menuChooseOption();
                break;
            case 3:
                HeavyVehicle heavyvehicle = new HeavyVehicle();
                heavyvehicle.addVehicle();
                
                HeavyVehicle.heavyVector.add(heavyvehicle);
                System.out.println("Heavy Vehicle Creation and Addition Succeeded!");
                
                CVehicle.m_visitorNumberFlag++;
                CVehicle.m_visitorNumberHandler();
                
                Menu heavyMenu = new Menu();
                heavyMenu.menuDisplayMenu();
                heavyMenu.menuChooseOption();
                break;
            case 4:
                Menu menu = new Menu();
                menu.menuDisplayMenu();
                menu.menuChooseOption();
                break;
        }
    }
}
