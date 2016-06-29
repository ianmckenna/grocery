class Ingredient {
	
		
	
	/* This class is the basic building block of the pantry 
	 * program meant to help keep track of and organize your 
	 * pantry so that you can easily prepare meals and check 
	 * ingredient lists against what you have available on hand
	 * 
	 * weight is in lbs
	 * wetweight is in oz
	 * name is the name of the ingredient
	 * 
	 */
	
	int shelfLife;//in days
	double quantity;
	boolean expired;
	String name;
	
	
	public Ingredient(String ingName, double ingQuantity)
	{
		name = ingName;
		quantity = ingQuantity;
	}
	public void setShelfLife(int newShelfLife){
		this.shelfLife = newShelfLife;
	}
	public int getShelfLife(){
		return shelfLife;
	}
	public void setQuantity(double newWeight) {
		this.quantity = newWeight;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public double getQuantity(){
		return quantity;
	}
	public String getName(){
		return name;
	}
	public boolean isGood(){
		return expired;
	}

}

