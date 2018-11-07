package postcodes.io;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class FixerHTTPManager {
    private String base_url;
    private String postcodes;

    public FixerHTTPManager(){
        base_url = "http://api.postcodes.io/postcodes/";
    }

    public void setPostcodes(){
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault ();
            HttpGet getPostcode = new HttpGet (base_url + "HA46EX");
            CloseableHttpResponse response = httpClient.execute (getPostcode);
            postcodes = EntityUtils.toString(response.getEntity ());
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
    public String getPostcodes() {
        return postcodes;
    }

}
