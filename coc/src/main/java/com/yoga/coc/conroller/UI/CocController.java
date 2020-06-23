package com.yoga.coc.conroller.UI;

import com.yoga.coc.service.CocService;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.function.Function;

@RestController
@RequestMapping(value = "/coc/api")
public class CocController {

    private CocService cocService;

    @Autowired
    public CocController(CocService cocService) {
        this.cocService = cocService;
    }

    //Spring Web with Spring WebClient (Synchronous)
    @GetMapping(value = "/getPlayer/{playerTag}")
    public ResponseEntity<?> getPlayerProfile(@PathVariable("playerTag") String playerTag,
                                              @RequestHeader("Authorization") String token) {
        return getResponse(r-> (cocService.getPlayerProfile(token, playerTag)));
    }

    private ResponseEntity<?> getResponse(Function<String,String> fun) {
        String response = fun.apply("res");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    //Reactive Web with Spring WebClient (Asynchronous)
    @GetMapping(value = "/getPlayerDetails/{playerTag}")
    Publisher<ResponseEntity<String>> getPlayerDetails(@PathVariable("playerTag") String playerTag,
                                       @RequestHeader("Authorization") String token) {
        return cocService.getPlayerDetails(token, playerTag)
                .map(r -> ResponseEntity.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(r));
    }
}
