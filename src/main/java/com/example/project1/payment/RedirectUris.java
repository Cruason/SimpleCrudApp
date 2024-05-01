package com.example.project1.payment;

import lombok.Data;

@Data
public class RedirectUris {
    public static final String SUCCESS_URL = "pay/success";
    public static final String CANCEL_URL = "pay/cancel";
}
