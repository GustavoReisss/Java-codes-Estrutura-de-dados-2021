//metodos de acesso = GETTERS
public class Personagem {
    String nome;
    int fome;
    int forca;
    int sono;

    public Personagem(String nome, int fome, int forca, int sono){
        this.setNome(nome);
        this.setFome(fome);
        this.setForca(forca);
        this.setSono(sono);
    }
    public Personagem(String nome){
        this.setNome(nome);
        this.setFome(1);
        this.setForca(1);
        this.setSono(1);
    }
    public Personagem(){
        this.setNome("vazio");
        this.setFome(0);
        this.setForca(0);
        this.setSono(0);
    }

    public String getNome(){
        return nome;
    }
    public int getSono(){
        return sono;
    }
    public int getForca(){
        return forca;
    }
    public int getFome(){
        return fome;
    }

    //métodos modificadores = setters

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setForca(int forca){
        if(forca>=-5 && forca<=5){
            this.forca = forca;
        }
    }
    public void setSono(int sono){
        if(sono>=0 && sono<=10){
            this.sono = sono; 
        } else if (sono < 0){
            this.sono = 0;
        } else{
            this.sono = 10;
        }
    }
    public void setFome(int fome){
        if(fome>=0 && fome<=8){
            this.fome = fome;
        }
    }

    void dormir(int sono){
        this.setSono(this.getSono() + sono);
    }
}
