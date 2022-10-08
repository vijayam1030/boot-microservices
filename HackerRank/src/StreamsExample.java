import org.w3c.dom.html.HTMLImageElement;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, List<String>> mp = new HashMap(5);
        ArrayList list = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            list.clear();
            for (int j = 0; j < 5; j++) {

                list.add("test"+j);
            }
            mp.put(i, list);

        }


        System.out.println(mp);
      // Stream.of(mp.values()).forEach(System.out::println);
       // Stream.of(mp.values()).toList().stream().filter(x->x%2 ==0);
       // Stream.of(mp.keySet()).toList().stream().filter(x->{x.stream().filter(x->x%2==0)}).forEach(System.out::println);

        mp.keySet().stream().filter(x-> x%2 ==0)
                .forEach(x -> System.out.println(mp.get(x).stream().filter( s-> s.endsWith("2")).collect(Collectors.toList())));


    }
}
