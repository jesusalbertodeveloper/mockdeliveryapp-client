package com.jarm.mockdeliveryapp;

public class VerificationRequest {
private int sessionId;
private int verificationCode;

    public VerificationRequest(int sessionId,int verificationCode) {
        this.sessionId = sessionId;
        this.verificationCode = verificationCode;
    }
}
