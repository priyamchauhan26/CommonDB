package com.dropKart.commonDB.dto;

import java.time.LocalDateTime;

import com.dropKart.commonDB.model.CartStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class CartDto {
	private long cartId;
    private double cartTotal;
    private String shippingMethod;
	private double shippingCost;
	private String couponCode;
	private LocalDateTime lastUpdatedDate;
	private LocalDateTime expirationDate;
    private String customerId;
    @Enumerated(EnumType.STRING)
    private CartStatus cartStatus;
}
