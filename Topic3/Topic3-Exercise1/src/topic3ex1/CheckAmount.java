package topic3ex1;

public class CheckAmount {
	
	private double amount;
	private String textIntegerAmount;
	private String textDecimalAmount;
	
	private final String[] ten = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
	"nineteen" };


	public String convertToText(double amount) {
		setAmount(amount);
		return getThousands() + " " + getHundreds()+ " " + getTens()+ "and " + getDecimals()+ " ";
				
	}
	
	//Number-->Texts
	public void setAmount(double amount){
	String textAmount = amount + "";
	String[] parts = textAmount.split("\\.");
	this.textDecimalAmount = parts[1];
	this.textIntegerAmount = parts[0];
	}
	
	
	//Decimals
	public String getDecimals() {
		if (textDecimalAmount.equals("")) {
			return "0/100" + " ";
		 	}
		return textDecimalAmount + "/100" + " ";
		    }

	//Integer
	
	//Thousands
	public String getThousands() {
		if (textIntegerAmount.length() < 4) {	return null;	}
		
		int position = (textIntegerAmount.length() - 4);
		int thvalue = getValue(position);
		if (thvalue == 0) {	return "" ;	}
		
		return Convert (thvalue, position);
				
	}
	
	
	//Hundreds
		public String getHundreds() {
			if (textIntegerAmount.length() < 3) {	return null;	}
			
			int position = textIntegerAmount.length() - 3;
			int huvalue = getValue(position);
			if (huvalue == 0) {	return "";	}
			
			return Convert (huvalue, position);
					
		}
		
	
		//Tens
		public String getTens() {
			//Unit
			if (textIntegerAmount.length() < 1) {	return null;	}   //only decimals
					
			int position = textIntegerAmount.length() - 1;
			int unitvalue = getValue(position);
			
			if (textIntegerAmount.length() < 2) {        //tens < 10
				if (unitvalue == 0) { return null; }       
				else {	return Convert (unitvalue, position); }       //return unit
				}
			
			//Ten   
			 int tenvalue = getValue(position - 1);
			 if (tenvalue == 0) {
				 if (unitvalue == 0) { return null; } 
				 else {	 return Convert (unitvalue, position); }
			 	}
			 if (tenvalue == 1) { return ten[unitvalue] + " "; }         //number between 10 and 19
			 
			 if (unitvalue == 0) { return Convert (tenvalue, position); }
			 
			 return (Convert (tenvalue, position-1) + "-" + Convert (unitvalue, position) + " " );
		}
			

	
	private int getValue(int position) {
		 return Integer.parseInt(String.valueOf(textIntegerAmount.charAt(position)));
		}

	
	public String Convert(int number,int position){
	 switch(position){
	 case 3:	switch(number){
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		default: return "";
		}
	 case 2:	switch(number){
		case 1: return "ten";
		case 2: return "twenty";
		case 3: return "thirty";
		case 4: return "forty";
		case 5: return "fifty";
		case 6: return "sixty";
		case 7: return "seventy";
		case 8: return "eighty";
		case 9: return "ninety";
		default: return "";
		}
	 case 1:	switch(number){
		case 1: return "one hundred";
		case 2: return "two hundred";
		case 3: return "three hundred";
		case 4: return "four hundred";
		case 5: return "five hundred";
		case 6: return "six hundred";
		case 7: return "seven hundred";
		case 8: return "eight hundred";
		case 9: return "nine hundred";
		default: return "";
		}
	 case 0:	switch(number){
		case 1: return "one thousand";
		case 2: return "two thousand";
		case 3: return "three thousand";
		case 4: return "four thousand";
		case 5: return "five thousand";
		case 6: return "six thousand";
		case 7: return "seven thousand";
		case 8: return "eight thousand";
		case 9: return "nine thousand";
		default: return "";
		}
	
	default: return "";
		}
		}
}




