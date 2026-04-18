package Projeto;
public class Jogadores {
    private String credencial;
    private Perfil perfil;
    private Salas participa;

    public Jogadores(String credencial, Perfil perfil, Salas participa){
        this.credencial = credencial;
        this.perfil = perfil;
        this.participa = participa;
    }

    public void setCredencial(String credencial){
        this.credencial = credencial;
    }

    public String getCredencial(){
        return credencial;
    }
    public Perfil getPerfil(){
        return perfil;
    }

    public void setParticipa(Salas participa){
        this.participa = participa;
    }
    public Salas getParticipa(){
        return participa;
    }

}
