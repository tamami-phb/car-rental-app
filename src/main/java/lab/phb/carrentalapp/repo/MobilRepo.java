package lab.phb.carrentalapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab.phb.carrentalapp.entity.Mobil;

@Repository
public interface MobilRepo 
    extends JpaRepository<Mobil, Integer> {
    
}