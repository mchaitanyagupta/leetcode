// optional class is container for nullable values to prevent null pointer exception
//used to replace null checks

import java.util.Optional;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//these are the three static methods ofOptional class of, empty, ofNullable
		String s = "jonas khanwald";
		Optional<String> name = Optional.of(s); //Optional.of methos is used when there is guarantee to create a object of optional class
		System.out.println(name.orElse("martha"));
		System.out.println(name.get());//get method when is Optional is not null or else gives null pointerexception
		
		Optional<String> n = Optional.empty();
		System.out.println(n.orElse("martha")); //orElse instancemethod as if n is null here martha will br printed
		
		Optional<String> se = Optional.ofNullable(null); //ofNullable method is used when there is no guarante or not sure about the value
		System.out.println(se.orElseGet(() -> "mikkel"));
		
		String hero = null;
		Optional<String> heroOptional = Optional.ofNullable(hero);
		
		heroOptional.ifPresent(System.out::println);

		// optional class is container for nullable values to prevent null pointer exception
//used to replace null checks

import java.util.Optional;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//these are the three static methods ofOptional class of, empty, ofNullable
		String s = "jonas khanwald";
		Optional<String> name = Optional.of(s); //Optional.of methos is used when there is guarantee to create a object of optional class
		System.out.println(name.orElse("martha"));
		System.out.println(name.get());//get method when is Optional is not null or else gives null pointerexception
		
		Optional<String> n = Optional.empty();
		System.out.println(n.orElse("martha")); //orElse instancemethod as if n is null here martha will br printed
		
		Optional<String> se = Optional.ofNullable(null); //ofNullable method is used when there is no guarante or not sure about the value
		System.out.println(se.orElseGet(() -> "mikkel"));
		
		String hero = null;
		Optional<String> heroOptional = Optional.ofNullable(hero);
		
		heroOptional.ifPresent(System.out::println);
		
		Optional<String> st = Optional.ofNullable("adam");
		Optional<Integer> len = st.map(String::length);
		System.out.println(len.orElse(0));
		
		Optional<Integer> chev = Optional.of(101);
		chev.filter((i) -> i >100).ifPresent(System.out::println);
		
		Optional<Optional<Integer>> ooi = Optional.ofNullable(Optional.empty());
		ooi.ifPresent(System.out::println);
	}
}

	}
}
