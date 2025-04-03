package com.projectOne.inventoryService.repository;

import com.projectOne.inventoryService.entity.ProductInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<ProductInventoryEntity,String> {
}
