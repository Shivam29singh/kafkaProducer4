package com.PODownload.Producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class POInfo {
    private long poNumber;
    private String poDate;
    private String poAddress;
    private String poLineNumber;
    private long upcNumber;
    private String upcName;
    private String itemName;
    private int orderedQuantity;
}