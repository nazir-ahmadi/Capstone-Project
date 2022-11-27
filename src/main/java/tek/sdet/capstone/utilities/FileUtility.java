package tek.sdet.capstone.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {
	
	public static FileInputStream getFileInputStream(String filepath) throws FileNotFoundException {
        return new FileInputStream(new File(filepath));
  }

//	public static FileInputStream getFileInputStream(String filepath) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
