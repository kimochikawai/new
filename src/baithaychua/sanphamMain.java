package baithaychua;

public class sanphamMain {
    public static void main(String[] args) {
        SanPham sanPham1=new SanPham(1,"San Pham 1",1000.0,5);
        SanPham sanPham2=new SanPham(2,"San Pham 2",2000.0,2);
        SanPham sanPham3=new SanPham(3,"San Pham 3",5000.0,0);
        DonHang donHang1=new DonHang(1);
        donHang1.themSP(sanPham1,0);
        donHang1.themSP(sanPham2,20);
        donHang1.themSP(sanPham3,80);
        ThoiTrang thoitrang1=new ThoiTrang(021121,"Ao Gucci",500000.0,10,"GUCCI");

    }
}
