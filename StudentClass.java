public class StudentClass {

    //OOPS -> user defined data types
    public static  class Student{
        //creating new data type
        String name;
       private int rno;
        double percent;

        public int getRno(){    //Getter
            return rno;
            
        }

        public void setRno(int rno){     //Setter
          this.rno=rno;    //this keyword for class attribute rollno and rno is an argument
        }
    }
    //method
    public static void change(Student x){
        x.name="Rohan";
    }


    public static void main(String args[]){

        
        Student std=new Student(); //objects
        std.name = "Siddharth";
        std.rno=12;
        std.percent=90.12;
        System.out.println(std.name);   //Siddharth
        change(std);
        System.out.println(std.name);   //Rohan 
         //Getter-> to access private entity in same package

        //classes are passsed by reference
        //we have to declare the class outside main function
        //classes can be in different file but same package

        /*Access Modifiers
        1.Public -> all package
        2.Private-> same class
        3.Default -> same package
        */

        System.out.println(std.getRno());
        std.setRno(50); //setter
        System.out.println(std.rno);

        //this keyword-> 



        
    }
}
