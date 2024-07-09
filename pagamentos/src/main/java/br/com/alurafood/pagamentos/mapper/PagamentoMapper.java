package br.com.alurafood.pagamentos.mapper;

import br.com.alurafood.pagamentos.dtos.PagamentoDto;
import br.com.alurafood.pagamentos.model.Pagamento;

public abstract class PagamentoMapper {


    public static PagamentoDto paraDto(Pagamento pagamento){
        return new PagamentoDto(pagamento.getId(), pagamento.getValor(), pagamento.getNome(), pagamento.getNumero(),
                pagamento.getExpiracao(), pagamento.getCodigo(), pagamento.getStatus(), pagamento.getFormaDePagamentoId(), pagamento.getPedidoId());
    }

    public static Pagamento paraDomain(PagamentoDto dto) {
        return new Pagamento(dto.id(), dto.valor(), dto.nome(), dto.numero(), dto.expiracao(), dto.codigo(), dto.status(), dto.pedidoId(), dto.formaDePagamentoId());
    }
}
