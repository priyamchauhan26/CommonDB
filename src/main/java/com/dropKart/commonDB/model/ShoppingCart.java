package com.dropKart.commonDB.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CustomerShoppingCart")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
@ToString
public class ShoppingCart {
	public ShoppingCart(int i, double d, String customerId2, double e, String customerId3, LocalDateTime now,
			Object object, String customerId4, CartStatus active, double f, double g, double h) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartId;
    private double cartTotal;
    private String shippingMethod;
	private double shippingCost;
	private String couponCode;
	private LocalDateTime lastUpdatedDate;
	private LocalDateTime expirationDate;
    private String customerId;
    @Enumerated(EnumType.STRING)
    private CartStatus cartStatus;
    private double totalMRP;
    private double discountTotal;
    private double convienceCharge;
    
    
    
	
    
    

}
