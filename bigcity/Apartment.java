
package bigcity;

import java.util.ArrayList;

public class Apartment {
    public String aNumber;//номер квартиры
    public ArrayList<Citizen> citizens = new ArrayList<>();//список жителей
    public ArrayList<Room> rooms = new ArrayList<>();//список комнат
    
    Apartment(){//конструктор по умолчанию. Все данные генерируются псевдослучайно
        aNumber = "ap - " + (int)(Math.random() * 24) + 1;//рандомим номер квартиры
        int q = (int)(Math.random()*4) + 1;
        for(int i = 0; i < q - 1; i++)//количество жителей варьируется от 1 до 4
            citizens.add(new Citizen());
        citizens.add(new Citizen("Valera",25,true));//добавление жителя
        int qr = (int)(Math.random()*3 ) + 3;
        for(int i = 0; i < qr - 1; i++)//кол-во комнат варьируется от 1 до 4
            rooms.add(new Room());
        rooms.add(new Room("bedroom", 50.4f));//добавление комнаты в arrayList
    }
    
    Apartment(String _number, ArrayList<Citizen> _citizens, ArrayList<Room> _rooms){//конструктор с параметрами
        aNumber = _number;
        citizens = new ArrayList<>(_citizens);
        rooms = new ArrayList<>(_rooms);
    }
    //set + get 
    public void setANumber(String _number){
        aNumber = _number;
    }
    public String getANumber() { return aNumber; }//возв номер квартиры
    
    public ArrayList<Room> getRooms() { return rooms;}//возвращает список комнат
    
    public ArrayList<Citizen> getCitizens() { return citizens;}//возвращает список жителей
    //
    public void printApartment(){//вывод данных о жителях и комнат
        System.out.println("        " + aNumber);
        for(Citizen x : citizens)
            x.printCitizen();
        for(Room x : rooms)
            x.printRoom();
    }
}
