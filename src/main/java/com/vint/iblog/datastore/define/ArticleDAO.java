package com.vint.iblog.datastore.define;

import org.vint.iblog.common.bean.nor.CBNArticle;

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
     * @param content   content
     * @param blogSeq   文章序号
     * @return 博文的编号，暂定8位16进制字符串
     * @throws Exception
     */
    public String postNewArticle(String title, String content, String writer, String blogSeq) throws Exception;

    /**
     * 获取文章对象
     * @param hCode 文章的唯一标识
     * @return  CBN对象
     * @throws Exception
     */
    public CBNArticle getArticle(String hCode) throws Exception;
}
