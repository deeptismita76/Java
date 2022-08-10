enum Gender{
	
	MALE('M'),FEMALE('F'),OTHER('O');
	
	char actualValue;
	
	Gender(char actualValue){
		
		this.actualValue=actualValue;
	}
}