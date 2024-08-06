package stream;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

//collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)구현
public class StreamTest {

    public static void main(String[] args) {

        //collect(Supplier<R> supplier,
        // BiConsumer<R,? super T> accumulator,
        // BiConsumer<R,R> combiner)

        //Interface Supplier<T>
        //Type Parameters:
        //T - the type of results supplied by this supplier

        // Interface BiConsumer<T,U>
        // Type Parameters:
       // T - the type of the first argument to the operation
       // U - the type of the second argument to the operation

        Stream<String> stream=Stream.of("apple","banana","cherry");

        //파라미터 지정

        //supplier
        Supplier<List<String>> supplier=ArrayList::new;

        //Accumulator <--BiConsumer
        BiConsumer<List<String>,String> accumulator=List::add;

        //combiner
        BiConsumer<List<String>,List<String>> combiner=List::addAll;

        //collect 사용
        List<String> result=stream.collect(supplier,accumulator,combiner);



    }

}



