package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ItemPedidoRequestCreateDto {
	private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
}
