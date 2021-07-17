package com.ching.batobatopick.controller;

import com.ching.batobatopick.domain.*;
import com.ching.batobatopick.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BatoBatoPickController {

    @Autowired
    private MatchService matchService;

    @PostMapping(value = "/play")
    public Result play(@RequestBody Choice choice) {
        Player human = new Human(choice);
        Player computer = new Computer();
        Result result = matchService.fight(human, computer);
        return result;
    }

}
