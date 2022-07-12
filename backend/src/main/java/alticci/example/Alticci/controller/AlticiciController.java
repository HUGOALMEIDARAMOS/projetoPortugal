package alticci.example.Alticci.controller;

import alticci.example.Alticci.service.AlticiciService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alticci")
public class AlticiciController {

    final AlticiciService  alticiciService;

    public AlticiciController(AlticiciService alticiciService) {
        this.alticiciService = alticiciService;
    }

    @GetMapping("/status")
    public ResponseEntity<String>status(){
        return ResponseEntity.ok("Online");
    }

    @GetMapping("/{n}")
    public ResponseEntity<List<Integer>> calculo(@PathVariable Integer n){
        return new ResponseEntity<>( alticiciService.calculoService(n), HttpStatus.OK);
    };
}
