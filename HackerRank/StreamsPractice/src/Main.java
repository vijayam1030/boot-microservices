import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> lists = Arrays.asList("bHello world1", "aHello world2", "Hello world3");
      //  List result = lists.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        lists
                .stream()
                .filter(s -> s.contains("Hello world"))
                .collect(Collectors.toList());
       List<String> newlists =
               lists.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        List<String> newlists1 = lists.stream().sorted().collect(Collectors.toList());
        System.out.println("newlists1: " + newlists1);

        ArrayList lists2 = Arrays.asList("bHello world1", "aHello world2", "Hello world3");
    List<String> newlists2 = lists2.stream().filter(s -> s.)



        System.out.println(""+newlists);

    }
}