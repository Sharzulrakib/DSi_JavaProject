package vehicle_showroom;

import vehicle_showroom.IVehicle;
import vehicle_showroom.CVehicle;
import java.util.Vector;


public class NormalVehicle extends CVehicle implements IVehicle {
    static Integer nv = 0;
    static Vector<NormalVehicle> normalVector = new Vector<NormalVehicle>();

    @Override
    public void addVehicle() {
        System.out.print("Enter Model Number: ");
        m_modelNumber = scanner.nextLine();
        
        System.out.print("Enter Engine Type: ");
        m_engineType = scanner.nextLine();
        
        System.out.print("Enter Engine Power: ");
        m_enginePower = scanner.nextLine();
        
        System.out.print("Enter Tire Size: ");
        m_tireSize = scanner.nextLine();
        
        nv++;
//        menu.menuDisplayMenu();
//        menu.menuChooseOption();
    }

    @Override
    public void removeVehicle() {
        Integer _size = NormalVehicle.normalVector.size();
        
        if(_size > 0){
            NormalVehicle.normalVector.removeElementAt(_size-1);
            _size--;
            
            CVehicle.m_visitorNumberFlag--;
            CVehicle.m_visitorNumberHandler();
            
            System.out.println("Normal Vehicle Removal Succeeded!");
            
            nv--;
            menu.menuDisplayMenu();
            menu.menuChooseOption();
        }else{
            System.out.println("No Available Normal Vehicle to Remove.");
            
            menu.menuDisplayMenu();
            menu.menuChooseOption();
        }
    }

    @Override
    public void details() {
        Integer _size = NormalVehicle.normalVector.size();
        
        for(Integer i=0; i<_size; i++){
            System.out.println("Model Name: "+NormalVehicle.normalVector.elementAt(i).m_modelNumber);
            System.out.println("Engine Type: "+NormalVehicle.normalVector.elementAt(i).m_engineType);
            System.out.println("Engine Power: "+NormalVehicle.normalVector.elementAt(i).m_enginePower);
            System.out.println("Tire Size: "+NormalVehicle.normalVector.elementAt(i).m_tireSize);
        }
        
     // menu.menuDisplayMenu();
     // menu.menuChooseOption();
    }
    
}
