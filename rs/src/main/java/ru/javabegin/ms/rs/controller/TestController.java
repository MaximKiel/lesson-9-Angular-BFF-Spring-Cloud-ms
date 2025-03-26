package ru.javabegin.ms.rs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javabegin.ms.rs.model.Result;

// тестовый сервис для проверки работы backend

@RestController
@RequestMapping("/data") // базовый URI
public class TestController {

    // требуется Access Token для вызова этого сервиса
    @GetMapping("/test")
    public ResponseEntity<Result> test() {
        return ResponseEntity.ok(new Result("test data"));
    }

}
