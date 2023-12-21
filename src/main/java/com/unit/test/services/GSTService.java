package com.unit.test.services;

public class GSTService {

    private final GSTProvider gstProvider;

    public GSTService(GSTProvider gstProvider) {
        this.gstProvider = gstProvider;
    }

    public int calculateGST(){
        System.out.println("Calculating GST");
        int rate = this.gstProvider.getGSTDetail();
        System.out.println("GST rate "+rate);
        return rate;
    }
}
