package com.houliu.多线程操作.CountDownLatch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author houliu
 * @create 2020-01-16 20:45
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum CountryEnum {

    ONE(1,"齐"),
    TWO(2,"楚"),
    THREE(3,"燕"),
    FOUR(4,"韩"),
    FIVE(5,"赵"),
    SIX(6,"魏"),

    ;

    private int code;
    private String countryName;

    public static String getCountryName(int index){
        CountryEnum[] countryEnums = CountryEnum.values();
        for (CountryEnum countryEnum : countryEnums) {
            if (index == countryEnum.getCode()){
                return countryEnum.getCountryName();
            }
        }
        return null;
    }

}
