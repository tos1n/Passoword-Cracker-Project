import java.util.HashMap;
import java.io.UnsupportedEncodingException;
import  java.util.ArrayList;

public class PasswordCracker{
  public void createDatabase(ArrayList<String> commonPasswords, DatabaseInterface database)  {
  
     
	 
      
      for(int i =0; i < commonPasswords.size(); i++){
        
        commonPasswords.get(i).replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1));
        commonPasswords.get(i).replace(commonPasswords.get(i),commonPasswords.get(i)+"2018");
        commonPasswords.get(i).replace('a','@');
        commonPasswords.get(i).replace('e','3');
        commonPasswords.get(i).replace('i','1');
      

        try {
			database.save(commonPasswords.get(i),Sha1.hash(commonPasswords.get(i)));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1'),Sha1.hash(commonPasswords.get(i).replace('i','1')));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('e','3'),Sha1.hash(commonPasswords.get(i).replace('e','3')));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('a','@'),Sha1.hash(commonPasswords.get(i).replace('a','@')));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i)+"2018",Sha1.hash(commonPasswords.get(i)+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace(commonPasswords.get(i),commonPasswords.get(i).substring(0,1).toUpperCase()+commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace(commonPasswords.get(i),commonPasswords.get(i).substring(0,1).toUpperCase()+commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('e','3'),Sha1.hash(commonPasswords.get(i).replace('i','1').replace('e','3')));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('a','@'),Sha1.hash(commonPasswords.get(i).replace('i','1').replace('a','@')));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1')+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1')+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace('i','1').replace(commonPasswords.get(i),commonPasswords.get(i).substring(1).toUpperCase() + commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('e','3').replace('a','@'),Sha1.hash(commonPasswords.get(i).replace('e','3').replace('a','@')));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('e','3')+"2018",Sha1.hash(commonPasswords.get(i).replace('e','3')+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        try {
		database.save(commonPasswords.get(i).replace('a','@')+"2018",Sha1.hash(commonPasswords.get(i).replace('a','@')+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
		e4.printStackTrace();
	}
        try {
			database.save(commonPasswords.get(i).replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018",Sha1.hash(commonPasswords.get(i).replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018"));
		} catch (UnsupportedEncodingException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018"));
		} catch (UnsupportedEncodingException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('e','3').replace('a','@'),Sha1.hash(commonPasswords.get(i).replace('i','1').replace('e','3').replace('a','@')));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('e','3')+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1').replace('e','3')+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace('i','1').replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e7) {
			// TODO Auto-generated catch block
			e7.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('a','@')+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1').replace('a','@')+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace('i','1').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e6) {
			// TODO Auto-generated catch block
			e6.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018"));
		} catch (UnsupportedEncodingException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('e','3').replace('a','@')+"2018",Sha1.hash(commonPasswords.get(i).replace('e','3').replace('a','@')+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('e','3').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace('e','3').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e6) {
			// TODO Auto-generated catch block
			e6.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018",Sha1.hash(commonPasswords.get(i).replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018"));
		} catch (UnsupportedEncodingException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018",Sha1.hash(commonPasswords.get(i).replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018"));
		} catch (UnsupportedEncodingException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('e','3').replace('a','@')+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1').replace('e','3').replace('a','@')+"2018"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('e','3').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)),Sha1.hash(commonPasswords.get(i).replace('i','1').replace('e','3').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))));
		} catch (UnsupportedEncodingException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1').replace('e','3').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018"));
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        try {
			database.save(commonPasswords.get(i).replace('i','1').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018",Sha1.hash(commonPasswords.get(i).replace('i','1').replace('a','@').replace(commonPasswords.get(i),commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1))+"2018"));
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        try {
			database.save((commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)).replace('a','@').replace('i','1')+"2018",Sha1.hash((commonPasswords.get(i).substring(0, 1).toUpperCase() + commonPasswords.get(i).substring(1)).replace('a','@').replace('i','1')+"2018"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        try {
			database.save(commonPasswords.get(i),Sha1.hash(commonPasswords.get(i)));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }

  }

  public String crackPassword(String encryptedPassword, DatabaseInterface database)throws Exception {

    return database.decrypt(encryptedPassword);
    
    }
  public static void main(String[] args) throws Exception{
	    PasswordCracker testCracker=new PasswordCracker();
	DatabaseStandard database1=new DatabaseStandard();
	ArrayList<String> commonPass=new ArrayList<String>();
	commonPass.add("123456");
	commonPass.add("password");
	commonPass.add("12345678");
	commonPass.add("brady");
	testCracker.createDatabase(commonPass,database1);
	database1.printStatistics();
	String code=new String("F35D55B3ACF667911A679B44918F5D88B2400823");
	String discoverPassword=testCracker.crackPassword(code,database1);
	System.out.println("Decrypt: "+code+ " Password: "+discoverPassword+";");
	  }
}
