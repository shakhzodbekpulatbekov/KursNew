package com.example.kpi.CurrencyApiDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyApiDto {
    private Integer id;
    private String Code;
    private String Ccy;
    private String CcyNm_RU;
    private String CcyNm_UZ;
    private String CcyNm_UZC;
    private String CcyNm_EN;
    private String Nominal;
    private String Rate;
    private String Diff;
    private String Date;

    public String toString() {
        return "{" + "\n" +
                "\"id\" : \"" + id + '\"' + ",\n" +
                "\"Code\" : \"" + Code + '\"' + ",\n" +
                "\"Ccy\" : \"" + Ccy + '\"' + ",\n" +
                "\"CcyNm_RU\" : \"" + CcyNm_RU + '\"' + ",\n" +
                "\"CcyNm_UZ\" : \"" + CcyNm_UZ + '\"' + ",\n" +
                "\"CcyNm_UZC\" : \"" + CcyNm_UZC + '\"' + ",\n" +
                "\"CcyNm_EN\" : \"" + CcyNm_EN + '\"' + ",\n" +
                "\"Nominal\" : \"" + Nominal + '\"' + ",\n" +
                "\"Rate\" : \"" + Rate + '\"' + ",\n" +
                "\"Diff\" : \"" + Diff + '\"' + ",\n" +
                "\"Date\" : \"" + Date + '\"' + "\n" +
                '}';
    }
}
