package com.projectOne.inventoryService.controller;
import com.projectOne.inventoryService.entity.ProductInventoryEntity;
import com.projectOne.inventoryService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("getStock")
    public Optional<ProductInventoryEntity> getInventory(@RequestParam("productId") String productId){
        return inventoryService.getProductInventory(productId);
    }

    @PostMapping("addStock")
    public ResponseEntity<String> addInventory(@RequestBody ProductInventoryEntity productInventory){
        inventoryService.addInventory(productInventory);
        return ResponseEntity.status(HttpStatus.CREATED).body("Inventory added for product--"+productInventory.getProductId());
    }
}
