package com.hellsinner.demo.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Play implements Serializable {
    private static final long serialVersionUID = 886025495502062570L;

    private Integer playId;

    private Integer playTypeId;

    private Integer playLangId;

    private String playName;

    private String playIntroduction;

    private String playImage;

    private Integer playLength;

    private double playTicketPrice;

    private Short playStatus;
}
