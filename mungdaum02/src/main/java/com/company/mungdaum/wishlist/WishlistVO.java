package com.company.mungdaum.wishlist;

public class WishlistVO {
	private int WId; //���ȣ

	//getter, setter
	
	public int getWId() {
		return WId;
	}

	public void setWId(int wId) {
		WId = wId;
	}
	
	@Override
	public String toString() {
		return "WishlistVO [WId=" + WId + "]";
	}
}

