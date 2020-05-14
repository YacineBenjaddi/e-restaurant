package bean;

public class CryotCurrency {
	private int num;
	private String designation;
	private Double EURO;
	private Double USD;
	
	public CryotCurrency() {
		super();
	}

	
	public CryotCurrency(int n, String d, Double E, Double U) {
		this.num = n;
		this.designation = d;
		this.EURO = E;
		this.USD = U;
	}
	
	public CryotCurrency( String d1, Double e1, Double u1) {
		this.designation = d1;
		this.EURO = e1;
		this.USD = u1;
	}

	public int getNum() {
		return num;
	}

	public String getDesignation() {
		return designation;
	}

	public Double getEURO() {
		return EURO;
	}

	public Double getUSD() {
		return USD;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setEURO(Double eURO) {
		EURO = eURO;
	}

	public void setUSD(Double uSD) {
		USD = uSD;
	}

}
