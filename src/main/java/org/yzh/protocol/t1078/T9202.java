package org.yzh.protocol.t1078;

import io.github.yezhihao.protostar.DataType;
import io.github.yezhihao.protostar.annotation.Field;
import io.github.yezhihao.protostar.annotation.Message;
import org.yzh.protocol.basics.JTMessage;
import org.yzh.protocol.commons.JT1078;

/**
 * @author yezhihao
 * @home https://gitee.com/yezhihao/jt808-server
 */
@Message(JT1078.平台下发远程录像回放控制)
public class T9202 extends JTMessage {

    private int channelNo;
    private int playbackMode;
    private int playbackSpeed;
    private String playbackTime;

    @Field(index = 0, type = DataType.BYTE, desc = "逻辑通道号")
    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    @Field(index = 1, type = DataType.BYTE, desc = "回放控制:\n" +
            "0.开始回放\n" +
            "1.暂停回放\n" +
            "2.结束回放\n" +
            "3.快进回放\n" +
            "4.关键帧快退回放\n" +
            "5.拖动回放\n" +
            "6.关键帧播放")
    public int getPlaybackMode() {
        return playbackMode;
    }

    public void setPlaybackMode(int playbackMode) {
        this.playbackMode = playbackMode;
    }

    @Field(index = 2, type = DataType.BYTE, desc = "快进或快退倍数:\n" +
            "0.无效\n" +
            "1.1倍\n" +
            "2.2倍\n" +
            "3.4倍\n" +
            "4.8倍\n" +
            "5.16倍\n" +
            "(回放控制为3和4时,此字段内容有效,否则置0)")
    public int getPlaybackSpeed() {
        return playbackSpeed;
    }

    public void setPlaybackSpeed(int playbackSpeed) {
        this.playbackSpeed = playbackSpeed;
    }

    @Field(index = 3, type = DataType.BCD8421, length = 6, desc = "拖动回放位置(YYMMDDHHMMSS,回放控制为5时,此字段有效)")
    public String getPlaybackTime() {
        return playbackTime;
    }

    public void setPlaybackTime(String playbackTime) {
        this.playbackTime = playbackTime;
    }
}