package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer implements OfferInterface{
	private List<Product> availabeItems = new ArrayList<Product>();
	private List<Product> unavailableItems = new ArrayList<Product>();
	
	
	public Offer(List<Product> availabeItems, List<Product> unavailableItems) {
		this.availabeItems = availabeItems;
		this.unavailableItems = unavailableItems;
	}

	public List<Product> getAvailabeItems() {
		return availabeItems;
	}
	
	public List<Product> getUnavailableItems() {
		return unavailableItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((availabeItems == null) ? 0 : availabeItems.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Offer other = (Offer) obj;
		if (availabeItems == null) {
			if (other.availabeItems != null)
				return false;
		} else if (!availabeItems.equals(other.availabeItems))
			return false;
		return true;
	}

	/**
	 * 
	 * @param seenOffer
	 * @param delta acceptable difference in percent
	 * @return
	 */
	public boolean sameAs(Offer seenOffer, double delta) {
		if (! (availabeItems.size() == seenOffer.availabeItems.size()))
			return false;
		
		for (Product item : availabeItems) {
			Product sameItem = seenOffer.findItem(item.getProductId());
			if (sameItem == null)
				return false;
			if (!sameItem.sameAs(item, delta))
				return false;
		}
		
		return true;
	}

	private Product findItem(String productId) {
		for (Product item : availabeItems){
			if (item.getProductId().equals(productId))
				return item;
		}
		return null;
	}
	

}
