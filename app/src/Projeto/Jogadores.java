package Projeto;
public class Jogadores {
    private String credencial;
    private Perfil perfil;

    public Jogadores(String credencial, Perfil perfil){
        this.credencial = credencial;
        this.perfil = perfil;
    }

    public void setCredencial(String credencial){
        this.credencial = credencial;
    }

    public String getCredencial(){
        return credencial;
    }
    public void setPerfil(Perfil perfil){
        this.perfil = perfil;
    }
    public Perfil getPerfil(){
        return perfil;
    }

    public void exibirDados(){
        System.out.println("Credencial: "+this.credencial);
        if(this.perfil != null){
            System.out.println("Nome: "+this.perfil.getNomeJogador());
            System.out.println("Conquistas: "+this.perfil.getConquistas());
            System.out.println("Ranking: "+this.perfil.getRanking());
        }else{
            System.err.println("Erro de perfil!");
        }

    }

}
