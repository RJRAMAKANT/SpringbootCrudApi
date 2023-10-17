package com.liveasy.shipcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.payload.Payload;
import com.liveasy.shipentity.PayloadEntity;
import com.liveasy.shipservice.PayloadService;

@RestController
public class PayloadController {
	
	@Autowired
	PayloadService payloadservice;
	@PostMapping("/load")
	public String postitem(@RequestBody Payload payload)
	{
		return payloadservice.insertData(payload);
	}
	@GetMapping("/load/shipdata/{shipperId}")

	public List<PayloadEntity> getPayloadByShipperId(@PathVariable String shipperId)
	{
		return payloadservice.getitembyshipperid(shipperId);
	}
	@GetMapping("load/alldata")
	public Iterable<PayloadEntity> getproduct()
	{
		return payloadservice.getdata();
	}
	@GetMapping("/load/data/{loadid}")
	public PayloadEntity getpayloadbyid(@PathVariable int loadid)
	{
		return payloadservice.getpayloadid(loadid);
	}
	@DeleteMapping("/load/deletedata/{loadid}")
	public String deleteData(@PathVariable int loadid)
	{
		return payloadservice.deletedatafromload(loadid);
	}
	
	@PutMapping("/load/updatedata/{loadid}")
	public String updateLoad( @PathVariable int loadid,@RequestBody PayloadEntity updatepayload )
	{
		return payloadservice.updatePayload(loadid,updatepayload);
	}

}
