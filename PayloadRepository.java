package com.liveasy.shiprepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.liveasy.payload.Payload;
import com.liveasy.shipentity.PayloadEntity;
@Repository
@Component
public interface PayloadRepository  extends JpaRepository<PayloadEntity,Integer>{

	List<PayloadEntity> findByShipperId(String shipperId);

	

}
