public class Movie {
	
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private String title;
    private Price _priceCode;
    
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    
    public int getPriceCode() {
        return _priceCode.getPriceCode();
    }
    
    public void setPriceCode(int arg) {
        switch(arg) {
        case REGULAR:
        	_priceCode = new RegularPrice();
        	break;
        case CHILDRENS:
        	_priceCode = new ChildrensPrice();
        	break;
        case NEW_RELEASE:
        	_priceCode = new NewReleasePrice();
        	break;
        default:
        	throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    
    double getCharge(int daysRented) {
    	return _priceCode.getCharge(daysRented);
    }
    
    public String getTitle (){
        return title;
    };
    
	int getFrequentRenterPoints(int daysRented) {
		return _priceCode.getFrequentRenterPoints(daysRented);
	}
}