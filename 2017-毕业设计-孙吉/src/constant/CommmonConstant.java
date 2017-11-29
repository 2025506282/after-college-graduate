package constant;

public class CommmonConstant {
	// Parameter.
	public static final String USER_NAME = "userName";
	public static final String PASSWORD = "password";
	// Information.
	public static final String SRERVICE_IS_WRONG = "service is wrong";
	public static final String PARAMETER_IS_WRONG = "parameter is wrong";
	public static final String TRANSFORM_IS_WRONG = "transform is wrong";
	public static final String SEARCH_IS_WRONG = "没有查找到你要搜索的内容";
	public static final String INSERT_IS_WRONG = "插入内容不能为空";
	// Sql.
	public static final String SELECT_USER_BY_USER_NAME_AND_PASSWORD = "SELECT user_name FROM users WHERE id=? AND password=?";
	public static final String SELECT_ASTHMA_LIST = "SELECT * FROM asthma  ORDER BY id LIMIT ?,? ";
	public static final String SELECT_ASTHMA_TOTAL_SIZE = "SELECT COUNT(1) FROM asthma";
	public static final String SELECT_ASTHMA_BY_PM_ID = "SELECT * FROM asthma where pm_id=?";
	public static final String INSERT_ASTHMA = "INSERT INTO asthma(chromosome,time,title,author_name,author_information,gene,thesis,pm_id,doi) VALUES (?,NOW(),?,?,?,?,?,?,?)";
	public static final String SELECT_TOTAL_COUNT_BY_CHROMOSOME = "SELECT chrom,COUNT(1) AS number FROM asthma INNER JOIN hg38_refflat_gene ON gene=geneName GROUP BY chrom";
	public static final String SELECT_ASTHMA_BY_CHROMOSOME = "SELECT DISTINCT chrom,txStart,txEnd,geneName,strand FROM asthma INNER JOIN hg38_refflat_gene ON gene=geneName WHERE chrom=?";

	// DB.
	public static final String DB_URL = "jdbc:mysql://localhost:3306/sunji";
	public static final String DB_NAME = "com.mysql.jdbc.Driver";
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "123456789";

	//Properies.
	public static final String JDBC_PROPERTIES_PATH = "D:/360Downloads/Software/tomacat/webapps/2017-毕业设计-孙吉/WEB-INF/conf/jdbc.properties";
	public static final String PAGINATION_PROPERTIES_PATH = "D:/360Downloads/Software/tomacat/webapps/2017-毕业设计-孙吉/WEB-INF/conf/pagination.properties";
	public static final String DB_URL_KEY = "url";
	public static final String DB_NAME_KEY = "name";
	public static final String DB_USER_KEY = "user";
	public static final String DB_PASSWORD_KEY = "password";
	public static final String PAGE_SIZE = "pageSize";
	
	//Paging
	public static final String PAGE_INDEX = "pageIndex";
	public static final String KEY_WORD = "keyWord";
	public static final String KEY_WORD_VALUE = "keyWordValue";
	public static final String ACTIVE_INDEX = "activeIndex";

	//Model
	public static final String ASTHMA = "asthma";
	public static final String GENE = "gene";
	public static final String PM_ID = "pmId";
	public static final String CHROMOSOME = "chromosome";
	public static final String CHROMOSOME_TYPE = "chromosomeType";
	public static final String DISEASE = "disease";
	public static final String TITLE = "title";
	public static final String AUTHOR_NAME = "authorName";
	public static final String AUTHOR_INFORMATION = "authorInformation";
	public static final String DOI = "doi";
	public static final String THESIS = "thesis";
	
	// Web.xml filter init-param.
	public static final String ENCODE = "encode";
	// Request parameter attribute.
	public static final String PAGINATION = "pagination";
	public static final String LIST = "list";

}
