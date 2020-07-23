package com.mylearn.biz.base;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zisheng.nong
 * @create 2020-04-17 上午11:47
 * @desc
 **/
@Data
@Slf4j
public class PairObject implements Cloneable, Serializable {

    private static final long serialVersionUID = 1743582083790291487L;
    private Long              id;

    private String            name;

    private Date              handlingTime;

    @Override
    public Object clone() {

        PairObject pairObject = null;

        try {
            pairObject = (PairObject) super.clone();
        } catch (CloneNotSupportedException e) {
            log.warn("CarSimpleInfoDTO clone error!", e);
        }
        return pairObject;

    }

}
