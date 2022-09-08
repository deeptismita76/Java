package com.xworkz.javadao;

import com.xworkz.javadao.implementor.LakeDAOImplementor;

public class LakeMukhya {

	public static void main(String[] args) {

		LakeDAOImplementor implementor = new LakeDAOImplementor();
		implementor.save("chilika");
		implementor.save("sardar sarovar");
		implementor.save("nagarjur sagar");
		implementor.save("Lotak");
		implementor.save("wular");
		implementor.save("Vembanad");
		implementor.save("Shivaji Sagar");
		implementor.save("Indira Sagar");
		implementor.save("pangong");
		implementor.save("pulicat");
		implementor.printAllLakes();
		System.out.println();
		implementor.deleteByIndex(5);
		implementor.updateByIndex(3, "BTM Lake");
		implementor.printAllLakes();
		System.out.println();
		implementor.updateByName("wular", "Agara Lake");
		implementor.printAllLakes();
		System.out.println();
		implementor.deleteByName("pulicat");
		implementor.printAllLakes();
	}

}
