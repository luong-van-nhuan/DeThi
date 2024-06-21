package bai2;

import java.util.ArrayList;

public class QuanLyBanHang {
	private ArrayList<KhachHang> khachHangs;

	public QuanLyBanHang(ArrayList<KhachHang> khachHangs) {
		this.khachHangs = khachHangs;
	}

	public QuanLyBanHang() {
		khachHangs = new ArrayList<>();
	}
	public void themKhachHang(KhachHang kh){ 
		if(!khachHangs.contains(kh)){
			khachHangs.add(kh);
		}
	}
	public void themSanPham(String maKH, SanPham sp) {
		for (KhachHang khachHang : khachHangs) {
			if(khachHang.checkMaKH(maKH)) {
				khachHang.themSanPham(sp);
			}
		}
	}
	public SanPham timSanPham(String maSP) {
		SanPham find = null;
		for(KhachHang khachHang: khachHangs) {
			for(SanPham sp : khachHang.getSanPhams()) {
				if(sp.checkMaSP(maSP) == true) {
					find = sp;
					return find;
				}
			}
		}
		return find;
	}
	public void capNhatDonGiaSP(String maSP, double donGiaMoi) {
		donGiaMoi = 100000;
		for(KhachHang khachHang : khachHangs) {
			for(SanPham sp : khachHang.getSanPhams()) {
				if(sp.checkMaSP(maSP) == true) {
					sp.setDongiaSP(donGiaMoi);
					return;
				}
			}
		}
	}
	public void inTatCa() {
		for(KhachHang khachHang: khachHangs) {
			System.out.println(khachHang);
		}
	}
}
