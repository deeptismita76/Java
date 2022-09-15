package com.xworkz.customexceptiontask.main;


import com.xworkz.customexceptiontask.dao.PrimeMinisterDAO;
import com.xworkz.customexceptiontask.dao.impl.PrimeMinisterDAOImpl;
import com.xworkz.customexceptiontask.exception.LimitExceedException;
import com.xworkz.customexceptiontask.exception.NoSuchNameException;
import com.xworkz.customexceptiontask.service.PrimeMiniSterService;
import com.xworkz.customexceptiontask.service.impl.PrimeMiniSterServiceImpl;

public class PrimiMinisterMukhya {

	public static void main(String[] args) {

		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();
		
		PrimeMiniSterService service = new PrimeMiniSterServiceImpl(dao);
		try {
		service.verifyAndStore("A.P.J Abdul Kalam");
		service.verifyAndStore("Jawaharlal Nehru");
		service.verifyAndStore("Lal Bahdur Shastri");
		service.verifyAndStore("Atal Bihari Vajpayee");
		service.verifyAndStore("Narendra Modi");
		service.verifyAndStore("Naren");
		}
		catch(NoSuchNameException nsn) {
			System.out.println("NoSuchName handled");
		}
		catch(LimitExceedException lee) {	
		//	System.out.println("LimitExceedException handled");
			System.err.println(lee.getMessage());
		}

	}

}
