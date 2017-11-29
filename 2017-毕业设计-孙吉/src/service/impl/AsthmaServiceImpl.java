package service.impl;

import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

import constant.CommmonConstant;
import dao.AsthmaDao;
import dao.impl.AsthmaDaoImpl;
import exception.ParameterException;
import model.Asthma;
import model.Chromosome;
import model.Pagination;
import service.AsthmaService;
import util.StringUtil;

public class AsthmaServiceImpl implements AsthmaService {

	private List<Asthma> list = new ArrayList<Asthma>();
    private List<Chromosome> listChromosome = new ArrayList<Chromosome>();
    private AsthmaDao asthmaDao = new AsthmaDaoImpl();
	private Asthma asthma = new Asthma();

	@Override
	public List<Asthma> findAsthmaList(Pagination pagination, Asthma asthma) throws ParameterException {
		// TODO Auto-generated method stub
		list = asthmaDao.find(pagination, asthma);
		if (list == null) {
			throw new ParameterException(CommmonConstant.SEARCH_IS_WRONG);
		}
		return list;
	}

	@Override
	public Integer getTotalSize() throws ParameterException {
		// TODO Auto-generated method stub
		Integer totalSize = asthmaDao.getTotalSize();
		if (totalSize == 0) {
			throw new ParameterException(CommmonConstant.SEARCH_IS_WRONG);
		}
		return totalSize;
	}

	@Override
	public Asthma getAsthmaByPmId(Integer pmId) throws ParameterException {
		// TODO Auto-generated method stub
		if (pmId == null) {
			throw new ParameterException(CommmonConstant.SEARCH_IS_WRONG);
		}
		asthma = asthmaDao.getByPmId(pmId);
		if (asthma == null) {
			throw new ParameterException(CommmonConstant.SEARCH_IS_WRONG);
		}
		return asthma;
	}

	@Override
	public void insertAsthma(Asthma asthma) throws ParameterException {
		// TODO Auto-generated method stub
		if (StringUtil.isNull(asthma.getTitle())) {
			throw new ParameterException(CommmonConstant.INSERT_IS_WRONG);
		}
		if (StringUtil.isNull(asthma.getGene())) {
			throw new ParameterException(CommmonConstant.INSERT_IS_WRONG);
		}
		asthmaDao.insert(asthma);
	}

	@Override
	public List<Chromosome> getChromosomeCount() throws ParameterException {
		listChromosome = asthmaDao.getChromosomeCount();
		return listChromosome;
	}
	@Override

	public List<Chromosome> findChromosomeList(Chromosome chromosome) throws ParameterException {
		if(StringUtil.isNull(chromosome.getChromosomeType())){
			throw new ParameterException();
		}
		listChromosome = asthmaDao.findChromosome(chromosome);
		return listChromosome;
	}


}
