/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.widya.peminjaman.service.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hp
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Peminjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long peminjamanId;
    private Long nasabahId;
    private Long jumlahPinjaman;
    private Long lamaPinjaman;
    private Long bungaPinjaman;
    private Long angsuranpokok;
    private Long angsuranbln;
    private Long totalutang;
    
    public long getAngsuranpokok(){
        angsuranpokok = jumlahPinjaman / lamaPinjaman;
        return angsuranpokok;
    }
    
    public long getAngsuranbln(){
        angsuranbln = (bungaPinjaman/12)+angsuranpokok;
        return angsuranbln;
    }
    
    public long gettotalutang(){
        totalutang = angsuranpokok+bungaPinjaman;
        return totalutang;
    }
    
}