package topic3ex3;

import java.io.File;
import java.util.ArrayList;

public class RecentFileList {
	ArrayList<File> rf = new ArrayList<File>();
	
	public RecentFileList(){
		this.rf=null;             //empty list
		}
	
	public RecentFileList(ArrayList<File> rf){
		this.rf=rf;             //empty list
		}
	
	
	public void Open(File file){
		int flag=0;
		for(int i=0;i<=rf.size()-1;i++){             
			if(rf.get(i).equals(file)){                 //check if the file is in the list
				rf.remove(i);
				rf.add(file);
				flag=1;
			}
		 }
		if(flag==0){                           //the file is not on the list
			if(rf.size()<15){                        
				rf.add(file);
			  }
			else{
				rf.remove(0);
				rf.add(file);
			  }
		   }
	}
	
  
	
	public void getRecentFileList(){
		for (int i = 0; i < rf.size(); i++){
			 System.out.println(rf.get(i));
			}
		System.out.println("End of List");
	}
}

