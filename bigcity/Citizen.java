
package bigcity;

public class Citizen {
    String name;//имя
    int age;//возраст
    boolean sex;//пол true - мужской false  - женский
    
    public static String[] wNames = {//массив женских имен
           "Masha", "Sveta", "Tanea", "Nastea", "Ira", 
           "Aliona", "Lena", "Natasha", "Olya", "Dasha"
    };
    
    public static String[] mNames = {//массив мужских имен
            "Alex", "Dima", "Sasha", "Max", "Vovan",
            "Valera", "Vasea", "Vitea", "Tolea", "Igori"
    };
    
    Citizen(){//конструктор по умолчанию
        int chance;//шанс
        chance = (int)(Math.random()*10);//генерируется случ число
        int wORm;//мужчина или женщина
        wORm = (int)(Math.random()*2);
        if(wORm == 0){// если 0 - мужчина
            name = mNames[chance];// записывается имя из мужского массива имен на позиции chance
            sex = true;
        }
        else if(wORm == 1){//если 1 - женщина
            name = wNames[chance];// записывается имя из женского массива имен на позиции chance
            sex = false;
        }
        age = (int)(Math.random()*90) + 5;//возраст от 5 до 94
        
    }
    Citizen(String _name, int _age, boolean _sex){//конструктор с параметрами
        name = _name;
        if(age > 0 && age < 100)
            age = _age;
        else 
            age = _age / 2;
        sex = _sex;
    }
//set + get
    public void setName(String _name){
        name = _name;
    }
    public void setAge(int _age){
        if(age > 0 && age < 100)
            age = _age;
    }
    public void setSex(boolean _sex){
        if(sex != _sex)
            sex = !sex;
    }
    
    public String getName() { return name; }
    public int getAge()     { return age;  }
    public boolean getSex() { return sex;  }
    
    //печать данных жителя
    public void printCitizen(){
        System.out.print("          " + name);
        System.out.print("  " + age);
        System.out.println("  " + sex);
    }
}
