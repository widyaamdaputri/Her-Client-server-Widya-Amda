/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.widya.Buku.service.Service;

import com.widya.Buku.service.Entity.Buku;
import com.widya.Buku.service.Repository.BukuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service

public class BukuService {
       @Autowired
    private BukuRepository bukuRepository;
    
    public Buku saveBuku(Buku buku) {
        return bukuRepository.save(buku);
    }
    
    public Buku findBukuById(Long bukuId){
        return (Buku) bukuRepository.findByBukuId(bukuId);
    }
    
    public List<Buku> getAllBuku(){
        return bukuRepository.findAll();
    }
    
    public void deleteBuku(Long bukuId) {
        bukuRepository.deleteById(bukuId);
    }
    
    public Buku updateBuku(Buku buku){
        return bukuRepository.save(buku);
    }
}
