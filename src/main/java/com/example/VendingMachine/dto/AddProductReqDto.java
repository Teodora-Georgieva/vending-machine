package com.example.VendingMachine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddProductReqDto {
    private String name;
    private int price;
    //todo....
}