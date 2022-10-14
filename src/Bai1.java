import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        String demo = "C:\\Users\\minhd\\OneDrive\\Desktop\\Source\\MD2_Bai16_baitap\\src\\demo.txt";
        String copyOfDemo = "C:\\Users\\minhd\\OneDrive\\Desktop\\Source\\MD2_Bai16_baitap\\src\\CopyOfDemo.txt";
        List<String> strings = readDataFromFile(demo);
        writeDataFromFile(copyOfDemo,strings);
    }

    public static List<String> readDataFromFile(String path){
        List<String> string = new ArrayList<>();
        try{
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                string.add(line);
            }
            br.close();
        }catch (Exception e){
            System.out.println("DMM ngu vcl");
        }
        return string;
    }

    public static void writeDataFromFile(String path,List<String> strings){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str: strings) {
                bufferedWriter.write(str+"\n");
            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}