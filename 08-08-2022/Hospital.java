class Hospital{
	
	String name;
	Specialization specialization;
	String[] equipments;
	double consultationFees;
	Founder founder;
	
	Hospital(String name,Specialization specialization,String[] equipments,double consultationFees,Founder founder){
		
		this.name = name;
		this.specialization = specialization;
		this.equipments = equipments;
		this.consultationFees = consultationFees;
		this.founder = founder;
	}
	void printData(){
		
		System.out.println(this.name);
		System.out.println(this.specialization);
		for(int index = 0; index < this.equipments.length;index++){
			System.out.println(this.equipments[index]);
		}
		System.out.println(this.consultationFees);
		founder.printData();
	}
}