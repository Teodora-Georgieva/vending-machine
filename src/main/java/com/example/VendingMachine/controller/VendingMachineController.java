package com.example.VendingMachine.controller;

import com.example.VendingMachine.dto.AddProductReqDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.VendingMachine.service.VendingMachineService;

@RestController
@AllArgsConstructor //without it: Cannot invoke "com.example.VendingMachine.service.VendingMachineService.add(com.example.VendingMachine.dto.AddProductReqDto)" because "this.vendingMachineService" is null
public class VendingMachineController {
    private VendingMachineService vendingMachineService; //todo why in tarya we make them final?

    @PostMapping("/product/add") //todo post/put
    public ResponseEntity<?> add(@RequestBody AddProductReqDto req) { //todo maybe I can put validation on the req body
        System.out.println("in controller - add()");
        vendingMachineService.add(req);
        return null; //todo
    }
}