import java.util.*;
public class queue {
public  static void main(String[]args){
Queue<person> su=new LinkedList<>();
su.add(new person("alex",23));
su.add(new person("nive",19));
System.out.print(su.poll());
System.out.println(su.peek());
System.out.print(su.peek());
System.out.print(su.remove());
}
static record person(String name,int age){
}
}

