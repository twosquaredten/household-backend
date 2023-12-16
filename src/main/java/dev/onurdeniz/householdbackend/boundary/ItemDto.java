package dev.onurdeniz.householdbackend.boundary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ItemDto {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    @NotNull
    @Size(min=2)
    private String itemName;
    @NotNull
    @Size(min=2)
    private String vendor;
    @NotNull
    private Double price;
    @NotNull
    private LocalDate dateOfPurchase;
    private Double discount;
}
