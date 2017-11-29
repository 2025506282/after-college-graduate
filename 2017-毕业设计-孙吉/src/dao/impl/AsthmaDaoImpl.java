package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import constant.CommmonConstant;
import dao.AsthmaDao;
import model.Asthma;
import model.Chromosome;
import model.Pagination;
import util.DBUtil;
import util.FormatTransUtil;

public class AsthmaDaoImpl implements AsthmaDao {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private Asthma asthma = null;
	private List<Asthma> list = new ArrayList<Asthma>();
	private List<Chromosome> listChromosome = new ArrayList<Chromosome>();
	private Chromosome chromosome = null;

	@Override
	public void insert(Asthma asthma) {
		// TODO Auto-generated method stub
		connection = DBUtil.getConnection();
		try {
			preparedStatement = connection.prepareStatement(CommmonConstant.INSERT_ASTHMA);
			preparedStatement.setString(1, "a");
			preparedStatement.setString(2, "asthma.getTitle()");
			preparedStatement.setString(3, "asthma.getTitle()");
			preparedStatement.setString(4, "asthma.getTitle()");
			preparedStatement.setString(5, "asthma.getTitle()");
			preparedStatement.setString(6, "asthma.getTitle()");
			preparedStatement.setString(7, "asthma.getTitle()");
			preparedStatement.setString(8, "asthma.getTitle()");
			Integer index = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} finally {
			try {
				preparedStatement.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Asthma> find(Pagination pagination, Asthma asthma) {
		try {
			connection = DBUtil.getConnection();
			Integer index = null;
			index = (pagination.getPageIndex() - 1) * pagination.getPageSize();
			preparedStatement = connection.prepareStatement(FormatTransUtil.transSql(pagination.getKeyWord()));
			// preparedStatement.setString(1, asthma.getChromosome());
			// preparedStatement.setString(2, asthma.getDisease());
			// preparedStatement.setString(3, asthma.getTitle());
			// preparedStatement.setString(4, asthma.getAuthorName());
			// preparedStatement.setString(5, asthma.getGene());
			// preparedStatement.setString(6, asthma.getThesis());
			// preparedStatement.setString(7,
			// FormatTransUtil.transKeyWord(asthma.getPmId().toString()));
			preparedStatement.setString(1, FormatTransUtil.transKeyWord(pagination.getKeyWordValue()));
			preparedStatement.setInt(2, index);
			preparedStatement.setInt(3, pagination.getPageSize());
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				asthma = new Asthma();
				asthma.setDate(resultSet.getDate("time"));
				asthma.setAuthorInformation(resultSet.getString("author_information"));
				asthma.setAuthorName(resultSet.getString("author_name"));
				asthma.setId(resultSet.getInt("id"));
				asthma.setGene(resultSet.getString("gene"));
				asthma.setDoi(resultSet.getString("doi"));
				asthma.setPmId(resultSet.getString("pm_id"));
				asthma.setThesis(resultSet.getString("thesis"));
				asthma.setTitle(resultSet.getString("title"));
				list.add(asthma);
			}

		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
		// TODO Auto-generated method stub
	}

	public Integer getTotalSize() {
		Integer totalSize = null;
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(CommmonConstant.SELECT_ASTHMA_TOTAL_SIZE);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				totalSize = resultSet.getInt(1);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return totalSize;
	}

	@Override
	public Asthma getByPmId(Integer pmId) {
		// TODO Auto-generated method stub
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(CommmonConstant.SELECT_ASTHMA_BY_PM_ID);
			preparedStatement.setInt(1, pmId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				asthma = new Asthma();
				asthma.setDate(resultSet.getDate("time"));
				asthma.setAuthorInformation(resultSet.getString("author_information"));
				asthma.setAuthorName(resultSet.getString("author_name"));
				asthma.setId(resultSet.getInt("id"));
				asthma.setGene(resultSet.getString("gene"));
				asthma.setDoi(resultSet.getString("doi"));
				asthma.setPmId(resultSet.getString("pm_id"));
				asthma.setThesis(resultSet.getString("thesis"));
				asthma.setTitle(resultSet.getString("title"));
			}

		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return asthma;
	}

	public List<Chromosome> findChromosome(Chromosome chromosome) {
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(CommmonConstant.SELECT_ASTHMA_BY_CHROMOSOME);
			preparedStatement.setString(1, chromosome.getChromosomeType());
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chromosome = new Chromosome();
				chromosome.setChromosomeType(resultSet.getString("chrom"));
				chromosome.setGeneName(resultSet.getString("geneName"));
				chromosome.setTxStart(resultSet.getString("txStart"));
				chromosome.setTxEnd(resultSet.getString("txEnd"));
				chromosome.setStrand(resultSet.getString("strand"));
				listChromosome.add(chromosome);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listChromosome;
		// TODO Auto-generated method stub
	}

	public List<Chromosome> getChromosomeCount() {
		// TODO Auto-generated method stub
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(CommmonConstant.SELECT_TOTAL_COUNT_BY_CHROMOSOME);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chromosome = new Chromosome();
				chromosome.setChromosomeType(resultSet.getString("chrom"));
				chromosome.setNumber(resultSet.getInt("number"));
				listChromosome.add(chromosome);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listChromosome;
	}







}
