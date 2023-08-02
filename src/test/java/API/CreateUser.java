package API;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

//Author: rpendyala19@gmail.com

public class CreateUser {
    public static void main(String[] args) {
        // Create the JSON request body
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "leader");

        // Create the HTTP POST request
        HttpPost httpPost = new HttpPost("https://reqres.in/api/users");
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.setEntity(new StringEntity(requestBody.toString(), ContentType.APPLICATION_JSON));

        // Execute the request using Apache HttpClient
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(httpPost)) {

            // Get the response entity and convert it to a JSON object
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String responseBody = EntityUtils.toString(entity);
                JSONObject jsonResponse = new JSONObject(responseBody);

                // Process the API response as needed
                System.out.println("API Response:");
                System.out.println(jsonResponse.toString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
