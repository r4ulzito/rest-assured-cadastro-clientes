package br.com.cadastro.cliente.api.domain.handler.response;

import lombok.Getter;

import java.time.Instant;

@Getter
public class BeanValidationResponseCustomizada extends ExceptionResponsePadrao {

    private final String fields;

    public BeanValidationResponseCustomizada(Instant timestamp, Integer status, String message, String fields) {
        super(timestamp, status, message);
        this.fields = fields;
    }
}
