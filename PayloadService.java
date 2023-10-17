package com.liveasy.shipservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.payload.Payload;
import com.liveasy.shipentity.PayloadEntity;
import com.liveasy.shiprepository.PayloadRepository;

@Service
public class PayloadService {

	@Autowired
	PayloadRepository payloadripo;
	public String insertData(Payload payload) {
	 
		PayloadEntity payloadentity=new PayloadEntity();
		payloadentity.setLoadingPoint(payload.getLoadingPoint());
		payloadentity.setUnloadingPoint(payload.getUnloadingPoint());
		payloadentity.setProductType(payload.getProductType());
		payloadentity.setTruckType(payload.getTruckType());
		payloadentity.setNoOfTrucks(payload.getNoOfTrucks());
		payloadentity.setWeight(payload.getWeight());
		payloadentity.setComment(payload.getComment());
		payloadentity.setShipperId(payload.getShipperId());
		payloadentity.setDate(payload.getDate());
		payloadripo.save(payloadentity);
		
		
		return "loads Details Added Successfully";
	}
	public List<PayloadEntity> getitembyshipperid(String shipperId) {
	   
		List<PayloadEntity> payloadlist=payloadripo.findByShipperId(shipperId);
	  return payloadlist;
	}
	public Iterable<PayloadEntity> getdata() {
		 Iterable<PayloadEntity> p=   payloadripo.findAll();
		return p ;
	}
	public PayloadEntity getpayloadid(int loadid) {
		
		PayloadEntity pay= payloadripo.findById(loadid).get();
		return pay;
		
	}
	public String deletedatafromload(int loadid) {
		
		payloadripo.deleteById(loadid);
		
		return "Load Deleted Successfully";
	}
	public String updatePayload(int loadid, PayloadEntity updatepayload) {
		PayloadEntity updateentity=payloadripo.findById(loadid).get();
		updateentity.setLoadingPoint(updatepayload.getLoadingPoint());
		updateentity.setUnloadingPoint(updatepayload.getUnloadingPoint());
		updateentity.setProductType(updatepayload.getProductType());
		updateentity.setTruckType(updatepayload.getTruckType());
		updateentity.setNoOfTrucks(updatepayload.getNoOfTrucks());
		updateentity.setShipperId(updatepayload.getShipperId());
		updateentity.setWeight(updatepayload.getWeight());
		updateentity.setDate(updatepayload.getDate());
		updateentity.setComment(updatepayload.getComment());
		payloadripo.save(updateentity);
		return "UPDATED SUCCESSFULLY";
	}

}
