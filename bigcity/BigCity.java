
package bigcity;

import java.util.ArrayList;

public class BigCity {

    public static void main(String[] args) {
        ArrayList<Street> streets = new ArrayList<>();// список улиц

        for(int i = 0; i < 5; i++) // добавление 5 улиц, которые рандомно генерятся
            streets.add(new Street());
        int maxWomen = 0;
        int counter = 0;//счетчик женщин
        String _house = "";//адрес дома
        String _street = "";//адрес улицы
        for(int i = 0; i < streets.size(); i++){//размер вектора streets
            for(int j = 0; j < streets.get(i).getHouses().size(); j++){//размер вектора houses 
                counter = 0;//счетчик обнуляется после анализирования дома
                for(int k = 0; k < streets.get(i).getHouses().get(j).getFloors().size(); k++){//размер вектора floors
                    for(int m = 0; m < streets.get(i).getHouses().get(j).getFloors().get(k).getApps().size(); m++){//размер вектора apartments
                        for(int n = 0; n < streets.get(i).getHouses().get(j).getFloors().get(k).getApps().get(m).getCitizens().size(); n++){//размер вектора citizens
                            if(!(streets.get(i).getHouses().get(j).getFloors().get(k).getApps().get(m).getCitizens().get(n).sex == true))//если не мужчина, счетчик увеличивается
                                counter++;
                        }
                    }
                    
                }
                if(maxWomen < counter){//если счетчик больше макс кол-ва женщин
                    maxWomen = counter;//данные счетчика присваиваются в переменную
                    _house = streets.get(i).getHouses().get(j).getHNumber();//запоминается номер дома
                    _street = streets.get(i).getStreetName();//запоминается номер улицы
                }
            }
        }
        System.out.println("Max quantity of women is on " + _street + " in " + _house + " " );
        
        String __street = "";
        int max = 0;//наибольший возраст
        for(Street s:streets){//проходим по улицам
            for(House h:s.getHouses()){//по домам
                for(Floor f:h.getFloors()){//по этажам
                    for(Apartment a:f.getApps()){//по квартирам
                        for(Citizen c:a.getCitizens()){//по жителям
                            if(max < c.getAge()){//если возраст текущегго жителя больше max 
                                max = c.getAge();//max запоминает возраст
                                __street = s.getStreetName();//запоминается улица на которой находится этот чувак
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The oldest person lives at " + __street + " with age " + max);
        
        float density = 0f;//плотность
        String str = "";
        String hse = "";
        for(Street s:streets)//проходим по улицам
            for(House h:s.getHouses())//по домам
                for(Floor f:h.getFloors())//по этажам
                    for(Apartment a:f.getApps()){//по квартирам
                        float curPlot = 0f;//текущая плотность
                        float totArea = 0f;//общая площадь квартиры
                        
                        for(Room r:a.getRooms())//проходим по комнатам
                            totArea += r.getArea();//суммыруем площадь каждой комнаты
                        curPlot = a.getCitizens().size() / totArea;//подсчет плотности (кол-во жителей на общую площадь квартиры)
                            if(curPlot > density){//если текущ плотность больше density
                                density = curPlot;// density запоминает ее
                                str = s.getStreetName();//запоминается улица
                                hse = h.getHNumber();//запоминается дом
                        }
                    }
        System.out.println("Apartment with max density - " + density + " is at " + str + " " + hse);
        for(Street x: streets){ // вывод всей информации о городе с форматированием.
            x.printStreet();
        }
    }
}

