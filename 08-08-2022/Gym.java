class Gym{
	
	String name;
	double fees;
	String[] equipments;
	Trainer trainer;
	
	Gym(String name,double fees,String[] equipments,Trainer trainer){
		
		this.name = name;
		this.fees = fees;
		this.equipments = equipments;
		this.trainer = trainer;
	}
	void printData(){
		
		System.out.println(this.name);
		System.out.println(this.fees);
		for(int index = 0; index<this.equipments.length; index++){
			
			System.out.println(this.equipments[index]);
		}
		trainer.printData();
	}

}