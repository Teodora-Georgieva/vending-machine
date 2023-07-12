package com.example.VendingMachine.service.impl;

import com.example.VendingMachine.dto.AddProductReqDto;
import com.example.VendingMachine.service.VendingMachineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor // NOT TRUE without it: Cannot invoke "com.example.VendingMachine.service.VendingMachineService.add(com.example.VendingMachine.dto.AddProductReqDto)" because "this.vendingMachineService" is null
public class VendingMachineServiceImpl implements VendingMachineService {
    @Override
    public void add(AddProductReqDto req) {
        System.out.println("in service - add() - req: " + req);
    }
}
