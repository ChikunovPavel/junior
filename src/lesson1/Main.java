package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> list = Arrays.asList(new User("Pavel",25), new User("Dima",34),new User("Egor",22));
        list.stream().map(user -> new User(user.name, user.page - 5)).filter(user -> user.page <=25).forEach(System.out::println);




















//        list.stream().filter(str -> str.length() > 4).filter(str -> str.contains("о")).forEach( System.out::println);
//
////        Arrays.asList(1,2,3,4,5).stream().map(chislo  -> "число" + chislo + " квадрат числа" +  chislo * chislo).forEach(System.out::println);
//
//        Arrays.asList(1,2,3,4,5,5,5).stream().sorted().distinct().forEach(System.out::println);

//        lesson1.PlainInterface plainInterface = new lesson1.PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x + y);
//            }
//        };

//        lesson1.PlainInterface plainInterface = (x,y) ->x+y;
//        lesson1.PlainInterface plainInterface1 = (x,y) -> Integer.compare(x,y);


//        lesson1.PlainInterface plainInterface = Integer::sum;
//        lesson1.PlainInterface plainInterface1 = Integer::compare;
//        System.out.println(plainInterface.action(5,6));
//        System.out.println(plainInterface1.action(1,5));

    }
}