package com.zachprogramming.aifortuneteller.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class AiService
{
    @Value("${gemini.api.key}")
    private String apiKey;
    private Client client;

    @PostConstruct
    public void init()
    {
        // if we have a real apiKey, initialize the client with that key
        if(apiKey != null && !apiKey.isEmpty() && !apiKey.equals("dummy-key"))
        {
            try
            {
                this.client = Client.builder().apiKey(apiKey).build();
            }
            catch (Exception e)
            {
                System.err.println("Failed to initialize Gemini Client: " + e.getMessage());
                this.client = null;
            }
        }
    }

    public String generateFortuneText(List<String> attributes)
    {
        String attributesString = "";
        for(String attribute : attributes)
        {
            attributesString = attributesString + attribute + ", ";
        }

        if(this.client == null)
        {
            return "Local Mock Mode. AI Analysis unavailable without API Key. " +
                    "Please use the live version to test AI Analysis.";
        }
        try {
            String content = "You are a mystical fortune teller. Give a meaningful fortune to the user based on the" +
                             "following attributes they are feeling or experiencing: " + attributesString + ".";

            GenerateContentResponse response =
                    client.models.generateContent(
                            "gemini-2.5-flash",
                            content,
                            null);
            return response.text();
        }
        catch (Exception e)
        {
            return "AI Analysis unavailable.";
        }
    }
}
