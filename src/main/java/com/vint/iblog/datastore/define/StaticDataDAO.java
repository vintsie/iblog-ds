package com.vint.iblog.datastore.define;

import org.vint.iblog.common.bean.config.StaticData;

import java.util.List;
import java.util.Map;

/**
 * 静态数据数据库存储接口
 * Created by Vin on 14-2-17.
 */
public interface StaticDataDAO {

    /**
     * 拉取所有的静态数据
     *
     * @return  所有的静态数据集合
     * @throws Exception
     */
    public List<StaticData> getAllStaticData() throws Exception;

    /**
     * 获取所有的静态数据，装在
     * @return
     * @throws Exception
     */
    public Map<String, StaticData> getMappedStaticData() throws Exception;

    /**
     * 新增配置数据
     * @param dataGroup 数据类型分组
     * @param dataType  数据类型
     * @param dataValue 数据值
     * @throws Exception
     */
    public void newStaticData(String dataType, String dataValue) throws Exception;

    /**
     * 失效配置数据。dataType必传，dataValue可以为空。如果dataValue为空，
     * 则将所有的dataType数据全部失效。
     *
     * @param dataType  数据类型
     * @param dataValue 数据值
     * @throws Exception
     */
    public void delStaticData(String dataType, String dataValue) throws Exception;

}
