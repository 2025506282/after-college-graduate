package dao;

import java.util.List;

import model.Asthma;
import model.Chromosome;
import model.Pagination;

public interface AsthmaDao {
	public void insert(Asthma asthma);
	public List<Asthma> find(Pagination pagination,Asthma asthma);
	public Integer getTotalSize();
	public Asthma getByPmId(Integer pmId);
	public List<Chromosome> findChromosome(Chromosome chromosome);
	public List<Chromosome> getChromosomeCount();

}
