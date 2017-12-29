package lab.phb.carrentalapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.phb.carrentalapp.entity.Mobil;
import lab.phb.carrentalapp.repo.MobilRepo;

@RestController
public class ApiController {

    @Autowired
    private MobilRepo mobilRepo;

    @RequestMapping("/daftar-mobil")
    public List<Mobil> getDaftarMobil() {
        return mobilRepo.findAll();
    }

}