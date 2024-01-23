package com.dropKart.commonDB.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
@ToString
public class CartItemProductDto {
	private long cartItemId;
	private ProductDto productDto;
    private String cartId;
    private String size;
    private int quantity;
}
