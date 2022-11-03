package modelo;

public class Problematecnico {
    private String situacao;
    private String ligacaoInterrompidaComOClienteEmLinha;
    private Integer data;
    private Integer horaSaida;
    private Integer horaRetorno;
    private String precisouDeslogarDoGeo;
    private String supervisorQueEstaAcompanhandoPT;
    private String homeOfficeOuCentral;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getLigacaoInterrompidaComOClienteEmLinha() {
        return ligacaoInterrompidaComOClienteEmLinha;
    }

    public void setLigacaoInterrompidaComOClienteEmLinha(String ligacaoInterrompidaComOClienteEmLinha) {
        this.ligacaoInterrompidaComOClienteEmLinha = ligacaoInterrompidaComOClienteEmLinha;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Integer getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Integer horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Integer getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(Integer horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

    public String getPrecisouDeslogarDoGeo() {
        return precisouDeslogarDoGeo;
    }

    public void setPrecisouDeslogarDoGeo(String precisouDeslogarDoGeo) {
        this.precisouDeslogarDoGeo = precisouDeslogarDoGeo;
    }

    public String getSupervisorQueEstaAcompanhandoPT() {
        return supervisorQueEstaAcompanhandoPT;
    }

    public void setSupervisorQueEstaAcompanhandoPT(String supervisorQueEstaAcompanhandoPT) {
        this.supervisorQueEstaAcompanhandoPT = supervisorQueEstaAcompanhandoPT;
    }

    public String getHomeOfficeOuCentral() {
        return homeOfficeOuCentral;
    }

    public void setHomeOfficeOuCentral(String homeOfficeOuCentral) {
        this.homeOfficeOuCentral = homeOfficeOuCentral;
    }
        //-Situação;
        //-Ligação interrompida com o cliente em linha;
        //-Data;
        //-Hora saída;
        //-Hora retorno;
        //-Precisou deslogar do Geo;
        //-Supervisor que está acompanhando PT;
        //-HomeOffice ou Central;
    }
