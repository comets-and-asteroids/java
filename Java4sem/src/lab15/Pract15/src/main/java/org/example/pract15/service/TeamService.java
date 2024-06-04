package org.example.pract15.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.pract15.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeamService {

    @Autowired
    private final SessionFactory sessionFactory;

    public TeamService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public void addTeam(Team team) {
        session.beginTransaction();
        session.saveOrUpdate(team);
        session.getTransaction().commit();
    }

    public List<Team> getTeams() {
        return session.createQuery("select p from Team p", Team.class).list();
    }

    public Team getTeam(long id) {
        return session.createQuery("select p from Team p where p.id = " + id, Team.class).getSingleResult();
    }

    public void deleteTeam(long id) {

        session.beginTransaction();

        Team temp = session.load(Team.class, id);
        session.delete(temp);

        session.getTransaction().commit();
    }
}
