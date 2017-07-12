package ru.spec.java.ee;

import java.util.Date;
import javax.ejb.Stateless;

@Stateless(mappedName="DateService")
public class DateBean implements DateService {

	@Override
	public Date getCurrentDate(){		
		return new Date();
	}
}
