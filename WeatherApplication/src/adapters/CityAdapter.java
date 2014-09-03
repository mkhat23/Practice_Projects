package adapters;

import java.util.ArrayList;
import java.util.List;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

import com.mandeepk.weatherapplication.CityResult;

public class CityAdapter extends ArrayAdapter<CityResult> {

	private Context ctx;
	private List<CityResult> cityList = new ArrayList<CityResult>();
	
	public CityAdapter(Context ctx, List<CityResult> cityList) {
	    super(ctx, R.layout.cityresult_layout, cityList);
	    this.cityList = cityList;
	    this.ctx = ctx;
	}
	
	@Override
	public CityResult getItem(int position) {
		if (cityList != null)
			return cityList.get(position);
	}
	

}
