package topic3ex2;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class WordWrapperTest {
	
	private WordWrapper ww = new WordWrapper();

	@Test
	public void testRowLength60() {
		 ArrayList<String> rows = new ArrayList<String>();
		 String testString = "123456789012345678901234567890";
		 rows = ww.getResult(60, testString);
		 for (int i = 0; i < rows.size(); i++){
			 System.out.println(rows.get(i));
			 }
		}
	
	@Test
	public void testRowLength5() {
		 ArrayList<String> rows = new ArrayList<String>();
		 String testString = "Exelent";
		 rows = ww.getResult(5, testString);
		 for (int i = 0; i < rows.size(); i++){
			 System.out.println(rows.get(i));
			 }
		}
	
	@Test
	public void testRowLength7() {
		 ArrayList<String> rows = new ArrayList<String>();
		 String testString = "Hello Word!";
		 rows = ww.getResult(7, testString);
		 for (int i = 0; i < rows.size(); i++){
			 System.out.println(rows.get(i));
			 }
		}
	
	@Test
	public void testRowLength3() {
		 ArrayList<String> rows = new ArrayList<String>();
		 String testString = "a b c d e f";
		 rows = ww.getResult(3, testString);
		 for (int i = 0; i < rows.size(); i++){
			 System.out.println(rows.get(i));
			 }
		}
	
}
