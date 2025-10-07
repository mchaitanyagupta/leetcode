//Functional interface should contain only one abstract method but can contains any noof static and default methods
//example for functional interface is predicate,comparator, consumer, supplier, runnable



import java.util.*;
import java.util.function.*;
import java.util.stream.*;

@FunctionalInterface
interface A{
    void show();
}
class Person{
    private int age;
    private String name;
    Person(int age, String name){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int n){
        this.age = n;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Person(" + age + " "+name+")";
    }
}
public class Main
{
	public static void main(String[] args) {
// 	    List<Integer> l = Arrays.asList(2,3,4,5,67,675,4,4,2,232,45,56,7,6);
// 		Collections.sort(l, (a,b) -> b.compareTo(a));
// 		System.out.println(l);
		
// 		Predicate<String> sj = s -> s.charAt(0)=='j';
// 		System.out.println(sj.test("jail"));
		
		
// 		A obj = new A()
// 		{
// 		    public void show(){
// 		        System.out.println("show method");
// 		    }
// 		};
// 		obj.show(); // anonymus class
		
// 		List<String> ls = Arrays.asList("apple", "banana", "sde3", "amazon", "microsoft","po");
// 		List<String> swfl = ls.stream().filter(s -> s.length() >= 4).collect(Collectors.toList());
// 		System.out.println(swfl);
		
// 		List<Integer> sqaurel = l.stream().map(n -> (n*n)).collect(Collectors.toList());
// 		System.out.println(sqaurel);
		
		//sorting persons by age
		List<Person> pl = new ArrayList<>();
        pl.add(new Person(20,"thomas"));
        pl.add(new Person(42,"arthur"));pl.add(new Person(19,"polly"));
        pl.add(new Person(42,"john"));pl.add(new Person(23,"lizze"));
        // Collections.sort(pl, (a, b) -> Integer.compare(a.getAge(), b.getAge()));
        // System.out.println(pl.toString());
        
        // List<Double> dl = Arrays.asList(23.4, 23.23, 32.5, 656.6, 2.5);
        // int count = (int)dl.stream().filter(n -> n > 10).count();  //count() returns long not int
        // System.out.println(count);
        
        // List<List<String>> lols = Arrays.asList(Arrays.asList("hello","i"), Arrays.asList("am", "chaitanya"));
        // List<String> lolsfm = lols.stream().flatMap(List::stream).collect(Collectors.toList());
        // System.out.println(lolsfm);
        
        // List<String> names = pl.stream().map(Person::getName).collect(Collectors.toList());
        // System.out.println(names);
        
        // Set<String> set = pl.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
        // System.out.println(set);
        
        // String peakyBlinders = pl.stream().map(Person::getName).collect(Collectors.joining(", "));
        // System.out.println(peakyBlinders);
        
        // int totage = pl.stream().collect(Collectors.summingInt(Person::getAge));
        // System.out.println(totage);
        
        // Map<Integer, List<Person>> gpba = pl.stream()
        //                                     .collect(Collectors.groupingBy(Person::getAge));
        // gpba.forEach((a, b) -> System.out.println(a+" "+b)); 
        // //here b is a list of persons but we printed asusal as integer
        // //as println method calls String.valueOf(x) method to convert any object to string
        // // public void println(Object x) {
        // //     String s = String.valueOf(x);
        // //     synchronized (this) {
        // //         print(s);
        // //         newLine();
        // //     }
        // // }
        // //string.valueOf() method calls toString() method so, if we have to string method then nonedd to call explicitly
        // // public static String valueOf(Object obj) {
        // //     return (obj == null) ? "null" : obj.toString();
        // // }
        
        
        //names of persons grouped by age
        // Map<Integer, String> ngba = pl.stream().collect(
        //                             Collectors.groupingBy(
        //                                 Person::getAge,
        //                                 Collectors.mapping(Person::getName, Collectors.joining(", "))
        //                                 )
        //                             );
        // ngba.entrySet().forEach(System.out::println);
        
        //list of persons below and above age 25
        // Map<Boolean, List<Person>> pba25 = pl .stream().collect(
        //                                     Collectors.partitioningBy(p -> p.getAge() > 25)
        //                                     );
        // pba25.entrySet().forEach(System.out::println);
        //names of persons below and above age 25
        // Map<Boolean, String> pba25 = pl .stream().collect(
        //                                     Collectors.partitioningBy(
        //                                         p -> p.getAge() > 25,
        //                                         Collectors.mapping(Person::getName, Collectors.joining(", "))
        //                                         )
        //                                     );
        // pba25.entrySet().forEach(System.out::println);
        //using groupingBY, paartitionintBy java automatically gives the list of personswhen you dont use downstream collector
        //here we want string with all names combined so we use downstream collector to extract name and combine to single string
	
	   // Stream.of("one", "two", "three", "four", "four")
    //      .filter(e -> e.length() > 3)
    //      .distinct().sorted()
    //      .peek(e -> System.out.println("Filtered value: " + e))
    //      .map(String::toUpperCase)
    //      .peek(e -> System.out.println("Mapped value: " + e))
    //      .collect(Collectors.toList());
         
        //  List<Person> men = Arrays.asList(pl.stream()
        //                   .filter(p -> p.getName().equals("thomas"))
        //                   .toArray(Person[]::new));//return new array of type
        // men.forEach(System.out::println);
        
        // Boolean lp = pl.stream().anyMatch(p -> p.getName().length() > 4);
        // System.out.println(lp);
        
        // Optional<Person> s = pl.stream()
        //                 .filter(p -> p.getName().equals("polly"))
        //                 .findFirst();
        //                 System.out.println(s);
        //                 //Optional is usually returned from methods that may or may not have a result
        
        
        // List<List<Integer>> loli = Arrays.asList(Arrays.asList(1,2,3),
        //                                         Arrays.asList(4,5,6),
        //                                         Arrays.asList(7,8,9,8,750));
        // List<Integer> lolitl = loli.stream().flatMap(List::stream).collect(Collectors.toList());
        // System.out.println(lolitl);
	    
	    //List<String> los = Arrays.asList("white","jessie","hank","Gustavo","luco","mike","saul");
	   // Map<Integer, Long> cnonbyl = los.stream()
	   //                 .collect(Collectors.groupingBy(
	   //                     String::length,Collectors.counting()));
    //     cnonbyl.entrySet().forEach(System.out::println);
        
        
        //for this you cannot use two downstream collectors to count and to list
        // record LengthData(long count, List<String> words) {}

        // Map<Integer, LengthData> dataByLength = los.stream()
        //     .collect(Collectors.groupingBy(
        //         String::length,
        //         Collectors.collectingAndThen(
        //             Collectors.toList(),
        //             list -> new LengthData(list.size(), list)
        //         )
        //     ));
        // dataByLength.entrySet().forEach(System.out::println);
        
        //comparision bw stream and parallel
        // List<Double> lod = Arrays.asList(23.2,34.53,456.5,8.0,55.8,42.34);
        // System.out.println(System.currentTimeMillis());
        // Double sum = lod.stream().reduce(0.0, (a,b) -> a+b);
        // System.out.println(System.currentTimeMillis());
        // List<Double> lod2 = Arrays.asList(23.2,34.53,456.5,8.0,55.8,42.34);
        // sum = lod2.parallelStream().reduce(0.0, (a,b) -> a+b);
        // System.out.println(System.currentTimeMillis());
        // System.out.println(sum);
        
	}
}
