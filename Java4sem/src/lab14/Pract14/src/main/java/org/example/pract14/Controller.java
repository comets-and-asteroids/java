package org.example.pract14;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {
    @Value("${HOMEGIT}")
    private String HOMEGIT;
    ArrayList<Footballer> footballers = new ArrayList<>();
    ArrayList<Team> teams = new ArrayList<>();
    @GetMapping("/home")
    public @ResponseBody String Home() throws IOException {
        WebClient client = WebClient.create(HOMEGIT);
        String responseBody = client.get().retrieve().toEntity(String.class).block().getBody();
        return responseBody;
    }
    @GetMapping("/footballers")
    public @ResponseBody ArrayList<Footballer> getFootballers(){
        return footballers;
    }
    @GetMapping("/teams")
    public @ResponseBody ArrayList<Team> getTeams(){
        return teams;
    }
    @GetMapping("/team/{i}")
    public @ResponseBody Team getTeamByIndex(@PathVariable int i){
        return teams.get(i);
    }
    @GetMapping("/footballer/{i}")
    public @ResponseBody Footballer getFootballerByIndex(@PathVariable int i){
        return footballers.get(i);
    }
    @PutMapping("/footballer/")
    public @ResponseBody void addFootballer(@RequestParam String firstName, @RequestParam String lastName){
        footballers.add(new Footballer(firstName, lastName));
    }
    @PutMapping("/team/")
    public @ResponseBody void addTeam(@RequestParam String firstName, @RequestParam String lastName){
        teams.add(new Team(firstName, lastName));
    }

}
