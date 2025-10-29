package com.ServiceOne.TheOne.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class OneController {

    @GetMapping("/check")
    public String send(){
        return "Hello ra Puka";
    }

    @GetMapping("/checkparameter")
    public String sendWithParam(@RequestParam String param){
        return "this is the Parameter"+param;
    }

    @GetMapping("/withResponseEntity")
    public ResponseEntity<String> responseEntity(){
        return ResponseEntity.ok("Returned");
    }

    @GetMapping("/checkresponsewithparam")
    public ResponseEntity<String> responseEntityCheck(@RequestParam String param){
        return ResponseEntity.ok("done with the Entity"+param);
    }

}