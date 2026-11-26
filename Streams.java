import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public void main(String[] args){
        run();
    }

    public int multiply_val(int x){
        return x * 2;
    }

    public void forLoopSum(){
        int total = 0;
        for(int i = 0; i< 10; i++){
            total += i+1;
        }
        //Prints 55
        System.out.println(total);
    }

    public void streamSum(){
        int total = IntStream.rangeClosed(1, 10)
            .sum();
        //Prints 55
        System.out.println(total);
    }

    public void streamMap(){
        int total = IntStream.rangeClosed(1, 10)
            .map(x -> multiply_val(x))
            //.map((int x) -> {return x * 2;})
            .sum();
        //Prints 110
        System.out.println(total + " double");
    }

    public void streamMapLambda2(){
        int value = IntStream.rangeClosed(1, 10)
        // Works without return statement and variable type, type is inferred
            .map((x) -> x * 2)
            .sum();
        System.out.println(value);
    }

     public void streamAverage(){
        int[] list = {1, 2, 6, 10, 19};
        double average = IntStream.of(list).average().getAsDouble();
        System.out.println(average);
    }

    public void streamPipeline(){
       String[] names = {"Robert", "Bob", "Alice", "Andrew", "Suzy", "Ned", "Al", "Tom"};

        List<String> sortedNames = Stream.of(names)
            .filter(n -> n.length() < 4)
            .sorted()
            .map(n -> n.toUpperCase())
            .collect(Collectors.toList());
        
        //Prints [AL, BOB, NED, TOM]
        System.out.println(sortedNames);
        
    }

    public void run(){
        streamSum();
        streamMap();
        streamAverage();
        streamPipeline();
    }
}


