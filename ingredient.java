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
	
	int ingShelfLife;//in days
	double ingQuantity;
	
	String ingName;
	
	

	
	public void setAmount(double newWeight) {
		this.ingQuantity = newWeight;
	}
	public void setName(String newName) {
		this.ingName = newName;
	}

}
