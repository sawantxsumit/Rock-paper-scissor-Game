


public class j_class {

    //one java file can have only one public class  
    public static void main(String[] args) {
        System.out.println("class");
        Employee p1 =new Employee();
        Employee p2 =new Employee();
        
        //setting attribute
        p1.id=19;
        p1.name= "Sumit sawant";
        p1.salary= 50000;
        p2.id=21;
        p2.name= "shubham";
        p2.salary= 60000;
        
        p1.printdetail();
        p1.getSalary();
        p2.printdetail();
        p2.getSalary();
     
    }
}

