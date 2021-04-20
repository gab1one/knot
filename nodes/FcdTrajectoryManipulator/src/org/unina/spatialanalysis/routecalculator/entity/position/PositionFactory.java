package org.unina.spatialanalysis.routecalculator.entity.position;

/**
 * The PositionFactory classes creates Positions {@see Position} accordingly to the 
 * given setting of coordinate pair types.
 * @author sinog
 *
 */
public class PositionFactory {
	
	public final String pairType;
	
	public Position createPosition(int anId, String aTimestamp, String aLocation) {
		switch(pairType) {
			case "{lat,lon}":
				return new Position(anId, aTimestamp, aLocation, true);
			case "{lon,lat}":
				return new Position(anId, aTimestamp, aLocation, false);
			default:
				return null;
		}
	}
	
	public PositionFactory(String aPairType) {
		this.pairType=aPairType;
	}
}
