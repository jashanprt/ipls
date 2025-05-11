package rsh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import rsh.Excel.ExcelHandling;
import rsh.Excel.Match;

public class UserIo {
	public static void main(String[] args) {

		ExcelHandling exelList = new ExcelHandling();
		List<Match> mList = exelList.createListFromExcelData();
		System.out.println("Total matches : " + mList.size());
		Set<String> teams = new HashSet<>();
		// ------------------------------------------------------------------

		for (Match teamList : mList) {
			teams.add(teamList.TEAM1);
			teams.add(teamList.TEAM2);
		}

		// ------------------------------------------------------------------
		// print teams

		System.out.println("Your teams: ");
		int count = 1;
		for (String i : teams) {
			System.out.println(count + ". " + i);
			count++;
		}
		// -----------------------------------------------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("Select your Team = ");
		String input = sc.nextLine();

		/*
		 * int tossWin = 0; int win = 0;
		 * 
		 * for(Match match : mList) { if(input.equals(match.TOSS_WINNER)) { tossWin++; }
		 * if(input.equals(match.WINNER)) { win++; } }
		 * 
		 * System.out.println("Toatal Tosses win by "+input+" = "+tossWin);
		 * System.out.println("Toatal Matches win by "+input+" = "+win);
		 */

		HashMap<String, Integer> matchCount = new HashMap<>();
		HashMap<String, Integer> winCount = new HashMap<>();
		int played = 0;
		int win = 0;

		for (Match match : mList) {
			if (input.equals(match.TEAM1) || input.equals(match.TEAM2)) {
				played++;

				String city = match.CITY;

				matchCount.put(city, played);

			}

			if (input.equals(match.WINNER)) {
				win++;

				String city = match.CITY;

				winCount.put(city, win);
			}
		}
		

		System.out.println(input + " Matches Played in " + matchCount);
		System.out.println(input + " Matches win in " + winCount);

	}

}
