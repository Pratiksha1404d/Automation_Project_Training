package Asserations;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AsserationScripts {

@Test
public void TC01(){
	String str="Facebook1";
	Assert.assertEquals(str, "Facebook144");

}

@Test
public void TC02(){
	String str="Facebook1";
	Assert.assertEquals(str, "face", "facebook");  // pass if its returns TRUE
}

@Test
public void TC03(){
	String str="Facebook1";
	Assert.assertNotEquals(str, "face");             // 
}

@Test
public void TC04(){
	String str="Facebook1";
	Assert.assertTrue(str.equals("Facebook1"));        // pass if its returns TRUE
	
}

@Test
public void TC05(){
	String str="Facebook1";
	Assert.assertEquals(str, "face", "facebook");  // pass if its returns TRUE
}

@Test
public void TC06(){
	String str="Facebook1";
	Assert.assertFalse(str.equals("Face"));      // pass if its returns FALSE     
}

@Test
public void TC07(){
	String str=null;
	Assert.assertNull(str);             //pass if value is NULL  
}

@Test
public void TC08(){
	int a=22;
	Assert.assertNotNull(a);       // pass is value is not NULL
}

}
