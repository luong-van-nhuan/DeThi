package bai2;

public class ThoiTrang extends SanPham{
	private int thoiGianBH;

	public ThoiTrang(String maSP, String tenSP, Double dongiaSP, int thoiGianBH) {
		super(maSP, tenSP, dongiaSP);
		this.thoiGianBH = thoiGianBH;
	}

	public ThoiTrang() {
	}

	public ThoiTrang(String maSP, String tenSP, Double dongiaSP) {
		super(maSP, tenSP, dongiaSP);
	}
	public void xuat() {
		super.xuat();
		System.out.println("Thời gian bảo hành: " + thoiGianBH);
	}
	
}
