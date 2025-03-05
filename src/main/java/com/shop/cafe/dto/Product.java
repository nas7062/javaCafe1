package com.shop.cafe.dto;

public class Product {
	private int procode,price;
	private String prodname,pimg;
	
	public Product(int procode ,String prodname, int price, String pimg) {
		super();
		this.procode = procode;
		this.price = price;
		this.prodname = prodname;
		this.pimg = pimg;
	}
	@Override
	public String toString() {
		return "Product [procode=" + procode + ", price=" + price + ", prodname=" + prodname + ", pimg=" + pimg + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProcode() {
		return procode;
	}
	public void setProcode(int procode) {
		this.procode = procode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	
}
