package br.com.alurafood.pagamentos.mapper;

import br.com.alurafood.pagamentos.dtos.PagamentoDto;
import br.com.alurafood.pagamentos.model.Pagamento;

public abstract class PagamentoMapper {

    public static PagamentoDto paraDto(Pagamento pagamento){
        return PagamentoDto.builder()
                .id(pagamento.getId())
                .nome(pagamento.getNome())
                .formaDePagamentoId(pagamento.getFormaDePagamentoId())
                .valor(pagamento.getValor())
                .codigo(pagamento.getCodigo())
                .numero(pagamento.getNumero())
                .status(pagamento.getStatus())
                .expiracao(pagamento.getExpiracao())
                .pedidoId(pagamento.getPedidoId())
                .build();
}

    public static Pagamento paraDomain(PagamentoDto dto) {
        return Pagamento.builder()
                .id(dto.id())
                .nome(dto.nome())
                .formaDePagamentoId(dto.formaDePagamentoId())
                .valor(dto.valor())
                .codigo(dto.codigo())
                .numero(dto.numero())
                .status(dto.status())
                .expiracao(dto.expiracao())
                .pedidoId(dto.pedidoId())
                .build();
    }
}
