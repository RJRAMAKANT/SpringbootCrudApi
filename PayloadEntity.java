package com.liveasy.shipentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PAYLOAD")
public class PayloadEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int loadid;
	@Column(name = "shipperId", length = 100)
	private String shipperId;
	@Column(name = "loadpoint", length = 100)
	private String loadingPoint;
	@Column(name = "unloadpoint", length = 100)
	private String unloadingPoint;
	@Column(name = "producttype", length = 100)
	private String productType;
	@Column(name = "trucktype", length = 100)
	private String truckType;
	@Column(name = "trucks")
	private int noOfTrucks;
	@Column(name = "weight")
	private int weight;
	@Column(name = "commment", length = 100)
     private String comment;
	@Column(name = "loaddate", length = 100)
	private String date;
	
	
	public int getLoadid() {
		return loadid;
	}
	public void setLoadid(int loadid) {
		this.loadid = loadid;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
