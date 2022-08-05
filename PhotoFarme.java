class PhotoFarme{
	
	int size;
	Material material;
	double price;
	int warranty;
	Color[] colors;
	String shape;
	
	PhotoFarme(int size,double price, int warranty,String shape){
		
		this.size = size;
		this.price = price;
		this.warranty = warranty;
		this.shape = shape;
		
	}
	void setMaterial(Material material){
		
		this.material = material;
	}
	void setColor(Color[] colors){
		
		this.colors = colors;
	}
	void printData(){
		
		System.out.println(this.size);
		System.out.println(this.material);
		System.out.println(this.price);
		System.out.println(this.warranty);
		for(int index = 0; index < this.colors.length; index++){
			
			System.out.println(this.colors[index]);
		}
		System.out.println(this.shape);
		
	}
}