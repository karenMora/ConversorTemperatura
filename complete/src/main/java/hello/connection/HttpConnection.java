/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author estudiante
 */
public class HttpConnection {
    private static String GET_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static String GET_ID ="&appid=Q1QZFVJQ21K7C6XM";
    private static final String USER_AGENT = "Mozilla/5.0";
    
    public static String getJson(String city) throws IOException{
        String url=GET_URL + city + GET_ID;
        URL obj =new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        String jsonString="";
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            jsonString=response.toString();
        }
        return jsonString;
    }
}
