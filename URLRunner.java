package java_synergy.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class URLRunner {
    public static void main(String[] args ) throws URISyntaxException, IOException {
        URI uri = new URI("https://lukoil.ru/Company/Career/Vacancies");
        System.out.println("Host "+uri.getHost());
        System.out.println("Port "+uri.getPort());
        System.out.println("Query "+uri.getQuery());
        System.out.println("Path "+uri.getPath());


        URL url = new URL("https://lukoil.ru/");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setRequestProperty("User-Agent","Mozilla 5.0(Windows NT 10.0)");
        urlConnection.connect();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
        }

        System.out.println(InetAddress.getLocalHost().getHostAddress()); //getHostName()
    }
}
