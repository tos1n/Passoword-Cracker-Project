
public class DatabaseMine implements DatabaseInterface{

	private CustomHashMap myHashMap;
	
	public DatabaseMine() {
		myHashMap = new CustomHashMap(909091);
	}
	
	String olderPassword = "";
	public String save(String plainPassword, String encryptedPassword) {
		if(myHashMap.containsKey(encryptedPassword)) {
			 olderPassword = myHashMap.get(encryptedPassword);
			myHashMap.put(encryptedPassword, plainPassword);
			return olderPassword;
		}
		myHashMap.put(encryptedPassword, plainPassword);
		return olderPassword;
	}

	@Override
	public String decrypt(String encryptedPassword) {
		
		if  (myHashMap.get(encryptedPassword) == null){
    	  
        return "";
        
      }
      
       return myHashMap.get(encryptedPassword);
	}

	@Override
	public int size() {
		
		return myHashMap.size();
	}

	
   
	
	
		public void printStatistics() {
			System.out.println("*** DatabaseMine Statistics ***");
			System.out.println("Size is " + size() + " passwords");
			System.out.println("Number of Indexes is " +myHashMap.Indexes() );
			System.out.println("Load factor is " + myHashMap.LoadFactor() );
			System.out.println("Average number of probes is " + myHashMap.Probes());
			System.out.println("Number of displacements(due to collisions) " + myHashMap.shifts() );
			System.out.println("*** End DatabaseMine Statistics ***" );
		}
		
	

}
