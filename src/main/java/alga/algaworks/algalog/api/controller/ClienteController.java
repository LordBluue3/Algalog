package alga.algaworks.algalog.api.controller;

import alga.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Mikael");
        cliente.setEmail("mikaelcandido71@gmail.com");
        cliente.setTelefone("(11) 99999-7777");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("João");
        cliente2.setEmail("joaodasilva@gmail.com");
        cliente2.setTelefone("(23) 88888-6666");

        return Arrays.asList(cliente,cliente2);
    }
}
