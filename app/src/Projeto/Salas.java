package Projeto;
public class Salas{

    private int id_sala;
    private String nomeSala;
    private boolean status;
    private Jogos jogo;
    private int maxParticipantes;
    private int quantidadeDeParticipantes;

    public Salas(int id_sala, String nomeSala, boolean status, Jogos jogo, int maxParticipantes, int quantidadeDeParticipantes){
        this.id_sala = id_sala;
        this.nomeSala = nomeSala;
        this.status = status;
        this.jogo = jogo;
        this.maxParticipantes = maxParticipantes;
        this.quantidadeDeParticipantes = quantidadeDeParticipantes;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }
    
    public void setId_sala(int id_sala){
        this.id_sala = id_sala;
    }

    public int getId_Sala(){
        return id_sala;
    }

    public String getNomeSala(){
        return nomeSala;
    }
    public void setNomesala(String nomeSala){
        this.nomeSala = nomeSala;
    }

    public void setQuantidadeDeParticipantes(int quantidadeDeParticipantes) {
        this.quantidadeDeParticipantes += quantidadeDeParticipantes;
    }

    public int getQuantidadeDeParticipantes() {
        return quantidadeDeParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }
    
    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public Jogos getJogo(){
        return jogo;
    }

    public void setJogo(Jogos jogo){
        this.jogo = jogo;
    }
    
     public int inserirParticipante(int adicionarParticipantesEntrada){

        if(adicionarParticipantesEntrada > getMaxParticipantes()){
            System.out.println("Sem espaço");
        }
        else{
            setQuantidadeDeParticipantes(adicionarParticipantesEntrada);
        }

        return getQuantidadeDeParticipantes();
    }
        


    public void exibirDados(){
        System.out.println("Id sala: "+this.getId_Sala());
        System.out.println("Nome da sala: "+this.getNomeSala());
        System.out.println("Status da sala: "+this.getStatus());
        System.out.println("Jogo: "+ jogo.getTitulo());
        System.out.println("Número máximo de participantes:  "+this.getMaxParticipantes());
        System.out.println("Quantidade atual de participantes: "+this.getQuantidadeDeParticipantes());
    }
}