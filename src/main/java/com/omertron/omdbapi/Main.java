package com.omertron.omdbapi;

import com.omertron.omdbapi.tools.*;
import com.omertron.omdbapi.model.*;
import com.omertron.omdbapi.emumerations.*;

public class Main {
	public static void main(String[] args) throws OMDBException{
		OmdbApi omdb = new OmdbApi();
		
		SearchResults results = omdb.search(new OmdbBuilder().setSearchTerm("Star Wars").build());
	}

}
