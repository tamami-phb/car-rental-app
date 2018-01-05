package lab.phb.carrentalapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lab.phb.carrentalapp.entity.Mobil;
import lab.phb.carrentalapp.repo.MobilRepo;

@RestController
public class ApiController {

    @Autowired
    private MobilRepo mobilRepo;

    @RequestMapping("/daftar-mobil")
    public List<Mobil> getDaftarMobil() {
        List<Mobil> data = mobilRepo.findAll();
        for(int i=0; i<data.size(); i++) {
            System.out.println(((Mobil) data.get(i)).getNopol());
        }
        return mobilRepo.findAll();
    }

    @RequestMapping(value = "/api/tambah", method = RequestMethod.POST) 
    public void tambahData(@RequestBody Mobil mobil) {
        //System.out.println("id : " + mobil.getId());
        //System.out.println("nopol :  "+ mobil.getNopol());
        //System.out.println("merk-tipe : " + mobil.getMerkTipe());
        mobilRepo.save(mobil);
    }

    @RequestMapping(value = "/api/hapus/{id}", method = RequestMethod.DELETE)
    public void hapusData(@PathVariable("id") int id) {
        mobilRepo.delete(id);
    }

}