package dao;

import entities.Evento;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento){

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();
        System.out.println("Salvataggio di " + evento + "avvenuto");
    }

    public Evento getById(long eventoId){
        return em.find(Evento.class, eventoId);
    }

    public void deleteEvento(long eventoId){
        Evento eventoDaEliminare = this.getById(eventoId);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(eventoDaEliminare);
        transaction.commit();
        System.out.println(eventoDaEliminare + "Questo evento è stato eliminato");
    }
}
