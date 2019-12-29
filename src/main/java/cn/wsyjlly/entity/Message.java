package cn.wsyjlly.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wsyjlly
 * @create 2019.07.16 - 16:20
 **/
@AllArgsConstructor
@NoArgsConstructor
@Accessors
@Data
public class Message implements Serializable {
    private String content;
    private Date date;
}
