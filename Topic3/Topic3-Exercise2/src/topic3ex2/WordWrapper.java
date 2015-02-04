package topic3ex2;

import java.util.ArrayList;

public class WordWrapper {
	public int space=0;
	public double cantOfWords=0;
	ArrayList<String> list = new ArrayList<String>();


	public ArrayList<String> getResult(int length, String testString) {
				
		// First Case
		if(length >= testString.length()){
			String aux1 ='"' + testString + '"' + " ";
			list.add(aux1);
			}
		
		else{
		// Imput without spaces
		space=testString.indexOf(" ", 0);
		if(space == -1){
			String aux2 = '"' + testString.substring(0, length) + '"' + " ";
			list.add(aux2);
			aux2=testString.substring(length);
			testString=aux2;
			getResult(length, aux2);
			}
		
		else{
		//
		space=testString.indexOf(" ", 0);
		if(space >= length) {
			String aux3 = '"' + testString.substring(0, length) + '"' + " ";
			list.add(aux3);
			aux3=testString.substring(length);
			testString=aux3;
			getResult(length, aux3);
			}
		
		else{
		//
		space=testString.indexOf(" ", 0);
		int spaceaux = space;
		while(space<=length && space!=-1){
			spaceaux=space;
			space=testString.indexOf(" ", space+1);
			}
		space=spaceaux;
		String aux4 = '"' + testString.substring(0, space) + '"' + " ";
		list.add(aux4);
		aux4=testString.substring(space+1);
		testString=aux4;
		getResult(length, aux4);
		}
		}
	 }
	return list;
  }
}