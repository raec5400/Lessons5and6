package Lesson5;

public class Student {
    //define properties of the object
    //instance variable = properties
    //usually declared as private
    private String name;
    private int test1, test2, test3;
    
    //constructor
    //public <Name of the Class>
    //this runs when object is made (instantiated)
    //with the key word new
    //it's job is to initialize some or all of the
    //properties / instance variables of the object
    public Student(){
//        name = "";
//        test1 = 0;
//        test2 = 0;
//        test3 = 0;
//        System.out.println("Student has been created.");
//          call another constructor from This constructor
          this("",0,0,0);
          //This is called CHAINING constructors
          //this = look else where in the class for another constructor
    }
    //another constructor to set all properties as you make it
    public Student(String n, int t1, int t2, int t3){
        name = n;
        test1 = t1;
        test2 = t2;
        test3 = t3;
    }
    //3rd contructor to clone properties from another student
    public Student(Student other){
//        name = other.name;
//        test1 = other.test1;
//        test2 = other.test2;
//        test3 = other.test3;
          this(other.name, other.test1, other.test2, other.test3);     
    }
    
    //add instance methods to make up the abilities of the student
    //access to name to se it and get it
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    //access to test scores
    public void setScore(int which, int score){
        if(which==1)test1 = score;
        else if(which==2)test2 = score;
        else test3 = score;
    }
    public int getScore(int which){
        if(which==1)return test1;
        else if(which==2)return test2;
        else return test3;
    }
    
    //average and highscore methods
    public int getHighScore(){
        int highscore = test1;
        if(test2 > highscore) highscore = test2;
        if(test3 > highscore) highscore = test3;
        return highscore;
    }
    
    public int getAverage(){
        return (test1+test2+test3)/3;
    }
    
    public String validateData(){
        String em=null;
        if(name.equals(""))
            em = "Name is required.";
        if(test1<0||test1>100||test2<0||test2>100||test3<0||test3>100)
            if(em==null)
                em="At least 1 mark is out of the acceptable range";
            else 
                em+= "\nAt least 1 mark is out of the acceptable range";
        if (em != null)
            em+="\nPlease re-enter all the data\n";
        return em;
    }
    
    //toString runs automatically when you print an object
    //all objects get a toString from parent Object class
    //but you can make your own better version
    public String toString(){
        String s = "Name:\t"+name;
        s+="\nTest 1: \t" +test1;
        s+="\nTest 2: \t" +test2;
        s+="\nTest 3: \t" +test3;
        s+= "\n------------------";
        s+="\nAverage: \t" + getAverage();
        return s;
    }
}
