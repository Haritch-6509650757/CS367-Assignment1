package dev.haritch.carrental;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface StorageRepository extends JpaRepository<Storage, Long>  {
    List<Storage> findByCarType(String carType);
    List<Storage> findByCarBrand(String CarBrand);
    Optional<Storage> findByLicensePlate(String licensePlate);
}
