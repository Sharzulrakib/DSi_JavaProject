package vehicle_showroom;

import vehicle_showroom.IVehicle;
import vehicle_showroom.CVehicle;
import java.util.Vector;


public class SportsVehicle extends CVehicle implements IVehicle {
    static Integer sv = 0;
    static Vector<SportsVehicle> sportsVector = new Vector<SportsVehicle>();
    
    boolean turbo = true;

    @Override
    public void addVehicle() {
        m_engineType = "Oil";
        
        System.out.print("Enter Model Number: ");
        m_modelNumber = scanner.nextLine();
        
        System.out.print("Enter Engine Power: ");
        m_enginePower = scanner.nextLine();
        
        System.out.print("Enter Tire Size: ");
        m_tireSize = scanner.nextLine();
        
        sv++;
//        menu.menuDisplayMenu();
//        menu.menuChooseOption();
    }

    @Override
    public void removeVehicle() {
        Integer _size = SportsVehicle.sportsVector.size();
        
        if(_size > 0){
            SportsVehicle.sportsVector.removeElementAt(_size-1);
            _size--;
            
            
//             CVehicle.m_visitorNumberFlag--;
//            CVehicle.m_visitorNumberHandler();
            
            CVehicle.m_visitorNumberFlag--;
            if(m_visitorNumberFlag > 1) m_visitorNumber -= 20;
            else if(m_visitorNumberFlag < 1) m_visitorNumber = 0;
            else if(m_visitorNumberFlag == 1) m_visitorNumber = 30;
                    
            
            System.out.println("Sports Vehicle Removal Succeeded!");
            
            sv--;
            menu.menuDisplayMenu();
            menu.menuChooseOption();
        }else{
            System.out.println("No Available Sports Vehicle to Remove.");
            
            menu.menuDisplayMenu();
            menu.menuChooseOption();
        }
    }

    @Override
    public void details() {
        Integer _size = SportsVehicle.sportsVector.size();
        
        for(Integer i=0; i<_size; i++){
            System.out.println("Model Name: "+SportsVehicle.sportsVector.elementAt(i).m_modelNumber);
            System.out.println("Engine Type: "+SportsVehicle.sportsVector.elementAt(i).m_engineType);
            System.out.println("Engine Power: "+SportsVehicle.sportsVector.elementAt(i).m_enginePower);
            System.out.println("Tire Size: "+SportsVehicle.sportsVector.elementAt(i).m_tireSize);
            
            System.out.println("Turbo: Yes");
        }
        
//        menu.menuDisplayMenu();
//        menu.menuChooseOption();
    }
    
}

