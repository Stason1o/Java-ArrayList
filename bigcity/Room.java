package bigcity;

public class Room {
    public String type;//тип квартиры
    float area;//площадь квартиры
    
    Room(){//конструктор по-ум-ю. данные генерятся рандомно
        String typesOfRoom[] = { "balcony", "bathroom", "kitchen" , "bedroom", "kidroom", "hall" };//массив типов комнат
        int b = (int)(Math.random()*6);
        type = typesOfRoom[b];
        if(b < 3)// если комната будет или балконом или ванной или кухней, то 
            area = (float)(Math.random() * 50) + 20;//площадь будет от 20 до 69
        else area = (float)(Math.random() * 100) + 20;//в друго мслучае площадь = от 20 до 119
    }
    
    Room(String _type, float _area){//конструктор с пар-ми
        type = _type;
        area = _area;
    }
    //set + get
    public void setType(String _type){
        type = _type;
    }
    public void setArea(float _area){
        if(_area > 0)
            area = _area;
    }
    public String getType() { return type; }
    public float getArea()  { return area; }
    //печать даных комнаты
    public void printRoom(){
        System.out.print("          " + type);
        System.out.println("  " + area);
    }
}
