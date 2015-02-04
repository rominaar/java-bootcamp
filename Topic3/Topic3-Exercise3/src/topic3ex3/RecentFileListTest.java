package topic3ex3;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import org.junit.Test;

public class RecentFileListTest {

	@Test
	//Empty list
	public void testRunFirstTime() {
		RecentFileList rf1 = new RecentFileList();
		//ArrayList<File> list1 = new ArrayList<File>();
		rf1.getRecentFileList();
	  }
	
	//List not empty
	File file1 = new File("File1");
	File file2 = new File("File2");
	File file3 = new File("File3");
	File file4 = new File("File4");
	File file5 = new File("File5");
	File file6 = new File("File6");
	
		@Test
		public void testOpenFile() {
		
		ArrayList<File> recentFiles = new ArrayList<File>();
		recentFiles.add(file1);
		recentFiles.add(file2);
		recentFiles.add(file3);
		recentFiles.add(file4);
		recentFiles.add(file5);
		RecentFileList rf2 = new RecentFileList(recentFiles);
		
		rf2.Open(file1);
		rf2.getRecentFileList();
		}

		
		@Test
		public void testOpenNewFile() {
		
		ArrayList<File> recentFiles = new ArrayList<File>();
		recentFiles.add(file1);
		recentFiles.add(file2);
		recentFiles.add(file3);
		recentFiles.add(file4);
		recentFiles.add(file5);
		RecentFileList rf3 = new RecentFileList(recentFiles);
		
		rf3.Open(file6);
		rf3.getRecentFileList();
		}
}


