package com.algaworks.algafoodapi.listener;

import com.algaworks.algafoodapi.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.println("EMITINDO NOTA FISCAL PARA O CLIENTE " + event.getCliente().getNome());
    }
}
