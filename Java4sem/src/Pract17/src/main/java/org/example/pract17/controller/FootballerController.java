package org.example.pract17.controller;

import org.example.pract17.model.Footballer;
import org.example.pract17.model.Team;
import org.example.pract17.service.FootballerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FootballerController {
    private final FootballerService service;

    public FootballerController(FootballerService service) {
        this.service = service;
    }

    @PostMapping("/footballer")
    public void post(@RequestBody Footballer footballer) {
        service.addFootballer(footballer);
    }

    @GetMapping("/footballers")
    public List<Footballer> getAll() {
        return service.getFootballers();
    }

    @GetMapping("/footballer/{id}")
    public Footballer get(@PathVariable long id) {
        try {
            return service.getFootballer(id);
        }
        catch (Exception ignored){
            return null;
        }
    }

    @DeleteMapping("/footballer/{id}")
    public void delete(@PathVariable long id) {
        try{
            service.deleteFootballer(id);
        }
        catch (Exception ignored){
            System.out.println("not id");
        }
    }

    @GetMapping("/footballer/{id}/team")
    public Team getTeam(@PathVariable long id){
        try{
            return service.getTeam(id);
        }
        catch (Exception ignored){
            return null;
        }
    }

    @GetMapping("/footballers/firstName")
    public List<Footballer> getFootballersOrderedByFirstName(){
        return service.getFootballersOrderedByFirstName();
    }
    @GetMapping("/footballers/lastName")
    public List<Footballer> getFootballersOrderedByLastName(){
        return service.getFootballersOrderedByLastName();
    }
    @GetMapping("/footballers/teamName")
    public List<Footballer> getFootballersOrderedByTeamName(){
        return service.getFootballersOrderedByTeamName();
    }
}