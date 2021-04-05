package FileGenerator

import java.io.File
import java.io.FileOutputStream
import java.util.jar.JarOutputStream
import java.util.jar.JarEntry
import java.io.FileInputStream
import java.util.jar.Manifest

class CreateJar {
	public static int BUFFER_SIZE = 10240;
	
	int i
	
	
	def public void createJar(File file, File[] tobeJared){
		try {
		var buffer = newByteArrayOfSize(BUFFER_SIZE)
		var nRead = 0
		var stream = new FileOutputStream(file);
		var out = new JarOutputStream(stream, new Manifest());
		
		for( i = 0; i < tobeJared.length ; i++){
			if (tobeJared.get(i) == null || !tobeJared.get(i).exists()
            || tobeJared.get(i).isDirectory()){
            
            }
            
            var jarAdd = new JarEntry(tobeJared.get(i).getName());
            jarAdd.setTime(tobeJared.get(i).lastModified());
        	out.putNextEntry(jarAdd);
        	
        	var in = new FileInputStream(tobeJared.get(i));
        	
       		do{
       			 nRead = in.read(buffer, 0, buffer.length);
       			  out.write(buffer, 0, nRead);
       		}while(nRead <= 0) 
       		
       		in.close()
     
        	
		}
		
		out.close();
      	stream.close();
     } 	
      	catch (Exception ex) {
      ex.printStackTrace();
      System.out.println("Error: " + ex.getMessage());
    }
		
	}
	

}