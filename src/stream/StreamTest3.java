package stream;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.*;

public class StreamTest3 {
    public static void main(String[] args) {
        Stream<String> strStream=Stream.of(new String[]{"aaa","bbb","ccc"});

        String result=strStream.collect(new ConcatCollector());

        System.out.println(result);
    }
}

class ConcatCollector implements Collector<String,StringBuilder,String>{

    @Override
    public Supplier<StringBuilder> supplier() {
       return ()->new StringBuilder();
    }

    @Override
    public BiConsumer<StringBuilder, String> accumulator() {
        return (sb,s)->sb.append(s);
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (sa,sb)->sa.append(sb);
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return sb->sb.toString();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}
