package com.houliu.设计模式.原型模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author houliu
 * @create 2020-01-18 17:36
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video implements Cloneable {

    private String name;
    private Date deployTime;

    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Video video = (Video) obj;
        video.deployTime = (Date) this.deployTime.clone();
        return obj;
    }
}
