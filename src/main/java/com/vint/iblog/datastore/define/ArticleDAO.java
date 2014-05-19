package com.vint.iblog.datastore.define;

import org.vint.iblog.common.bean.nor.CBNArticle;

import java.util.List;

/**
 * 博文持久层接口
 *
 * Created by Vin on 14-2-14.
 */
public interface ArticleDAO {

    /**
     * 获取文章对象
     * @param hCode 文章的唯一标识
     * @return  CBN对象
     * @throws Exception
     */
    public CBNArticle getArticle(String hCode) throws Exception;

    public CBNArticle getArticle(String title, String repoInfo) throws Exception;
    /**
     * 分页查询文章
     * @param pageNum   数据页码
     * @param pageSize  每页数据量
     * @return  文章对象集合
     * @throws Exception
     */
    public List<CBNArticle> getArticles(int pageNum, int pageSize) throws Exception;

    /**
     * 获取博文的浏览次数
     *
     * @param articleId 博文编号
     * @return  Integer
     * @throws Exception
     */
    public int getArticleViewCount(long articleId) throws Exception;

    /**
     * 修改文章内容
     * @param article   Article Bean
     * @throws Exception
     */
    public void modifyArticle(CBNArticle article) throws Exception;
    /**
     * 新增新的博文
     *
     * @param title  博文标题
     * @param writer 作者
     * @param content   content
     * @param blogSeq   文章序号
     * @return 博文的编号，暂定8位16进制字符串
     * @throws Exception
     */
    public String postNewArticle(String title, String content, String writer, String blogSeq) throws Exception;

    /**
     * 保存新文章
     * @param article   {@link org.vint.iblog.common.bean.nor.CBNArticle}
     * @return 系统内部文章唯一标识
     * @throws Exception
     */
    public String postNewArticle(CBNArticle article) throws Exception;

    public void saveArticles(List<CBNArticle> articles) throws Exception;
}
