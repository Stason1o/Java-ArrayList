
package bigcity;

import java.util.ArrayList;

public class Floor {
    public int fNumber;//номер этажа
    public ArrayList<Apartment> apartments = new ArrayList<>();//список квартир
    
    Floor(){//конструктор по-ум-ю. данные генерятся рандомно
        fNumber = (int)(Math.random() * 6) + 1;
        for(int i = 0; i < 3; i++)
            apartments.add(new Apartment());
        ArrayList<Citizen> q = new ArrayList<>();
        ArrayList<Room> r = new ArrayList<>();
        q.add(new Citizen());
        r.add(new Room());
        apartments.add(new Apartment("ap - 4",q,r));//использование конструктора Apartment с параметрами 
    }
    
    Floor(int _number, ArrayList<Apartment> _apartments){//конструктор с пар-ми
        fNumber = _number;
        apartments = new ArrayList<>(_apartments);
    }
    //set + get
    public void setFNumber(int _number){
        if(fNumber > 0 && fNumber < 30)
            fNumber = _number;
    }
    public int getFNumber() { return fNumber; }
    
    public ArrayList<Apartment> getApps() { return apartments;}//возвращает список квартир на этаже
    //печать данных этажа
    public void printFloor(){
        System.out.println("      floor - " + fNumber);
        for(Apartment x : apartments)
            x.printApartment();
    }
}
