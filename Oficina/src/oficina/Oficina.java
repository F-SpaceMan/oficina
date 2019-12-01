package oficina;

/**
 *
 * @author Eu
 */
public class Oficina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Veiculo{
    String placa;
    int rodas;
    String marca;
    int modelo;
    int anoFab;
    int anoModel;
    
    void setPlaca(String letranum){
        this.placa = letranum;
    }
    String getPlaca(){
        return this.placa;
    }
    void setRodas(int qtde){
        this.rodas = qtde;
    }
    int getRodas(){
        return this.rodas;
    }
    void setModelo(int num){
        this.modelo = num;
    }
    int getModelo(){
        return this.modelo;
    }
    void setAnoFab(int ano){
        this.anoFab = ano;
    }
    int getAnoFab(){
        return this.anoFab;
    }
    void setAnoModel(int ano){
        this.anoModel = ano;
    }
    int getAnoModel(){
        return this.anoModel;
    }
 
}