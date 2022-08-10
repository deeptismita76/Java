class GymMukhya{
	
	public static void main(String[] args){
		
		String[] equip = {"Traidmill","Spin Bike","Stepper","DembBells","Plates","Bars"};
		Trainer trainer = new Trainer("Soumya Ranjan",9861226677L,2,Gender.MALE,27);
		Gym gym = new Gym("Fitness",1000,equip,trainer);
		trainer.printData();
	}
}