package model;

public class Chromosome {
	private String chromosomeType;
	private Integer number;
	private String txStart;
	private String txEnd;
	private String geneName;
	private String strand;
	public String getTxStart() {
		return txStart;
	}
	public void setTxStart(String txStart) {
		this.txStart = txStart;
	}
	public String getTxEnd() {
		return txEnd;
	}
	public void setTxEnd(String txEnd) {
		this.txEnd = txEnd;
	}
	public String getGeneName() {
		return geneName;
	}
	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}
	public String getStrand() {
		return strand;
	}
	public void setStrand(String strand) {
		this.strand = strand;
	}
	public String getChromosomeType() {
		return chromosomeType;
	}
	public void setChromosomeType(String chromosomeType) {
		this.chromosomeType = chromosomeType;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}

	

}
