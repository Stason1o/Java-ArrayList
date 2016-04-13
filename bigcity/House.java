
package bigcity;

import java.util.ArrayList;

public class House {
    String hNumber;//номер дома
    ArrayList<Floor> floors = new ArrayList<>();//список этажей
    
    House(){//конструктор по-ум-ю. данные генерятся рандомно
        hNumber = "H - " + (int)(Math.random() * 10) + 1;
        for(int i = 0; i < 5; i++)
            floors.add(new Floor());
        ArrayList<Apartment> a = new ArrayList<>();
        a.add(new Apartment());
        floors.add(new Floor(5,a));//исп- е конструктора Floor с парам- ми 
    }
    
    House(String _number, ArrayList<Floor> _floors){//конструктор с пар-ми
        hNumber = _number;
        floors = new ArrayList<>(_floors);
    }
    //set + get
    public void setHNumber(String _number){
        hNumber = _number;
    }
    public String getHNumber(){ return hNumber;}
    
    public ArrayList<Floor> getFloors() { return floors;}//возв список этажей
    //печать данных этажей дома
    public void printHouse(){
        System.out.println("    " + hNumber);
        for(Floor x : floors)
            x.printFloor();
    }
}
