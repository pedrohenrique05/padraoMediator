package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TecnicoTest {

    @Test
    void deveSolicitarConfirmacao(){
        Tecnico tec = new Tecnico();
        assertEquals("Serviço confirmado! Periodo da manhã\n" +
                "Serviço adicionado!",tec.confirmarServicoCliente("manhã"));
    }

    @Test
    void deveConfirmarCancelamento(){
        Tecnico tec = new Tecnico();
        assertEquals("Serviço cancelado! Periodo da manhã\n" +
                "Serviço retirado!",tec.confirmarCancelamentoCliente("manhã"));
    }

    @Test
    void deveSolicitarContatoTelefonico(){
        Tecnico tec = new Tecnico();
        assertEquals("Contato telefonico - Realizado!",tec.realizarContatoTelefonicoCliente("Realizado!"));
    }

}