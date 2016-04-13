
package bigcity;

import java.util.ArrayList;

public class Street {
    String streetName;//имя улицы
    public ArrayList<House> houses = new ArrayList<>();//список домов
    
    Street(){//конструктор по-ум-ю. данные генерятся рандомно
        streetName = "Street - " + (int)(Math.random() * 10) + 1;
        for(int i = 0; i < 5; i++)
            houses.add(new House());
        ArrayList<Floor> h = new ArrayList<>();
        h.add(new Floor());
        houses.add(new House("Street - 5", h));
    }
    
    Street(String _name, ArrayList<House> _houses){//конструктор с параметрами
        streetName = _name;
        houses = new ArrayList<>(_houses);
    }
    //set + get
    public void setStreetName(String _name){
        streetName = _name;
    }
    public String getStreetName(){ return streetName; }
   
    
    public ArrayList<House> getHouses(){ return houses; }//возвращает список домов
    //печать данных дома
    public void printStreet(){
        System.out.println("  " + streetName);
        for(House x : houses)
            x.printHouse();
    }
}
