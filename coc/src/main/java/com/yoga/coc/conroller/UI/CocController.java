package com.yoga.coc.conroller.UI;

import com.yoga.coc.service.CocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.function.Function;

@RestController
@RequestMapping(value = "/coc/api")
public class CocController {

    private CocService cocService;

    @Autowired
    public CocController(CocService cocService) {
        this.cocService = cocService;
    }

    @GetMapping(value = "/getPlayer/{playerTag}")
    public ResponseEntity<?> getPlayerProfile(@PathVariable("playerTag") String playerTag,
                                              @RequestHeader("Authorization") String token) {
        return getResponse(request-> (cocService.getPlayerProfile(token, playerTag)));
    }

    private ResponseEntity<?> getResponse(Function<String,String> fun) {
        String response = fun.apply("getResponse");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
