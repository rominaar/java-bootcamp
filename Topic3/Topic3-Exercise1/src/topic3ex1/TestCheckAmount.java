package topic3ex1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCheckAmount {

	@Test
	public void AmountToText() {
		
	double amount = 2523.04;
	CheckAmount checkamount1 = new CheckAmount();
	String textamount = checkamount1.convertToText(amount);
	System.out.println(textamount);

}
}

