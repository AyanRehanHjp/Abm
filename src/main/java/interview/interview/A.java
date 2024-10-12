package interview.interview;


import java.util.*;
import java.util.stream.Collectors;
public class A {
    public static void main(String[] args) {
        //Ek list of integer bnao jo duplicate ko remove kr k only even number ko print kare.
        List<Integer> lst = Arrays.asList(2,3,3,4,3,2,4,5,6,7,8,9);
        List <Integer> ss = lst.stream().filter(n-> n%2==0).distinct().collect(Collectors.toList());
        System.out.println(ss);

        //Ek list of strings ko alphabetical order mein sort karne ka code likho using Stream API.
        List<String> str = Arrays.asList("Abid","Zaka","Rehan","Sadaf","Tausif","Amir");
        List <String> srt = str.stream().sorted().collect(Collectors.toList());
        System.out.println(srt);

//        Java mein ek code likho jo 1 se 10 tak ke numbers ka sum Stream API ka use kar ke calculate kare.
        List<Integer>num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int su  = num.stream().mapToInt(n-> n).sum();
        System.out.println(su);
//        Ek program likho jo employee objects ki list ko filter kare jaha salary 50,000 se zyada ho using Stream API.
   List<Employee>  employee = Arrays.asList(new Employee("Alice", 60000),
            new Employee("Bob", 45000),
            new Employee("Charlie", 70000),
            new Employee("David", 50000));
   List <Employee> sss = employee.stream().filter(e->e.getSalary()>50000).collect(Collectors.toList());
        System.out.println("Employes Name Who has  jiski salary zyada hai 50000 se");
        sss.forEach(e->  System.out.println(e.getName()));

//        Java code likho jo ek list mein se duplicate elements ko remove kar ke unique list return kare using Stream API.
        List <Integer> dupmix = Arrays.asList(22,2,2,2,22,2,1,4,5,6,6);
        List <Integer> rmvd = dupmix.stream().distinct().collect(Collectors.toList()); // Using distinct insertion order
        Set<Integer> hs = new HashSet<>(dupmix); // Using set unordered
        System.out.println(rmvd);
        System.out.println(hs);
//        Hashing an Object address
        String re = "Ayan Rehan";
        A a3 = new A();
        System.out.println(a3.hashCode()+"  " +re.hashCode());

        String rz = "ABC";
        String rj = "ABC";
        System.out.println(rz.compareTo(rj));


    }
}
 class Employee {

    private String name;
    private  int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
