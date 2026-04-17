package Projeto;
public class Salas{

    private int id_sala;
    private String nomeSala;
    private boolean status;
    private Jogos jogo;
    private int maxParticipantes;
    private int quantidadeDeParticipantes;
    private int quantidadeEmEspera;

    public Salas(int id_sala, String nomeSala, boolean status, Jogos jogo, int maxParticipantes, int quantidadeDeParticipantes, int quantidadeEmEspera){
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
        if(quantidadeDeParticipantes <= getMaxParticipantes())
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
    
    
     public void inserirParticipante(int adicionarParticipantesEntrada) {
        int espacoDisponivel = this.maxParticipantes - this.quantidadeDeParticipantes;

        if (adicionarParticipantesEntrada <= espacoDisponivel) {
            this.quantidadeDeParticipantes += adicionarParticipantesEntrada;
            System.out.println(adicionarParticipantesEntrada + " participante(s) entrou(aram) direto.");
        } else {
            // Preenche o que resta de vagas e o resto vai para a espera
            this.quantidadeDeParticipantes += espacoDisponivel;
            int resto = adicionarParticipantesEntrada - espacoDisponivel;
            this.quantidadeEmEspera += resto;
            
            System.out.println(espacoDisponivel + " entraram. " + resto + " ficaram na espera.");
        }
    }

    public void removerParticipante() {
        if (this.quantidadeDeParticipantes > 0) {
            this.quantidadeDeParticipantes--;
            System.out.println("Um participante saiu da sala.");

            // Verifica se tem alguém na variável de espera
            if (this.quantidadeEmEspera > 0) {
                this.quantidadeEmEspera--;
                this.quantidadeDeParticipantes++;
                System.out.println("Uma vaga abriu e alguém da espera entrou automaticamente!");
            }
        } else {
            System.out.println("A sala já está vazia.");
        }
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