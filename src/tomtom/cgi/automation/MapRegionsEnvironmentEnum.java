/**
 * 
 */
package tomtom.cgi.automation;

/**
 * @author tiwarirt
 *
 */
public enum MapRegionsEnvironmentEnum {
	
	Africa("Africa", "YES", "YES", "NO", 13),

	Australia("Australia", "YES", "YES", "NO", 14),
	
	Benelux("Benelux", "YES", "YES", "YES", 28),
	
	Brazil("Australia", "YES", "YES", "NO", 24),
	
	Canada_Alaska("Canada_Alaska", "YES", "YES", "NO", 172),
	
	Central_Eastern_Europe("Central_Eastern_Europe", "YES", "YES", "NO", 176),
	
	Eastern_Europe("Eastern_Europe", "YES", "YES", "YES", 30),
	
	Europe("Europe", "YES", "YES", "NO", 16),
	
	France("France", "YES", "YES", "YES", 26),
	
	Germany_Austria_switzerland("Germany_Austria_switzerland", "YES", "YES", "YES", 25),
	
	Greece("Greece", "YES", "YES", "YES", 33),
	
	Iberia("Iberia", "YES", "YES", "YES", 27),
	
	Italy("Italy", "YES", "YES", "YES", 14),
	
	India("India", "YES", "YES", "NO", 177),
	
	NewZealand("NewZealand", "YES", "YES", "NO", 17),
	
	Poland("Poland", "YES", "YES", "YES", 34),
	
	Russia("Russia", "YES", "YES", "NO", 32),
	
	Scandinavia("Scandinavia", "YES", "YES", "YES", 29),
	
	SouthAfrica_Swaziland_lesotho("SouthAfrica_Swaziland_lesotho", "YES", "YES", "NO", 175),
	
	SouthAmerica_Caribbean_Mexico("SouthAmerica_Caribbean_Mexico", "YES", "YES", "NO", null),
	
	SoutheastAsia("SoutheastAsia", "YES", "YES", "NO", 35),
	
	Taiwan("Taiwan", "YES", "YES", "YES", 174),
	
	Turkey("Turkey", "YES", "YES", "YES", 31),
	
	UK_Ireland("UK_Ireland", "YES", "YES", "YES", 15),
	
	USA("USA", "YES", "YES", "NO", 20),
	
	USA_Canada("USA_Canada", "YES", "YES", "NO", 19),
	
	USA_East_South_Central("USA_East_South_Central", "YES", "YES", "NO", 167),
	
	USA_Mid_West("USA_Mid_West", "YES", "YES", "NO", 168),
	
	USA_North_East("USA_North_East", "YES", "YES", "NO", 165),
	
	US_North_West("US_North_West", "YES", "YES", "NO", 170),
	
	USA_South_Atlantic("USA_South_Atlantic", "YES", "YES", "NO", 166),
	
	USA_South_West("USA_South_West", "YES", "YES", "NO", 171),
	
	USA_West_South_Central("USA_West_South_Central", "YES", "YES", "NO", 169),
	
	USA_Canada_Mexico("USA_Canada_Mexico", "YES", "YES", "NO", 22),
	
	Western_Europe("USA_Canada_Mexico", "YES", "YES", "NO", 18);
	

	private Integer entitlementFk;

	private String mapRegions;

	private String bodrum;
	
	private String izmir;
	
	private String forza;
	

	/**
	 * Instantiates a new transfer status enum.
	 * 
	 * @param percentage
	 *            the percentage
	 * @param code
	 *            the code
	 * @param description
	 *            the description
	 */
	private MapRegionsEnvironmentEnum(String mapRegions,String bodrum,String izmir,String forza,Integer entitlementFk) {
		this.mapRegions = mapRegions;
		this.bodrum = bodrum;
		this.izmir = izmir;
		this.forza = forza;
		this.entitlementFk = entitlementFk;
	}


	/**
	 * @return the entitlementFk
	 */
	public Integer getEntitlementFk() {
		return entitlementFk;
	}


	/**
	 * @param entitlementFk the entitlementFk to set
	 */
	public void setEntitlementFk(Integer entitlementFk) {
		this.entitlementFk = entitlementFk;
	}


	/**
	 * @return the mapRegions
	 */
	public String getMapRegions() {
		return mapRegions;
	}


	/**
	 * @param mapRegions the mapRegions to set
	 */
	public void setMapRegions(String mapRegions) {
		this.mapRegions = mapRegions;
	}


	/**
	 * @return the bodrum
	 */
	public String getBodrum() {
		return bodrum;
	}


	/**
	 * @param bodrum the bodrum to set
	 */
	public void setBodrum(String bodrum) {
		this.bodrum = bodrum;
	}


	/**
	 * @return the izmir
	 */
	public String getIzmir() {
		return izmir;
	}


	/**
	 * @param izmir the izmir to set
	 */
	public void setIzmir(String izmir) {
		this.izmir = izmir;
	}


	/**
	 * @return the forza
	 */
	public String getForza() {
		return forza;
	}


	/**
	 * @param forza the forza to set
	 */
	public void setForza(String forza) {
		this.forza = forza;
	}

	
	
	

}
