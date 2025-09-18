package com.example.springbackend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/example")
@Tag(name = "Exemplo", description = "Endpoints de exemplo para demonstração")
@CrossOrigin(origins = "*")
@SecurityRequirement(name = "bearerAuth")
public class ExampleController {
    
    @GetMapping("/public")
    @Operation(summary = "Endpoint público", description = "Endpoint que não requer autenticação")
    public ResponseEntity<Map<String, Object>> publicEndpoint() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Este é um endpoint público!");
        response.put("timestamp", LocalDateTime.now());
        response.put("status", "success");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/user")
    @Operation(summary = "Endpoint para usuários", description = "Endpoint que requer autenticação de usuário")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Map<String, Object>> userEndpoint() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Bem-vindo, usuário!");
        response.put("timestamp", LocalDateTime.now());
        response.put("role", "USER");
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/admin")
    @Operation(summary = "Endpoint para administradores", description = "Endpoint que requer role de administrador")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Map<String, Object>> adminEndpoint() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Bem-vindo, administrador!");
        response.put("timestamp", LocalDateTime.now());
        response.put("role", "ADMIN");
        response.put("privileges", "Acesso total ao sistema");
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/data")
    @Operation(summary = "Enviar dados", description = "Endpoint para receber dados via POST")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Map<String, Object>> receiveData(@RequestBody Map<String, Object> data) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Dados recebidos com sucesso!");
        response.put("receivedData", data);
        response.put("timestamp", LocalDateTime.now());
        response.put("processed", true);
        return ResponseEntity.ok(response);
    }
} 