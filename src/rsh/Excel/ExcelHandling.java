package rsh.Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcelHandling {

	public List<Match> createListFromExcelData() {

		List<String> excelDataList = new ArrayList<>();
		Match matchData = new Match();
		List<Match> headersList = new ArrayList<>();

		try {
			File matchFileObject = new File("matches.csv");
			Scanner matchScannerObject = new Scanner(matchFileObject);

			int sc = 1;
			while (matchScannerObject.hasNextLine()) {
				String singleLine = matchScannerObject.nextLine();
				if (sc == 1) {
					sc += 1;
					continue;

				}
//				System.out.println(singleLine);
				excelDataList.add(singleLine);
			}

//1,2017,Hyderabad,2017-04-05,Sunrisers Hyderabad,Royal Challengers Bangalore,Royal Challengers Bangalore,field,normal,Sunrisers Hyderabad 
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			for (String singleLineData : excelDataList) {
				String[] spliteddata = singleLineData.split(",");

				Match h = new Match();
				h.MATCH_ID = spliteddata[0];
				h.SEASON = Integer.parseInt(spliteddata[1]);
				h.CITY = spliteddata[2];
				try {
					h.DATE = formatter.parse(spliteddata[3]);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.TEAM1 = spliteddata[4];
				h.TEAM2 = spliteddata[5];
				h.TOSS_WINNER = spliteddata[6];
				h.TOSS_DECISION = spliteddata[7];
				h.RESULT = spliteddata[8];
				if (spliteddata.length == 10) {
					h.WINNER = spliteddata[9];
				}
				headersList.add(h);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return headersList;

	}

}
