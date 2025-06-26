package com.weiz.careercanvas.application.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class Result<T> {

    private final boolean success;
    private final String message;
    private final T data;
    private final List<String> errors;

    public static <T> Result<T> success(T data, String message) {
        return new Result<>(true, message, data, List.of());
    }

    public static <T> Result<T> failure(T data, String message, String error) {
        return new Result<>(true, message, data, List.of(error));
    }

    public static <T> Result<T> failure(T data, String message, List<String> errors) {
        return new Result<>(true, message, data, errors);
    }
}
