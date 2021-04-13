package br.com.devmedia.Enum;

public class Curso {
    private String nome;
    private Turno turno;
    private int horas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Curso " +
                nome +
                ", turno: " + turno.getDescricao() +
                ", horas: " + horas
                ;
    }
}
