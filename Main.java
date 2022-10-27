import java.util.Scanner;

/**
 * Main
 */




class pair{
    public  int first;
    public  int second;
    pair(int first,int second){
        this.first= first;
        this.second=second;
    }

}


// abstraction in java
abstract class Bank{
    public static int interestRate =2;
}

class SBI extends Bank{
    public static int getInterestRate(){
        return interestRate;
    }

}


// java comparables
class Student implements Comparable<Student>{    
    int rollno;    
    String name;    
    int age;    
    Student(int rollno,String name,int age){    
    this.rollno=rollno;    
    this.name=name;    
    this.age=age;    
    }    

    // java annotations
    @Override public int compareTo(Student st){    
    if(age==st.age)    
    return 0;    
    else if(age<st.age)    
    return 1;    
    else    
    return -1;    
    }    
}


// java comparator





class Cuboid { 
    private int length;
    private int width;
    private int height;


    public Cuboid (int length,int width,int height){
        this.length= length;
        this.width= width;
        this.height= height;
    }

    public int getVolume(){
        int volume = length*width*height;
        return volume;
    }
}


final class Temp{
    private int var; 
    Temp(int var){
        this.var=var;
    }

    public void getInfo(){
        System.out.println("this is the object of class Temp"+ " which is having var value"+ this.var);
    }


    public int getVar(){
        return this.var;
    }
   
}





public class Main {

    public static int i;

    // private static void solve(int age){
    //     if(age>=18)System.out.println("you are an adult");
    //     else System.out.println("you are a child");
    // }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // String s = new String("hello world this is the new string ;)");
        // Scanner sc = new Scanner(System.in);
        // System.out.println(s);
        // int arr[]= new int[5];
        // for(int i =0;i< 5;i++)arr[i]= sc.nextInt();
        // for(int i=0;i<5;i++)System.out.println(arr[i]+" ");

        // pair pairArray[]= new pair[3];
        // for(int i=0;i<3;i++){
        //     int a,b;
        //     a=sc.nextInt();
        //     b=sc.nextInt();
        //     pairArray[i]= new pair(a, b);
        // }
        // for(int i=0;i<pairArray.length;i++){
        //     System.out.println(pairArray[i].first+" "+pairArray[i ].second);
        // }
        
        // System.out.println("hello world program!");
        // String s = new String("new string");
        // System.out.println(s instanceof String);

        Scanner sc= new Scanner(System.in);

        // int age;
        // age= sc.nextInt();
        // solve(age);


        // int a,b;
        // System.out.println("enter the value of a");
        // a=sc.nextInt();
        // System.out.println("enter the value of b");
        // b=sc.nextInt();
        // boolean res = a>b?true:false;
        // if(res)System.out.println("a is greater than b");
        // else System.out.println("b is greater than a");


        // String monthString;
        // int x;
        // System.out.println("enter the value corresding to the month");
        // x= sc.nextInt();
        // switch (x) {
        //     case 1:
        //         monthString= "January";
        //         break;
        //     case 2:
        //         monthString= "February";
        //         break;
        //     default:
        //         monthString = "other than January and February";
        //         break;
        // }
        // System.out.println(monthString);

        // System.out.println("enter the value of n and m");
        // int n,m;
        // n= sc.nextInt();
        // m = sc.nextInt();

        // int arr[][] = new int[n][m];
        // for(int i=0;i<n;i++)for(int j=0;j<m;j++)arr[i][j]=sc.nextInt();
            

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // int count;
        // count = sc.nextInt();

        // int  i =0 ;
        // do {
        //     System.out.println(i);
        //     i++;
        // }while(i<count);


        // SBI obj= new SBI();
        // System.out.println(obj.getInterestRate());


        // int t;
        // t= sc.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        // while(t>0){
        //     arr.add(sc.nextInt());
        //     t--;
        // }

        // for(int i:arr)System.out.println(i+" ");


        // LinkedList<String> list = new LinkedList<>();
        // int size;
        // System.out.println("enter the size of the linked list you want");
        // size = sc.nextInt();
        // for(int i = 0;i<size;i++){
        //     list.add(sc.next());
        // }

        // while(size>0){
        //     list.add(sc.next());
        //     size--;
        // }

        // for(String s:list)System.out.println(s);
        // System.out.println(list);

        // System.out.println("linked list is created");


        // System.out.println("enter the position of the element to be removed!");
        // int position= sc.nextInt();
        
        // list.remove(position -1);
        // System.out.println(list);


        // HashSet<Integer> hs = new HashSet<>();

        // int n;
        // n = sc.nextInt();
        // for(int i=0;i<n;i++)hs.add(sc.nextInt());
        // System.out.println("enter the number you want to search");


        // int x;
        // x= sc.nextInt();
        // if(hs.contains(x))System.out.println("yes the element is present");
        // else System.out.println("sorry the element is not present");


        // System.out.println("enter the size of the array");
        // int n;
        // n = sc.nextInt();

        // LinkedList<Integer> arr = new LinkedList<>();
        // for(int i =0;i<n;i++)arr.add(sc.nextInt());
        // Iterator<Integer> iterator = arr.iterator();

        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }


        // System.out.println("enter the size");
        // int n ;
        // n  = sc.nextInt();

        // TreeSet<Integer> ts = new TreeSet<>();
        // for(int i=0;i< n;i++)ts.add(sc.nextInt());
        // System.out.println(ts);


        // int n;
        // n = sc.nextInt();
        // ArrayList<Integer> arryaList = new ArrayList<>();
        // for(int i=0;i<n;i++)arryaList.add(sc.nextInt());
        // HashMap<Integer,Integer> hashMap = new HashMap<>();


        // for(int i:arryaList){
        //     if(hashMap.containsKey(i))hashMap.put(i, hashMap.get(i)+1);
        //     else hashMap.put(i,1);
        // }


        // hashMap.forEach(
        //     (key,value)->{
        //         System.out.println(key.toString()+" "+ value);
        //     }
        // );

        // TreeMap<Integer,String> treeMap = new TreeMap<>();
        
        // treeMap.put(3,"A");
        // treeMap.put(2,"B");
        // treeMap.put(1,"C");

        // treeMap.forEach((key ,value)->{
        //     System.out.println(key.toString()+ " "+ value.toString());
        // });



        // Stack<Integer> st = new Stack<>();
        // st.forEach((x)->{
        //     System.out.println(x);
        // });

        // Cuboid cuboid= new Cuboid(23, 34, 4);
        // System.out.println(cuboid.getVolume());        


        // Temp temp = new Temp(34);
        // temp.getInfo();


        // int a,b;
        // a=sc.nextInt();
        // b=sc.nextInt();
        
        // try{
        //     System.out.println(a/b);
        // }catch(ArithmeticException e){
        //     System.out.println(e);
        // }finally{
        //     System.out.println("finally this block is executed");
        // }

        // System.out.println("this statement is not blocked with the error occurenct it gets executed anywaysq");


        // equals and hashcode in java
        // String a= new String("this is the second string");
        // String b= new String("this is the second string");
        // System.out.println(a.hashCode());
        // System.out.println(b.hashCode());
        // if(a.hashCode()==b.hashCode())System.out.println("both the objects are same");
        // else System.out.println("they are two difference objects");


        // java comparable 



        

    }
}   