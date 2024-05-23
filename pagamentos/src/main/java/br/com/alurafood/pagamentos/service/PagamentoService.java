package br.com.alurafood.pagamentos.service;

import br.com.alurafood.pagamentos.dtos.PagamentoDto;
import br.com.alurafood.pagamentos.mapper.PagamentoMapper;
import br.com.alurafood.pagamentos.model.Pagamento;
import br.com.alurafood.pagamentos.model.Status;
import br.com.alurafood.pagamentos.repository.PagamentoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PagamentoService {

    private PagamentoRepository repository;

    public Page<PagamentoDto> obterTodos(Pageable paginacao) {
        return repository
                .findAll(paginacao)
                .map(PagamentoMapper::paraDto);
    }

    public PagamentoDto obterPorId(Long id) {
        Pagamento pagamento = repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        return PagamentoMapper.paraDto(pagamento);
    }

    public PagamentoDto criarPagamento(PagamentoDto dto) {
        Pagamento pagamento = PagamentoMapper.paraDomain(dto);
        pagamento.setStatus(Status.CRIADO);
        repository.save(pagamento);

        return PagamentoMapper.paraDto(pagamento);
    }

    public PagamentoDto atualizarPagamento(Long id, PagamentoDto dto) {
        Pagamento pagamento = PagamentoMapper.paraDomain(dto);
        pagamento.setId(id);
        pagamento = repository.save(pagamento);
        return PagamentoMapper.paraDto(pagamento);
    }

    public void excluirPagamento(Long id) {
        repository.deleteById(id);
    }
}
