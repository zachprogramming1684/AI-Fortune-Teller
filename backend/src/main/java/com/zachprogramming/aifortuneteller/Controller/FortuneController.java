package com.zachprogramming.aifortuneteller.Controller;

import com.zachprogramming.aifortuneteller.Model.Fortune;
import com.zachprogramming.aifortuneteller.Service.FortuneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fortunes")
public class FortuneController
{
    private FortuneService fortuneService;

    public FortuneController(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Fortune>> getAllFortunes()
    {
        return ResponseEntity.ok(fortuneService.getAllFortunes());
    }


}