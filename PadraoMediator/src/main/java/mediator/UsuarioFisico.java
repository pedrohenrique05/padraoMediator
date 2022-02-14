package mediator;

public class UsuarioFisico implements Usuario{

    private static UsuarioFisico instancia = new UsuarioFisico();

    private UsuarioFisico(){}

    public static UsuarioFisico getInstancia(){
        return instancia;
    }
    @Override
    public String confirmacaoServico(String notificao) {
        return "Serviço confirmado! Periodo da "+notificao;
    }

    @Override
    public String contatoTelefonico(String notificao) {
        return "Contato telefonico - "+notificao;
    }

    @Override
    public String cancelamentoServico(String notificao) {
        return "Serviço cancelado! Periodo da "+notificao;
    }
}
