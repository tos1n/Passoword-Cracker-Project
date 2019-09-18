
public class CustomHashMap implements CustomHashMapInterface{

	
	private class Table {
	      private String key;
	      private String value;

	      Table(String key, String value) {
	            this.key = key;
	            this.value = value;
	      }
	      public String getKey(){
	    	     return key;
	    	   }
	    	   public String getValue(){
	    	     return value;
	    	   }
	}
	  private int n;    
	  private int size;
	  private int shifts;

	  private Table[]myHashTable ;
	  private static final int FIXED_SIZE = 909091;
	public CustomHashMap() {
		this(FIXED_SIZE);
	}
	
	public CustomHashMap( int length) {
			n = length;
		 myHashTable = new Table[length];
        for (int x = 0; x < length; x++) {
        	myHashTable[x] = null;
        }
        size = 0;
        shifts =0;
	}
	
	public void put(String key, String value) {
		 int hash = hashFunction(key);
	       
	        int count = 0;
	        while (myHashTable[hash] != null && !myHashTable[hash].getKey().equals(key)) {
	        	shifts++;
	        	count++;
	        	hash = (hash + 1) % n;
	        	if(count >= n) 
	        		break;
	        }
	             
	        if(myHashTable[hash] == null) {
	        size++;
	        myHashTable[hash] = new Table(key, value);
	        } else if(size == n) {
	        	System.out.println("the table is filled.");
	        }
		
	}

	
	public String get(String key) {
		 int hash = hashFunction(key);

	        while (myHashTable[hash] != null && !myHashTable[hash].getKey().equals(key)) {
	        	 hash = (hash + 1) % n;
	        }
	             
	        if (myHashTable[hash] == null) {
	        	return "";
	        } else {
	        	return myHashTable[hash].getValue();
	        }   
	}

	
	public boolean containsKey(String key) {
		
		if(get(key).equals("")) {
    		return false;
    	} else {
    		return true;
    	}
	}
	
	 public int hashFunction(String key) {
		 
		
	    	int address=key.hashCode()%n;
	    	return (address>=0)?address:(address+n);
	    }
	 
	 public int size() {
		 return size;
	 }
	 public double Probes() {
			return (double)shifts/(double)n;
		}
		
		public int shifts() {
			return shifts;
		}
		public double LoadFactor() {
			return (double)size/(double)n;
		}
		public int Indexes() {
			return n;
		}
	   
	
	
}
