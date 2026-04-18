package Projeto;

public class Plataforma {
    private int id;
    private String nomePlataforma;
    private Salas[] sala;
    private int quantadeDeSalas;
    private int maxSalas = 10;
    
    public Plataforma(int id, String nomePlataforma){
        this.id = id;
        this.sala = new Salas[maxSalas];  
        this.nomePlataforma = nomePlataforma;
        this.quantadeDeSalas = 0;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void  setnomePlataforma(String nomePlataforma){
        this.nomePlataforma = nomePlataforma;
    }
    public String getNomePlataforma() {
        return nomePlataforma;
    }
    
    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }
    
    public void setSalas(Salas[] sala){    
        this.sala = sala;
    }


    public void setQuantadeDeSalas(int quantadeDeSalas) {
        this.quantadeDeSalas = quantadeDeSalas;
    }

    public int getQuantadeDeSalas() {
        return quantadeDeSalas;
    }


    public void inserirSala(){
        quantadeDeSalas++;
    }

    public void removerSala(){
        quantadeDeSalas--;
    }

    public void criarSala(Salas sala){
            if(quantadeDeSalas < maxSalas){
                this.sala[quantadeDeSalas] = sala;
                inserirSala();
                System.out.println("Sala criada");
            }
           
        }

    public void finalizarSala(Salas salaEntrada){
        if(quantadeDeSalas > 0){
        this.sala[quantadeDeSalas] = null;
        removerSala();
        }
        else
            System.out.println("Plataformas sem salas criadas");
    }

    void exibirDados(){
        System.out.println("");
        System.out.println("Plataforma "+this.getNomePlataforma());
        System.out.println("id: "+this.getId());
        System.out.println("Nome da plataforma "+this.getNomePlataforma());
        System.out.println("Quantidade de salas: "+this.getQuantadeDeSalas());
        System.out.println("");
        System.out.println("Salas atuais");
        System.out.println("===============================================================================");
        for(int i = 0; i < quantadeDeSalas; i++){
            sala[i].exibirDados();
            System.out.println("===============================================================================");

        }
    }
}


