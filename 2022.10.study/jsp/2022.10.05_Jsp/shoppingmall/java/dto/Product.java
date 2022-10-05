package dto;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = -5453212425710378655L;
	
	private String productID;
	private String pname;
	private Integer unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInstock;
	private String condition;
	
	public Product() {
		super();
	}
	
	public Product(String productID, String pname, Integer unitPrice) {

		super();
		this.productID = productID;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInstock() {
		return unitsInstock;
	}

	public void setUnitsInstock(long unitsInstock) {
		this.unitsInstock = unitsInstock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}


	
	
	
}
