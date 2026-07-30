import java.util.*;
public class myfailure {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int  arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out.print("Orginal array");
System.out.print(Arrays.toString(arr));
int last=arr[n-1];
for(int i=n-1;i>0;i--){
    arr[i]=arr[i-1];
}
arr[0]=last;

System.out.print("new array");
//Arrays.stream(arr).forEach(System.out::print);
    }
}
