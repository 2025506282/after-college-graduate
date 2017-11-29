package model;

import java.util.Date;

public class Asthma {
	private Integer id;
	private String chromosome;
	private String disease;
	private Date date;
	private String title;
	private String authorName;
	private String authorInformation;
	private String gene;
	private String thesis;
	private String pmId;
	private String doi;
	public String getChromosome() {
		return chromosome;
	}
	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getGene() {
		return gene;
	}
	public void setGene(String gene) {
		this.gene = gene;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorInformation() {
		return authorInformation;
	}
	public void setAuthorInformation(String authorInformation) {
		this.authorInformation = authorInformation;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	public String getPmId() {
		return pmId;
	}
	public void setPmId(String pmId) {
		this.pmId = pmId;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	
}
