package sda.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.travelagency.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {

}
