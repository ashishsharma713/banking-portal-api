package com.webapp.bankingportal.dto;

public record ResetPasswordRequest(String identifier, String newPassword) {
}
