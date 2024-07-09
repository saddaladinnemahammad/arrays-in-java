
import java.util.;

public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                System.out.print("");
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
    }
}



test1.java


import java.util.*;
public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[0],second=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first)
              first=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second&&arr[i]!=first)
              second=arr[i];
        }
        if(n<2){
            System.out.println("-1");
        }
        else{
            System.out.println(first*second);
        }
    }
}
