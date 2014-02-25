package com.vint.iblog.datastore.define;

import java.util.List;

/**
 *
 * Created by Vin on 14-2-17.
 */
public interface SequenceManagerDAO {

    /**
     * 根据序列类型获取当前序列值，仅仅是获取当前序列，不做
     * 自增处理。
     *
     * @param type  序列类型
     * @return 8位16进制字符串
     * @throws Exception
     */
    public String getCurrentSeq(String type) throws Exception;

    /**
     * 获取下一个序列
     * @param type  序列类型
     * @return  8位16进制字符串
     * @throws Exception
     */
    public String getNextSeq(String type) throws Exception;

    /**
     * 根据指定大小，获取一段序列
     *
     * @param type  序列类型
     * @param range 范围
     * @return 序列集合
     * @throws Exception
     */
    public List<String> getNextRangeSeq(String type, int range) throws Exception;

    /**
     * 创建序列记录，十进制每次都从0开始，16进制标记采用传入的值。
     *
     * @param type      序列类型
     * @param hexMark   16进制标记
     * @throws Exception
     */
    public void createSequence(String type, String hexMark) throws Exception;

}
