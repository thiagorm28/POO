package ContaCorrente;

public class CampoNaoPodeSerNulo extends RuntimeException {

    public CampoNaoPodeSerNulo(String frase){
        super(frase);
    }

}