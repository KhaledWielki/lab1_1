package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class ProductData {
	
	private String productId;

	private BigDecimal productPrice;

	private String productName;

	private Date productSnapshotDate;

	private String productType;
	
	@SuppressWarnings("unused")
	private ProductData(){}
	
	ProductData(String productId, BigDecimal productPrice, String productName, Date productSnapshotDate, String productType) {
 		this.productId = productId;
 		this.productPrice = productPrice;
 		this.productName = productName;
 		this.productSnapshotDate = productSnapshotDate;
 		this.productType = productType;
 	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getProductSnapshotDate() {
		return productSnapshotDate;
	}

	public void setProductSnapshotDate(Date productSnapshotDate) {
		this.productSnapshotDate = productSnapshotDate;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	
	@Override
	 public int hashCode() {
		final int prime = 31;
	 	int result = 1;
	 	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	 	result = prime * result + ((productPrice == null) ? 0 : productPrice.hashCode());
	 	result = prime * result + ((productId == null) ? 0 : productId.hashCode());
	 	result = prime * result + ((productType == null) ? 0 : productType.hashCode());
	 	return result;
	 }
	
}
