package Bai2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            String PATH_FILE = "C:\\Users\\minhd\\OneDrive\\Desktop\\Source\\MD2_Bai16_baitap\\src\\Bai2\\bai2.csv";
            br = new BufferedReader(new FileReader(PATH_FILE));

            while ((line = br.readLine()) != null){
                printCountry(parseCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void printCountry(List<String> countries){
        System.out.println(
                "Country [id= "
                        + countries.get(0)
                        + ", code= " + countries.get(1)
                        + ", name=" + countries.get(2)
                        + "]");
    }
}
