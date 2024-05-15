package br.com.alurafood.pagamentos.service;

import br.com.alurafood.pagamentos.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    private PagamentoRepository repository;

    @Autowired
    private ModelMapper modelMapper;
}
