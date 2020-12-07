package com.it.ies.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {
 private Integer errorCode;
 private String errorDesc;
}
