package bai2;

import javax.xml.crypto.Data;

public class Main {
	public static void main(String[] args) {
		KhachHang khachHang_1 = new KhachHang("KH001", "TenKhachHang");
		KhachHang khachHang_2 = new KhachHang("KH001", "TenKhachHang");
		
		SanPham sanPham_1 = new SanPham("Tên sản phẩm", "Mã sản phẩm", 43.4);
		SanPham sanPham_2 = new SanPham("Tên sản phẩm", "Mã sản phẩm", 12.32);
		SanPham sanPham_3 = new SanPham("Tên sản phẩm", "Mã sản phẩm", 6.43);
		
		ThoiTrang thoiTrang_1 = new ThoiTrang("Tên sản phẩm", "Mã sản phẩm", 100000.0, 30);
		ThoiTrang thoiTrang_2 = new ThoiTrang("Tên sản phẩm", "Mã sản phẩm", 150000.0, 30);
		ThoiTrang thoiTrang_3 = new ThoiTrang("Tên sản phẩm", "Mã sản phẩm", 200000.0, 30);
		
		ThucPham thucPham_1 = new ThucPham("Tên sản phẩm", "Mã sản phẩm", 100000.0, new Data(2, 6, 2024), new Data(7, 6, 2024));
		
	}
	
}
