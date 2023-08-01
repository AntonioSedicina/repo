
public class Persona {

    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito){

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    public String toString(){
        String st1 = this.nome+"\n"+this.cognome+"\n"+this.eta+"\n"+this.colorePreferito+"\n";
        return st1;
    }

    void saluta(Persona personaDaSalutare){
        System.out.println("Ciao "+personaDaSalutare.nome+" io sono "+this.nome);
    }
}
