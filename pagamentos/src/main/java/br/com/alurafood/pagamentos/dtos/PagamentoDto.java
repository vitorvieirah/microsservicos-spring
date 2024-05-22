package br.com.alurafood.pagamentos.dtos;

import br.com.alurafood.pagamentos.model.Status;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record PagamentoDto (Long id, BigDecimal valor, String nome, String numero, String expiracao, String codigo, Status status, Long formaDePagamentoId, Long pedidoId){ }
