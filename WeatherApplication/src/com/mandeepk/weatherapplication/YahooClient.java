package com.mandeepk.weatherapplication;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import android.util.Log;

public class YahooClient {
	
	yahooHttpConn= (HttpURLConnection) (new URL(query)).openConnection();
	yahooHttpConn.connect();
	XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
	parser.setInput(new InputStreamReader(yahooHttpConn.getInputStream()));
	
	int event = parser.getEventType();
	
	CityResult cty = null;
	String tagName = null;
	String currentTag = null;
	
	//We start parsing the XML
	while (event != XmlPullParser.END_DOCUMENT){
		tagName = parser.getName();
		
		if (event == XmlPullParser.START_TAG){
			if (tagName.equals("place")){
				//Place tag found so we create a new CityResult
				cty = new CityResult();
				Log.d("Swa", "New City found");
			}
			currentTag = tagName;
			Log.d("Swa", "Tag ["+tagName+"]");
		}
		else if (event == XmlPullParser.TEXT){
			//We found some text. Leys see the tagName to know the tag related to this text
			if("woeid".equals(currentTag))
				cty.setWoeid(parser.getText());
			else if ("name".equals(currentTag))
				cty.setCityName(parser.getText());
			else if ("country".equals(currentTag))
				cty.setCountry(parser.getText());
			
			//We do not want to analyze other tag at the moment
		}
		else if (event == XmlPullParser.END_TAG){
			if ("place".equals(tagName))
				result.add(cty);
		}
		
		event = parser.next();
	}
	
	
	
	
	
	
//	public static void getWeather(String woeid, String unit, RequestQueue rq, final WeatherClientListener listener ){
//		Log.d("SwA", "Weather URL ["+url2call+"]");
//		final Weather result = new Weather();
//		StringRequest req = new StringRequest
//	}
}

}
