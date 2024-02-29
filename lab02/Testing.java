package lab02;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Testing {
    public static void main(String[] args) {
        ArrayList<Human> arr = new ArrayList<>();
        arr.add(new Human("Timofey", "Kolomchuk", LocalDate.of(2007, 10, 10), 55));
        arr.add(new Human("Petr", "Palochnikov", LocalDate.of(2014, 3, 2), 35));
        arr.add(new Human("Oleg", "Tverdov", LocalDate.of(1995, 5, 17), 73));
        arr.add(new Human("Serafim", "Nikolskiy", LocalDate.of(2004, 9, 30), 52));
        arr.add(new Human("Tatiama", "Zliy", LocalDate.of(2001, 11, 14), 81));
        arr.add(new Human("Ivan", "Ivanov", LocalDate.of(1999, 2, 25), 93));
        Stream<Human> stream = arr.stream();
        stream.filter((h)-> h.getBirthday().getYear() > 2000).forEach((x) ->System.out.println(x));
        Stream<Human> stream1 = arr.stream();
        System.out.println();
        stream1.sorted(Comparator.comparingInt(Human::getWeight).reversed()).forEach((x) ->System.out.println(x));
        Stream<Human> stream2 = arr.stream();
        System.out.println();
        stream2.forEach((x) -> {x.setWeight(x.getWeight() + 3); System.out.println(x);});
        Stream<Human> stream3 = arr.stream();
        System.out.println();
        Optional<Human> fin = stream3.reduce((a, b) -> {
            a.setWeight(a.getWeight()+b.getWeight());
            return a;
        });
        System.out.println(fin.get().getWeight());

    }
}
