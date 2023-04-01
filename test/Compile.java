import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Compile{

  public static void main(String Args[])
  {
      String[] paths = new String[5];
       
      try {
        paths = search(Args[0]);
      } catch (Exception e) {
          //TODO: handle exception
      }
      File[] files = new File[paths.length];

      for (int i = 0; i < paths.length; i++) {
          files[i] = new File(paths[i]);
          System.out.println(files[i].getAbsolutePath());
          if (files[i].getName() == Args[1]) {
              System.out.println("Found File!");
          } else System.out.println("File Not Found!");
      }
  }

    public static String[] search(String folder) {
    List<String> paths = new ArrayList<String>();

    File fld = new File(folder);
    String[] files = fld.list();
    File[] filez = new File[files.length];

    for (int i = 0; i < files.length; i++)
      filez[i] = new File(folder + "\\" + files[i]);

    for (File file: filez) {
            
        if (file.isDirectory())
            search(file.getAbsolutePath());
        else {
            //System.out.println(file.getAbsolutePath());
            paths.add(file.getAbsolutePath());
        }
    }

    return paths.toArray(new String[paths.size()]);
  }

}
