package MoneyCalculator.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Vector;
import java.net.URL;

public class FileManager {
    
    public static Vector load(String fileName) throws FileNotFoundException, IOException{
        Vector result = new Vector();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String[] aux;
            for(String line; (line = br.readLine()) != null; ) {
                aux = line.split("@");
                if (aux.length == 3){
                    result.add(new Money(aux[0], aux[1], aux[2]));
                }
            }
        }

        return result;
    }
    
    public static double getURLRequest(String first, String second){
        double result = 0;
        try{
            URL requestURL = new URL("https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/" + first +"/"+ second + ".json");
            HttpURLConnection con = (HttpURLConnection) requestURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine = "";
            for (int i = 0; i < 3; i++){
                inputLine = in.readLine();
            }
            result = Double.parseDouble(inputLine.split(":")[1]);
            con.disconnect();
        }
        catch(Exception e){}
        return result;
    }
    
}
