package com.vint.iblog.datastore.define;

import org.vint.iblog.common.bean.nor.CBNGitHubCatalog;

import java.util.List;

/**
 * 公共模块数据操作对象
 *
 * Created by Vin on 14-5-17.
 */
public interface CommonDAO {

    /**
     * 保存GitHub目录
     * @param owner repo拥有者
     * @param repo  repo名称
     * @param path  repo中的一个path
     * @param type  path的类型
     * @throws Exception
     */
    public void saveGitHubCatalog(String owner, String repo, String path, String type) throws Exception;

    public List<CBNGitHubCatalog> getGitHubCatalogs() throws Exception;

    public void initGoogleDs() throws Exception;
}
