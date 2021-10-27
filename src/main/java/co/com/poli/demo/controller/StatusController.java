package co.com.poli.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping()
    public String status(){
        return "Running server";
    }

    @GetMapping("/{id}")
    public String statusId(){
        return "Running server id";
    }
}
