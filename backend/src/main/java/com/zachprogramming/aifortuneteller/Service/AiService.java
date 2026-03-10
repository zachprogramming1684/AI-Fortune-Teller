package com.zachprogramming.aifortuneteller.Service;

import com.google.genai.Client;
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
        return "";
    }

    //TODO: Finish the ai service so that it is able to generate fortune text with given attributes, decide how to generate the attributes to choose from
}
