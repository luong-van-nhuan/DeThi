package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private ArrayList<SanPham> sanPhams;

	public KhachHang(String maKH, String tenKH, ArrayList<SanPham> sanPhams) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.sanPhams = sanPhams;
	}

	public KhachHang() {
		sanPhams = new ArrayList<>();
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public ArrayList<SanPham> getSanPhams() {
		return sanPhams;
	}

	public void setSanPhams(ArrayList<SanPham> sanPhams) {
		this.sanPhams = sanPhams;
	}

	public void xuat() {
		System.out.println("Tên khách hàng: " + tenKH);
		System.out.println("Mã khách hàng: " + maKH);
		System.out.println("Danh sách sản phẩm");
		for (SanPham sp : sanPhams) {
			sp.xuat();
		}
	}

	public boolean checkMaKH(String maKH) {
		return this.maKH.equalsIgnoreCase(getMaKH());
	}

	public void themSanPham(SanPham sp) {
		this.sanPhams.add(sp);
	}
}
