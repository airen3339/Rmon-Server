package com.bobooi.watch.api.protocol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.msgpack.annotation.Message;

/**
 * @author bobo
 * @date 2021/6/26
 */

@Message
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MsgPack {
    private byte type;
    private int id;
    private byte flag;
    private byte[] content;
}
