package baithaychua;

import java.util.ArrayList;

public class DonHang {
    public DonHang(Integer ID) {
                 this.ID=ID;
                 this.tongtien=0.0;
                 this.dsSanPham=new ArrayList<>();
    }
    public Integer ID;
    public Double tongtien;
    public ArrayList<SanPham> dsSanPham=new ArrayList<>();
    public void themSP(SanPham sanPhamx,int sale){
        if (sanPhamx.getQty()<=0){
            System.out.println("San pham het hang.");
           return;
        }  else {
            if (sale>0){
                this.tongtien+=(100-sale)/100*sanPhamx.getPrice();
            }
            else {
                this.tongtien=this.tongtien+sanPhamx.getPrice();
            }
            this.tongtien+=sanPhamx.getPrice();
            sanPhamx.setQty(sanPhamx.getQty()-1);
            this.dsSanPham.add(sanPhamx);
            System.out.println("Da them san pham"+sanPhamx.getName()+" vao don hang . ");
        }
    }
    public void indonhang(){
        System.out.println("Tong tien : "+this.tongtien);
    }
}
