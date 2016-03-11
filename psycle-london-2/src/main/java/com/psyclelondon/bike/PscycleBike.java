package com.psyclelondon.bike;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PscycleBike {

	private String bikeName;
	private String bikeColour;
	private String bikeHeight;
	private String bikeType;
	private String bikeGears;
	private String bikeCost;
	private String bikeGenderType;
	private List<String> attributes;

	public PscycleBike(String bikeName, String bikeColour, String bikeHeight,
			String bikeType, String bikeGears, String bikeCost,
			String bikeGenderType, List<String> attributes) {
		this.bikeName = bikeName;
		this.bikeColour = bikeColour;
		this.bikeHeight = bikeHeight;
		this.bikeType = bikeType;
		this.bikeGears = bikeGears;
		this.bikeCost = bikeCost;
		this.bikeGenderType = bikeGenderType;
		this.attributes = attributes;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeColour() {
		return bikeColour;
	}

	public void setBikeColour(String bikeColour) {
		this.bikeColour = bikeColour;
	}

	public String getBikeHeight() {
		return bikeHeight;
	}

	public void setBikeHeight(String bikeHeight) {
		this.bikeHeight = bikeHeight;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public String getBikeGears() {
		return bikeGears;
	}

	public void setBikeGears(String bikeGears) {
		this.bikeGears = bikeGears;
	}

	public String getBikeCost() {
		return bikeCost;
	}

	public void setBikeCost(String bikeCost) {
		this.bikeCost = bikeCost;
	}

	public String getBikeGenderType() {
		return bikeGenderType;
	}

	public void setBikeGenderType(String bikeGenderType) {
		this.bikeGenderType = bikeGenderType;
	}

	public List<String> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "PscycleBike [bikeName=" + bikeName + ", bikeColour="
				+ bikeColour + ", bikeHeight=" + bikeHeight + ", bikeType="
				+ bikeType + ", bikeGears=" + bikeGears + ", bikeCost="
				+ bikeCost + ", bikeGenderType=" + bikeGenderType
				+ ", Attributes=" + attributes + "]";
	}

}
