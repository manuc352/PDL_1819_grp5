package fr.istic.pdl1819_grp5;
import java.util.HashSet;
import java.util.Set;




public class WikipediaMatrix
{

	
	private Set<UrlMatrix> urlsMatrix;

	
	
	private Converter converter;


	public WikipediaMatrix(Set<String> urls, UrlType urlType){
		for (String url : urls)
			this.urlsMatrix.add(new UrlMatrix(url, urlType));

	}


	/*
	*@return
	* set of urlMatrix fill to csv.
	*/
	public UrlMatrix getResult() {
		// TODO implement me
		return null;
	}

}

