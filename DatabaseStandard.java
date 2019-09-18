import java.util.HashMap;
import java.util.Map;

public class DatabaseStandard implements DatabaseInterface{
  HashMap<String, String> myHashMap ;
  public DatabaseStandard(){
    this.myHashMap = new HashMap<String, String>();
  }
  String olderPassword = "";
  public String save(String plainPassword, String encryptedPassword){
		  
		   if(myHashMap.get(encryptedPassword) == null){
			   
			   myHashMap.put(encryptedPassword, plainPassword);
			   
		    return olderPassword ;
		    }
		   
		    else if(myHashMap.get(encryptedPassword) != null){
		    	
		    olderPassword = myHashMap.get(encryptedPassword);
		    
		    myHashMap.replace(olderPassword,plainPassword);
		    }
    return olderPassword;
    
 }
  public String decrypt(String encryptedPassword){
   
      if  (myHashMap.get(encryptedPassword) == null){
    	  
        return "";
        
      }
      
       return myHashMap.get(encryptedPassword);

     }
  public int size(){
      
      return myHashMap.size();
    }
  
  public void printStatistics(){ 
	  
	  System.out.println( " *** DatabaseStandard Statistics ***");
	  System.out.println( " *** Size is "+ myHashMap.size() +" passwords ***");
	  System.out.println( " *** Initial Number of Indexes when Created "+37 );
	  System.out.println( " *** End DatabaseStandard Statistics ***");
    
  }
}
