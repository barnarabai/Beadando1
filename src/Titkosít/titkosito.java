package Titkosít;

import java.io.*;

public class titkosito {
    public static void main(String[] args) {
        BufferedReader br;
        PrintWriter pw;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            pw = new PrintWriter("output.txt");

            String line = br.readLine();

            while (line != null) {
                String out = "";
                int[] chars = line.chars().toArray();

                for (int i = 0; i < chars.length; i++) {
                    if (String.valueOf((char) (chars[i])).equals("z"))      //Mivel a "z" karaktert kódolásban már nem betű követné, ezért kivételt kell írni
                    {
                        out += "a";
                    }
                    else if (String.valueOf((char) (chars[i])).equals("Z"))  //Nagybetűre is
                    {
                        out += "A";
                    }
                    else //Általános lefutás
                    {
                        out += String.valueOf((char) (chars[i] + 1));
                    }
                }
                pw.println(out);
                line = br.readLine();
                System.out.println(out);
            }
            br.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
