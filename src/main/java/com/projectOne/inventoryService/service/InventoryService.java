package com.projectOne.inventoryService.service;
import com.projectOne.inventoryService.entity.ProductInventoryEntity;
import com.projectOne.inventoryService.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepo inventoryRepo;

    public Optional<ProductInventoryEntity> getProductInventory(String productId){
        return inventoryRepo.findById(productId);
    }

    public String addInventory(ProductInventoryEntity productInventory){
        inventoryRepo.save(productInventory);
        return "Inventory added!";
    }
}
