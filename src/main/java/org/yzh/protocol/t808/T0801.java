package org.yzh.protocol.t808;

import io.github.yezhihao.protostar.DataType;
import io.github.yezhihao.protostar.annotation.Field;
import io.github.yezhihao.protostar.annotation.Message;
import org.yzh.protocol.basics.JTMessage;
import org.yzh.protocol.commons.JT808;

/**
 * @author yezhihao
 * @home https://gitee.com/yezhihao/jt808-server
 */
@Message(JT808.多媒体数据上传)
public class T0801 extends JTMessage {

    @Field(index = 0, type = DataType.DWORD, desc = "多媒体数据ID")
    private int id;
    @Field(index = 4, type = DataType.BYTE, desc = "多媒体类型：0.图像 1.音频 2.视频 ")
    private int type;
    @Field(index = 5, type = DataType.BYTE, desc = "多媒体格式编码：0.JPEG 1.TIF 2.MP3 3.WAV 4.WMV ")
    private int format;
    @Field(index = 6, type = DataType.BYTE, desc = "事件项编码")
    private int event;
    @Field(index = 7, type = DataType.BYTE, desc = "通道ID")
    private int channelId;
    @Field(index = 8, type = DataType.OBJ, length = 28, desc = "位置信息")
    private T0200 location;
    @Field(index = 36, type = DataType.BYTES, desc = "多媒体数据包")
    private byte[] packet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public T0200 getLocation() {
        return location;
    }

    public void setLocation(T0200 location) {
        this.location = location;
    }

    public byte[] getPacket() {
        return packet;
    }

    public void setPacket(byte[] packet) {
        this.packet = packet;
    }
}