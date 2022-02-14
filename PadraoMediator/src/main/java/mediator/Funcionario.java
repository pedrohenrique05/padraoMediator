package mediator;

public class Funcionario {

    public String confirmarServicoCliente(String notificacao){
        return CentroDeOperacao.getInstancia().receberConfirmacaoServico(notificacao);
    }

    public String realizarContatoTelefonicoCliente(String notificacao){
        return CentroDeOperacao.getInstancia().receberContatoTelefonico(notificacao);
    }

    public String confirmarCancelamentoCliente(String notificacao){
        return CentroDeOperacao.getInstancia().receberCancelamentoServico(notificacao);
    }
}
