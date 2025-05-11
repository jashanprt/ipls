package rsh.Excel;

import java.util.Date;

/*MATCH_ID,SEASON,CITY,DATE,TEAM1,TEAM2,TOSS_WINNER,TOSS_DECISION,RESULT,WINNER*/
public class Match {
	public String MATCH_ID;
	public int SEASON;
	public String CITY;
	public Date DATE;
	public String TEAM1;
	public String TEAM2;
	public String TOSS_WINNER;
	public String TOSS_DECISION;
	public String RESULT;
	public String WINNER;
	
	
	public String toString() {
		return "MATCH_ID = " + MATCH_ID + '\''+" "+
				"SEASON = "+ SEASON +'\''+" "+
				"CITY = " + CITY + '\''+" "+
				"DATE = "+ DATE + '\''+" "+
				"TEAM1 = "+ TEAM1 + '\''+" "+
				"TEAM2 = "+ TEAM2 + '\''+" "+
				"TOSS_WINNER = "+ TOSS_WINNER + '\''+" "+
				"TOSS_DECISION = "+ TOSS_DECISION +'\''+" "+
				"RESULT = "+ RESULT+'\''+" "+
				"WINNER = "+ WINNER + '\'';
				
	}

}
