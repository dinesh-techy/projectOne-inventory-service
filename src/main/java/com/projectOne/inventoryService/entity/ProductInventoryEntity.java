package com.projectOne.inventoryService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductInventoryEntity {

    @Id
    private String productId;
    private Integer quantity;
    private Double marketPrice;
    private Double offerPrice;
}
