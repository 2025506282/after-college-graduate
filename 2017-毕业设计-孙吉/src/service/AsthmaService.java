package service;

import java.util.ArrayList;
import java.util.List;

import exception.ParameterException;
import model.Asthma;
import model.Chromosome;
import model.Pagination;

public interface AsthmaService {
	public List<Asthma> findAsthmaList(Pagination pagination, Asthma asthma) throws ParameterException;
	public Integer getTotalSize() throws ParameterException;
	public Asthma getAsthmaByPmId(Integer pmId) throws ParameterException;
	public void insertAsthma(Asthma asthma) throws ParameterException;
	public List<Chromosome> getChromosomeCount() throws ParameterException;
	List<Chromosome> findChromosomeList(Chromosome chromosome) throws ParameterException;

}
