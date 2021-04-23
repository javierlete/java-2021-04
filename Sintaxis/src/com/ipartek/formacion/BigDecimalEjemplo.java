package com.ipartek.formacion;

import java.math.BigDecimal;

public class BigDecimalEjemplo {

	public static void main(String[] args) {
		double total = 0;
        total += 5.6;
        total += 5.8;
        System.out.println(total);
        
		BigDecimal totalBd = BigDecimal.ZERO;
		totalBd = totalBd.add(new BigDecimal("5.6"));
		totalBd = totalBd.add(new BigDecimal("5.8"));
		System.out.println(totalBd);
		
	}

}
