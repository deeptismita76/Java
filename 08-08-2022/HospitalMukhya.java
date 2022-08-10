class HospitalMukhya{
	
	public static void main(String[] args){
		
		String[] equip = {"First Aid Kit","Plaster","Cotton Wool","Surgical Mask","Stethoscope","Oxigen Mask","..."};
		Founder founder = new Founder("Amrit Kaur","UP",Profession.MEMBEROFRAJYASABHA,1956,false,150000);
		Hospital hospital = new Hospital("AIIMS",Specialization.NEUROLOGY,equip,1500,founder);
		hospital.printData();
	}
}