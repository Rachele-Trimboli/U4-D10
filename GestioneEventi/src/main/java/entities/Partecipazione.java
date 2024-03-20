package entities;

import jakarta.persistence.*;
import jdk.jfr.Event;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "stato")
    private Stato stato;

    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;





    @ManyToMany
    @JoinTable(name = "partecipazioni", // Definiamo come sarà fatta la JUNCTION TABLE
            joinColumns = @JoinColumn(name = "partecipazione_id"), // Definiamo come saranno fatte le 2 colonne della Junction Table
            inverseJoinColumns = @JoinColumn(name = "evento_id"))
    private List<Evento> eventi;











    public Partecipazione() {
    }

    public Partecipazione(Stato stato) {
        this.stato = stato;
    }

    public UUID getId() {
        return id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", stato=" + stato +
                '}';
    }
}
