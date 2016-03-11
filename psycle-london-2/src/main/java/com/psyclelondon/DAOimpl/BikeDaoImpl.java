package com.psyclelondon.DAOimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.psyclelondon.DAO.BikeDAO;
import com.psyclelondon.bike.PscycleBike;

public class BikeDaoImpl implements BikeDAO
{
	private List<PscycleBike> bikeList;
	
	public List<PscycleBike> getAllPscycleBikes() {
		return bikeList;
	}

	public List<PscycleBike> getBikeList() {
		return bikeList;
	}

	public void setBikeList(List<PscycleBike> bikeList) {
		this.bikeList = bikeList;
	}	
	
	
}
