package vehicle_showroom;

import java.util.Scanner;

public class CVehicle {
    String m_modelNumber, m_engineType, m_enginePower, m_tireSize;
    
    Scanner scanner = new Scanner(System.in);
    
    Menu menu = new Menu();
    
    static Integer m_visitorNumber = 0;
    static Integer m_visitorNumberFlag = 0;
    
    static void m_visitorNumberHandler(){
        if(m_visitorNumberFlag==1) m_visitorNumber = 30;
        else if(m_visitorNumberFlag < 1) m_visitorNumber = 0;
    }
}
