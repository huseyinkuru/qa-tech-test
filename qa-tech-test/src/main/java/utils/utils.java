package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class utils {
	
	public static int getIndex(WebElement row){
		int indexChallenge=0;
		List<Integer> numbers = new ArrayList<Integer>();
		List<WebElement> columns =  row.findElements(By.tagName("td"));
		
		for (WebElement column : columns) {
			numbers.add(Integer.parseInt(column.getText()));
		}
		for (int i = 1; i < numbers.size(); i++) {
			int totalLeft=0;
			int totalRight=0;
			for (int j = 0; j < i; j++) {
				totalLeft += numbers.get(j);
			}
			for (int j = i+1; j < numbers.size(); j++) {
				totalRight +=numbers.get(j);
			}
			if (totalLeft == totalRight) {
				indexChallenge =i;
				break;
			}
		}
		
		return indexChallenge	;
		
	}

}
