//method references are introduces in java 8
// there are four types of method references
//Class::staticMethodName  2) object::instanceMethodName  3) class::instanceMethodName 4)class::new
//improve code to functional programming from object oriented

import java.util.function.Function;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    //Function is a functional interface, which has a single abstract methos apply,
	    //like other functional interfaces like consumer, suplier,predicate, runnable etc..
		//first type
		//example by using lambda function
		Function<Integer, Double> sqrtByLambda = (input) -> Math.sqrt(input);
		System.out.println(sqrtByLambda.apply(4));
		
		//by using Class::staticMethodName
		Function<Integer, Double> sqrtByMethodReference = Math::sqrt;  //class is Math, static method is sqrt
		System.out.println(sqrtByMethodReference.apply(4));
		
		//second type method reference
		//by using lambda expression
		Function<String, String> concatbyLambda = (input) -> input.concat("bad");
		System.out.println(concatbyLambda.apply("breaking "));
		
		//by using Object::instanceMethodName
		//for this we need a Object so,
		String s = "game of ";
		Function<String, String> concatByMethodReference = s::concat;
		System.out.println(concatByMethodReference.apply("thrones"));
		
		//third type method reference
		//by using lambda expression
		Function<String, String> toUCByLambda = (input) -> input.toUpperCase();
		System.out.println(toUCByLambda.apply("dark"));
		
		//by using class::instanceMethodName
		Function<String, String> toUCByMethodReference = String::toUpperCase;
		System.out.println(toUCByMethodReference.apply("peaky blinders"));
		
		//fourth type of method reference, this is reference to constructor of new class
		//by using lambda expression
		List<String> los = Arrays.asList("ram", "ravi", "ramesh", "raju", "ram");
		Function<List<String>, Set<String>> sos = (list) -> new HashSet<>(list);
		System.out.println(sos.apply(los));
		
		//by using class::new method reference
		Function<List<String>, Set<String>> sosByMethodReference = HashSet::new;
		System.out.println(sosByMethodReference.apply(los));
		
	}
}
