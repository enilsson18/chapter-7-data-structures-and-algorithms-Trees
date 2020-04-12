public class Listing {
  //data in the struct
  private String name;
  private int idNum;
  private float gpa;
  
  //initializer method
  public Listing(String name, int idNum, float gpa){
    this.name = name;
    this.idNum = idNum;
    this.gpa = gpa;
  }
  
  //test if the two name and inputed mode equal eachother
  public int compareTo(String key){
    return (name.compareTo(key));
  }
  
  //make a deeepcopy in memory of the student
  public Listing deepCopy(){
    Listing node = new Listing(name,idNum,gpa);
    return node;
  }
  
  //getters
  public String getKey(){
    return name;
  }
  
  public String getName(){
    return name;
  }
  
  public int getID(){
   return idNum; 
  }
  
  public float getGpa(){
    return gpa;
  }
  
  //simple tostring method 
  public String toString(){
   return "Name: " + name + ", ID: " + idNum + ", GPA: " + gpa;
  }
}