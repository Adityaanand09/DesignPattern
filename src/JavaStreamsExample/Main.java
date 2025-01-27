package JavaStreamsExample;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        //this will add 100 to the sum of number i.e output will be 106
//       int x = l.stream().reduce(100,(a,b)->a+b);

        //gives the highest element
       Optional<Integer> x = l.stream().reduce((a, b)->a>b?a:b);
       System.out.println(x.get());

//example of collector .group by
       List<String> l1 = new ArrayList<>();
       l1.add("Additya");
        l1.add("Ayuhs");
        l1.add("Virarewqd");
        Map<Integer,List<String>> m = l1.stream().collect(Collectors.groupingBy(w->w.length()));
    System.out.println(m);


    //get 2nd highest element
      int secHighest =  l.stream().sorted().skip(1).findFirst().get();
      System.out.println(secHighest);
    }
}
