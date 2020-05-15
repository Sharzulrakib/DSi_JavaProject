package vehicle_showroom;

import vehicle_showroom.IVehicle;
import vehicle_showroom.CVehicle;
import java.util.Vector;

public class HeavyVehicle extends CVehicle implements IVehicle {
    static Integer hv = 0;
    static Vector<HeavyVehicle> heavyVector = new Vector<HeavyVehicle>();
    
    Integer m_weight;

    @Override
    public void addVehicle() {
        m_engineType = "diesel";
        
        System.out.print("Enter Model Number: ");
        m_modelNumber = scanner.nextLine();
        
        System.out.print("Enter Engine Power: ");
        m_enginePower = scanner.nextLine();
        
        System.out.print("Enter Tire Size: ");
        m_tireSize = scanner.nextLine();
        
        System.out.print("Enter Weight: ");
        m_weight = scanner.nextInt();
        
        hv++;
//  
    }

    @Override
    public void removeVehicle() {
        Integer _size = HeavyVehicle.heavyVector.size();
        
        if(_size > 0){
            HeavyVehicle.heavyVector.removeElementAt(_size-1);
            _size--;
            
            CVehicle.m_visitorNumberFlag--;
            CVehicle.m_visitorNumberHandler();
            
            System.out.println("Heavy Vehicle Removal Succeeded!");
            
            hv--;
            menu.menuDisplayMenu();
            menu.menuChooseOption();
        }else{
            System.out.println("No Available Heavy Vehicle to Remove.");
            
            menu.menuDisplayMenu();
            menu.menuChooseOption();
        }
    }

    @Override
    public void details() {
        Integer _size = HeavyVehicle.heavyVector.size();
        
        for(Integer i=0; i<_size; i++){
            System.out.println("Model Name: "+HeavyVehicle.heavyVector.elementAt(i).m_modelNumber);
            System.out.println("Engine Type: "+HeavyVehicle.heavyVector.elementAt(i).m_engineType);
            System.out.println("Engine Power: "+HeavyVehicle.heavyVector.elementAt(i).m_enginePower);
            System.out.println("Tire Size: "+HeavyVehicle.heavyVector.elementAt(i).m_tireSize);
            
            System.out.println("Weight: "+HeavyVehicle.heavyVector.elementAt(i).m_weight);
        }
        
//        menu.menuDisplayMenu();
//        menu.menuChooseOption();
    }
    
    
}
