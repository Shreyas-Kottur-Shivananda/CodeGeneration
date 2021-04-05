package FileGenerator;

import com.google.common.base.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CreateJar {
  public static int BUFFER_SIZE = 10240;
  
  private int i;
  
  public void createJar(final File file, final File[] tobeJared) {
    try {
      byte[] buffer = new byte[CreateJar.BUFFER_SIZE];
      int nRead = 0;
      FileOutputStream stream = new FileOutputStream(file);
      Manifest _manifest = new Manifest();
      JarOutputStream out = new JarOutputStream(stream, _manifest);
      for (this.i = 0; (this.i < tobeJared.length); this.i++) {
        {
          if (((Objects.equal(tobeJared[this.i], null) || (!(tobeJared[this.i]).exists())) || (tobeJared[this.i]).isDirectory())) {
          }
          String _name = (tobeJared[this.i]).getName();
          JarEntry jarAdd = new JarEntry(_name);
          jarAdd.setTime((tobeJared[this.i]).lastModified());
          out.putNextEntry(jarAdd);
          File _get = tobeJared[this.i];
          FileInputStream in = new FileInputStream(_get);
          do {
            {
              nRead = in.read(buffer, 0, buffer.length);
              out.write(buffer, 0, nRead);
            }
          } while((nRead <= 0));
          in.close();
        }
      }
      out.close();
      stream.close();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        ex.printStackTrace();
        String _message = ex.getMessage();
        String _plus = ("Error: " + _message);
        System.out.println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
