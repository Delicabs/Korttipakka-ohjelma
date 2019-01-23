public class pelikortti {
    private String maa;
    private int numero;


    public pelikortti(){
        maa = null;
        numero = 0;

    }

    public pelikortti(String maa, int numero){
        this.maa = maa;
        this.numero = numero;
    }

    public String getMaa() {
        return maa;
    }

    public int getNumero() {
        return numero;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  maa +" "+ numero;
    }
}
