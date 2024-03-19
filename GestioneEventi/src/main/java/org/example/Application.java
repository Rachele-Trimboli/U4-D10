package org.example;

import dao.EventoDAO;
import entities.EventType;
import entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.Date;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO evdao = new EventoDAO(em);

//        Evento ev1 = new Evento("Notte sotto le stelle", LocalDate.of(2024,8,15),"Notte sotto le stelle cadenti", EventType.PUBBLICO,5000);
//        Evento ev2 = new Evento("Pasquetta",LocalDate.of(2024,4,1),"Pasquetta in quel dì piovoso", EventType.PRIVATO,20);
//        Evento ev3 = new Evento("Pasqua",LocalDate.of(2024,3,31),"Pasqua con le uova di cioccolato", EventType.PRIVATO,10);
//
//
//        evdao.save(ev1);
//        evdao.save(ev2);
//        evdao.save(ev3);

        Evento eventoTrovato = evdao.getById(1);
        System.out.println(eventoTrovato);

       evdao.deleteEvento(3);




        System.out.println("Hello World!");
    }
}
