class PhotoFarmeMukhya{
	
	public static void main(String[] args){
		
		PhotoFarme photoFarme =  new PhotoFarme(420,1200,8,"Square");
		photoFarme.setMaterial(Material.PLYWOOD);
		Color[] colors = {Color.BLACK,Color.GREEN,Color.SILVER};
		photoFarme.setColor(colors);
		photoFarme.printData();
		
	}
}