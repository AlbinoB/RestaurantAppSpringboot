package com.albino.restaurantappspringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customerId")
    private Long customerId;
    
    @Column(name="fullName")
    private String fullName;
    
    @Column(name="email")
    private String email;
    
    @Column(name="mobileNumber")
    private String mobileNumber;
    
    @Column(name="address")
    private String address;
    
    @Column(name="password")
    private String password;
    
    @Column(name="otp")
    private Integer otp;

    

    public Customer() {
    }

    public Customer( String fullName, String email, String mobileNumber, String address, String password, Integer otp) {
        this.fullName = fullName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.password = password;
        this.otp = otp;
    }

    

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", fullName=" + fullName + ", email=" + email + ", mobileNumber="
                + mobileNumber + ", address=" + address + ", password=" + password + ", otp=" + otp + "]";
    }

    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getOtp() {
        return otp;
    }
    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    
}
