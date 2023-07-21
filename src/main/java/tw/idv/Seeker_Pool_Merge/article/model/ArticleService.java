package tw.idv.Seeker_Pool_Merge.article.model;

import java.sql.Timestamp;
import java.util.List;

public class ArticleService {

	private ArticleDaoImpl daoImpl;

	public ArticleService() {
		daoImpl = new ArticleDaoImpl();
	}

	// 找到所有文章
	public List<ArticleVo> getAllArticles() {
		return daoImpl.getAllArticles();
	}

	// 根據文章編號找到文章
	public ArticleVo getArticleById(String arNo) {
		return daoImpl.getArticleById(Integer.valueOf(arNo));
	}

}
