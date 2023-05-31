package br.JOJO.JJBA.models;

public class Personagens {

    private String jojo;
    private int parte;
    private String inimigo;

    public Personagens(String jojo, int parte, String inimigo) {
        this.jojo = jojo;
        this.parte = parte;
        this.inimigo = inimigo;
    }

    public String getJojo() {
        return jojo;
    }

    public void setJojo(String jojo) {
        this.jojo = jojo;
    }

    public int getParte() {
        return parte;
    }

    public void setParte(int parte) {
        this.parte = parte;
    }

    public String getInimigo() {
        return inimigo;
    }

    public void setInimigo(String inimigo) {
        this.inimigo = inimigo;
    }
}
