package com.dropKart.commonDB.dto;

import java.util.Date;
import java.util.List;

import com.dropKart.commonDB.model.AccountStatus;
import com.dropKart.commonDB.model.Address;
import com.dropKart.commonDB.model.CustomerStatus;
import com.dropKart.commonDB.model.DeviceInfo;
import com.dropKart.commonDB.model.Orders;
import com.dropKart.commonDB.model.PaymentInfo;
import com.dropKart.commonDB.model.Preferences;
import com.dropKart.commonDB.model.Wishlist;

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
public class CustomerDetailsDto {
	
	private long customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String phoneNumber;
	private List<Address> billingAddress;
	private List<Address> shippingAddress;
	private List<PaymentInfo> paymentInfo;
	private Date dateOfBirth;
	private String gender;
	private String profilePicture;
	private Date accountCreationDate;
	private Date lastLoginDate;
	private String customerSegment;
	private Preferences preferences;
	private Wishlist wishlist;
	private List<Orders> orderHistory;
	private int loyaltyPoints;
	private List<DeviceInfo> deviceInfo;
	private String subscriptionStatus;
	private AccountStatus accountStatus;
	 private CustomerStatus customerStatus; 

}
