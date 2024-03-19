package entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data")
    private LocalDate dataEvento;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private EventType tipo;

    @Column(name = "maxpartecipanti")
    private int numeromassimopartecipanti;


    public Evento() {

    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, EventType tipo, int numeromassimopartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeromassimopartecipanti = numeromassimopartecipanti;
    }

    public long getId() {
        return id;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EventType getTipo() {
        return tipo;
    }

    public void setTipo(EventType tipo) {
        this.tipo = tipo;
    }

    public int getNumeromassimopartecipanti() {
        return numeromassimopartecipanti;
    }

    public void setNumeromassimopartecipanti(int numeromassimopartecipanti) {
        this.numeromassimopartecipanti = numeromassimopartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", numeromassimopartecipanti=" + numeromassimopartecipanti +
                '}';
    }
}
