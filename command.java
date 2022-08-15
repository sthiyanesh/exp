import java.io.*;
public class command{
    public static void main(String args[]){
        final String dosCommand = "git add .";
        try {
            final Process process = Runtime.getRuntime().exec(dosCommand );
            final InputStream in = process.getInputStream();
            int ch;
            String s="";
            while((ch = in.read()) != -1) {
                s+=(char)ch;
            }
            String s1[] = s.split("\n");
            for(String temp:s1){
                System.out.println(temp+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
