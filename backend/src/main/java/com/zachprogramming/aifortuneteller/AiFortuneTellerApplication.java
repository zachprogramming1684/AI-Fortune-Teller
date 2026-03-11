package com.zachprogramming.aifortuneteller;

import com.zachprogramming.aifortuneteller.Service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AiFortuneTellerApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(AiFortuneTellerApplication.class, args);
    }

}
