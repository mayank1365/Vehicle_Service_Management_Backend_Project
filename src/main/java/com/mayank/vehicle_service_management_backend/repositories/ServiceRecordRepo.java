package com.mayank.vehicle_service_management_backend.repositories;

import com.mayank.vehicle_service_management_backend.models.ServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRecordRepo extends JpaRepository<ServiceRecord, Long>{

    @Override
    ServiceRecord save(ServiceRecord serviceRecord);

    @Override
    void deleteById(Long id);

}
