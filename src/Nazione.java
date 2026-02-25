public class Nazione {
    private String denomizione;
    private double superficieKmQ;
    private int numeroAbitanti;

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


}
