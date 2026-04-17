package Projeto;
public class Jogadores {
    private String credencial;
    private Perfil perfil;
    private boolean participa;

    public Jogadores(String credencial, Perfil perfil, boolean participa){
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

    public void setParticipa(boolean participa){
        this.participa = participa;
    }
    public boolean getParticipa(){
        return participa;
    }

}
