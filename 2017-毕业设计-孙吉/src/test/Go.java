package test;

import java.util.ArrayList;
import java.util.List;

import exception.ParameterException;
import model.Chromosome;
import net.sf.json.JSONArray;
import service.AsthmaService;
import service.impl.AsthmaServiceImpl;

public class Go {
	public static void main(String[] args) {
		System.out.println("chromosomeNumber.toString()");
		AsthmaService asthmaService = new AsthmaServiceImpl();
		List<Chromosome> list= new ArrayList<Chromosome>();
		
		try {
			//System.out.println(String.valueOf(asthmaService.getChromosomeCount(chromosomes)));
			list = asthmaService.getChromosomeCount();
				System.out.println(JSONArray.fromObject(list));
		} catch (ParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
