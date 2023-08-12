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
import org.testng.Assert;
import org.apache.http.client.methods.HttpGet;



//Author: rpendyala19@gmail.com

public class CreateUser_2 {
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

//    ==================================================================================================
                System.out.println("API Response:");
                System.out.println(jsonResponse.toString(2));
                
             // After processing the API response
                int userId = jsonResponse.getInt("id");
                System.out.println(userId);
             // Create the HTTP GET request to retrieve user by ID
                HttpGet getUserByIdRequest = new HttpGet("https://reqres.in/api/users/" + userId);
                getUserByIdRequest.addHeader("Content-Type", "application/json");

                // Execute the request to get the user's details
                try (CloseableHttpResponse userResponse = httpClient.execute(getUserByIdRequest)) {
                    HttpEntity userEntity = userResponse.getEntity();
                    if (userEntity != null) {
                        String userResponseBody = jsonResponse.toString(2);
                        JSONObject userJsonResponse = new JSONObject(userResponseBody);

                        //retrieved user's details and perform assertions
                        String userName = userJsonResponse.getString("name");
                        String userJob = userJsonResponse.getString("job");
                        System.out.println(userName);
                        System.out.println(userJob);
                        // Perform assertions to validate user details
                        Assert.assertEquals(userName, "morpheus", "User name mismatch");
                        System.out.println("Usename is created as expected");
                        Assert.assertEquals(userJob, "leader", "User job mismatch");
                        System.out.println("User Job is created as expected");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }                
            
//                ====================================================================================================

            }
      } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

