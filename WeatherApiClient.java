package com.example.weather_api_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApiClient {

    public static void main(String[] args) {
        try {
            String apiUrl =
                "https://api.open-meteo.com/v1/forecast?" +
                "latitude=17.3850&longitude=78.4867&current_weather=true";

            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader br =
                new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();

            JSONObject json = new JSONObject(response.toString());
            JSONObject current = json.getJSONObject("current_weather");

            System.out.println("===== Weather Report =====");
            System.out.println("Temperature : " + current.getDouble("temperature") + " °C");
            System.out.println("Wind Speed  : " + current.getDouble("windspeed") + " km/h");
            System.out.println("Weather Code: " + current.getInt("weathercode"));
            System.out.println("==========================");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

		// TODO Auto-generated method stub


