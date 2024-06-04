package org.example.pract17.controller;

import org.example.pract17.model.Team;
import org.example.pract17.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class TeamController {
    @Autowired
    private TeamService service;

    @PostMapping("/team")
    public void post(@RequestBody Team team) {
        service.addTeam(team);
    }

    @GetMapping("/teams")
    public List<Team> getAll() {
        return service.getTeams();
    }

    @GetMapping("/team/{id}")
    public Team get(@PathVariable long id) {
        System.out.println("!!!!!!!!!!!!!!!!");
        return service.getTeam(id);
    }

    @DeleteMapping("/team/{id}")
    public void delete(@PathVariable long id) {
        service.deleteTeam(id);
    }
}