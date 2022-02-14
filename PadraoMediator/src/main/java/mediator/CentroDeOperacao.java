package mediator;

public class CentroDeOperacao {

    /**
     return CentroDeOperacao.getInstancia().receberConfirmacaoServico(notificacao);

     return CentroDeOperacao.getInstancia().receberContatoTelefonico(notificacao);

     return CentroDeOperacao.getInstancia().receberCancelamentoServico(notificacao);
     **/
    private static CentroDeOperacao instancia = new CentroDeOperacao();

    private CentroDeOperacao(){}

    public static CentroDeOperacao getInstancia(){
        return instancia;
    }

    public String receberConfirmacaoServico(String notificacao){
        return UsuarioFisico.getInstancia().confirmacaoServico(notificacao) + "\nServiço adicionado!";
    }

    public String receberCancelamentoServico(String notificacao){
        return UsuarioFisico.getInstancia().cancelamentoServico(notificacao) + "\nServiço retirado!";
    }

    public String receberContatoTelefonico(String notificacao){
        return UsuarioFisico.getInstancia().contatoTelefonico(notificacao);
    }


}
