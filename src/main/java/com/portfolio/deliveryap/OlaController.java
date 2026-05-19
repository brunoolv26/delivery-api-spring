package com.portfolio.deliveryap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/teste")
    public String testarAplicacao() {
        return "A API de Delivery está online e funcionando!";
    }

}