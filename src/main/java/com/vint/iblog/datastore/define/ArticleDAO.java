package com.vint.iblog.datastore.define;

/**
 * 博文持久层接口
 *
 * Created by Vin on 14-2-14.
 */
public interface ArticleDAO {

    /**
     * 获取博文的浏览次数
     *
     * @param articleId 博文编号
     * @return  Integer
     * @throws Exception
     */
    public int getArticleViewCount(long articleId) throws Exception;

    /**
     * 新增新的博文
     *
     * @param title  博文标题
     * @param writer 作者
     * @return 博文的编号，暂定8位16进制字符串
     * @throws Exception
     */
    public String postNewArticle(String title, String writer, String blogSeq) throws Exception;
}
