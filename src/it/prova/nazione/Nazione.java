package it.prova.nazione;

public class Nazione {
    private String denomizione;
    private double superficieKmQ;
    private int numeroAbitanti;

    public Nazione(String nome, double superficie, int abitanti){
        this.denomizione = nome;
        this.superficieKmQ = superficie;
        this.numeroAbitanti = abitanti;
    }

    public void setDenomizione(String nome){
        this.denomizione = nome;
    }
    public String getDenomizione(){
        return this.denomizione;
    }

    public void setSuperficieKmQ(double superficie){
        this.superficieKmQ = superficie;
    }

    public double getSuperficieKmQ(){
        return this.superficieKmQ;
    }

    public void setNumeroAbitanti(int abitanti){
        this.numeroAbitanti = abitanti;
    }

    public int getNumeroAbitanti(){
        return this.numeroAbitanti;
    }


    public String toString(){
        String risultato = "";
        risultato += "(";
        risultato += this.getDenomizione();
        risultato += ",";
        risultato += String.format("%1$, .2f", this.getSuperficieKmQ());
        risultato += ",";
        risultato += this.getNumeroAbitanti();
        risultato += ")";
        return risultato;
    }
    /**
     * La funzione ritorna true se la superficie che ricopre è più grande
     * della superficie di una nazione data in input;
     * @param input oggetto Nazione
     * @return boolean
     */
    public boolean piuEstesaDi(Nazione input){
        return this.getSuperficieKmQ() > input.getSuperficieKmQ();
    }

    /**
     * La funzione ritorna true se la nazione possiede più abitanti rispetto
     * ad una Nazione in input, altrimenti restituisce false.
     * @param input oggetto Nazione
     * @return boolean
     */
    public boolean piuPopolosaDi(Nazione input){
        return this.getNumeroAbitanti() > input.getNumeroAbitanti();
    }

    /**
     * La funzione prende in input un array di oggetti Nazioni e cerca se almeno un elemento di questo array
     * sia più grande in superficie della Nazione che si sta verificando.
     * @param nazioni oggetto Nazione
     * @return boolean
     */
    public boolean esisteAlmenoUnaPiuEstesa(Nazione[] nazioni){
        for(Nazione elemento: nazioni){
            if (this.getSuperficieKmQ() < elemento.getSuperficieKmQ()){
                return true;
            }
        }
        return false;
    }

    public int dimmiQuanteSonoPiuPopolose(Nazione[] nazioni){
        int contatore = 0;
        for(Nazione elemento: nazioni){
            if(this.getNumeroAbitanti() < elemento.getNumeroAbitanti()){
                contatore += 1;
            }
        }
        return contatore;
    }

    public boolean haPiuAbitantiDiTutteLeAltre(Nazione[] nazioni){
        for(Nazione elemento: nazioni){
            if(this.getNumeroAbitanti() < elemento.getNumeroAbitanti()){
                return false;
            }
        }
        return true;
    }

    public boolean hannoTutteLaMiaStessaIniziale(Nazione[] nazioni){
        for(Nazione elemento: nazioni){
            if(this.getDenomizione().charAt(0) != elemento.getDenomizione().charAt(0)){
                return false;
            }
        }
        return true;
    }

    public boolean eAlDiSopraDellaMediaComeSuperficie(Nazione[] nazioni){
        double somma = 0;
        for(Nazione elemento: nazioni){
            somma += elemento.getSuperficieKmQ();
        }
        double media = somma / nazioni.length;
        return this.getSuperficieKmQ() > media;
    }



}

