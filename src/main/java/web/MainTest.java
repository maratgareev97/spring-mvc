package web;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MainTest {
    public static void main(String[] args){
//        CarService carService = new CarServiseImpl();
//        System.out.println(carService.listCar());
        List<Integer> list = new ArrayList<>(asList(0,1,2,3,4,5,6));
        System.out.println(list);
        System.out.println(list.subList(0,3));
    }
}
