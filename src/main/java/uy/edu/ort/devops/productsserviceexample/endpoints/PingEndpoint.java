package uy.edu.ort.devops.productsserviceexample.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uy.edu.ort.devops.productsserviceexample.domain.Product;

@RestController
@RequestMapping("/")
public class PingEndpoint {
    @GetMapping("/ping")
    public ResponseEntity ping() {
        return ResponseEntity.ok("pong");
    }
}
