package br.com.rlmoura81.moura.principal;

import br.com.rlmoura81.moura.principalcadastro.Categoria;
import br.com.rlmoura81.moura.principalcadastro.PrestadorServico;

public class ModuloAplicativo{
    
    private Modulo modulo;
    private PrestadorServico presserv;
    private Categoria categoria;
    private int cd_usuario;

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public PrestadorServico getPresserv() {
        return presserv;
    }

    public void setPresserv(PrestadorServico presserv) {
        this.presserv = presserv;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(int cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public ModuloAplicativo(Modulo modulo, PrestadorServico presserv, int cd_usuario) {
        this.modulo = modulo;
        this.presserv = presserv;
        this.cd_usuario = cd_usuario;
    }

    public ModuloAplicativo(Modulo modulo, Categoria categoria, int cd_usuario) {
        this.modulo = modulo;
        this.categoria = categoria;
        this.cd_usuario = cd_usuario;
    }

    public ModuloAplicativo() {
    }

    @Override
    public String toString() {
        return "ModuloAplicativo{" + "modulo=" + modulo + ", presserv=" + presserv + ", categoria=" + categoria + ", cd_usuario=" + cd_usuario + '}';
    }


}
