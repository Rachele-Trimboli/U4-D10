package entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;
    @Column(name = "città")
    private String città;

    @OneToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    public Location() {
    }

    public Location(String nome, String città) {
        this.nome = nome;
        this.città = città;
    }



    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", città='" + città + '\'' +
                '}';
    }
}
