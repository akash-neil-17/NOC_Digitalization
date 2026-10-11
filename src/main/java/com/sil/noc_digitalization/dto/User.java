package com.sil.noc_digitalization.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private Long employeeId;
    private String name;
    private LocalDate dob;
    private LocalDate doj;
    private String department;
    private String designation;
    private BigDecimal annualIncome;
}
