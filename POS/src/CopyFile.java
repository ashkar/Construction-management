import java.io.*;
public class CopyFile
  {
  public static void main(String args[]) throws Exception
    {
    BufferedReader br = new BufferedReader(
                        new FileReader("G:\\test1\\test1.accdb"));
    BufferedWriter bw = new BufferedWriter(
                        new FileWriter("G:\\test1\\test2.accdb"));
    String s, space="  ";
    int num=0;
    while (br.ready())
      {
      s=br.readLine();
      num++;
      bw.write(String.valueOf(num));
      bw.write(space);
      bw.write(s);
      bw.newLine();
      }
    bw.close();
    }
  }
