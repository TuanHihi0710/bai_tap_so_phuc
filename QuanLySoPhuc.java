public class QuanLySoPhuc {
    SoPhuc soPhuc = new SoPhuc();
    public void NhapVaoSoPhuc(double a, double b){
        soPhuc.setPhanThuc(a);
        soPhuc.setPhanAo(b);
    }
    public void HienThiSoPhuc(){
        soPhuc.XuatSoPhuc();
    }
    public SoPhuc TruSoPhuc(SoPhuc sp2){
        double phanThuc = soPhuc.getPhanThuc() - sp2.getPhanThuc();
        double phanAo = soPhuc.getPhanAo() - sp2.getPhanAo();
        return new SoPhuc(phanThuc,phanAo);
    }
    public SoPhuc ChiaSoPhuc(SoPhuc sp2){
        double phanThuc = (soPhuc.getPhanThuc()*sp2.getPhanThuc()+soPhuc.getPhanAo() * sp2.getPhanAo()) / (sp2.getPhanThuc()*sp2.getPhanThuc()+sp2.getPhanAo()*sp2.getPhanAo());
        double phanAo = (sp2.getPhanThuc()* soPhuc.getPhanAo()-soPhuc.getPhanThuc()*sp2.getPhanAo()) / (sp2.getPhanThuc()*sp2.getPhanThuc()+sp2.getPhanAo()*sp2.getPhanAo());
        return new SoPhuc(phanThuc,phanAo);
    }
}
