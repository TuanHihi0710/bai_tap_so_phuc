public class SoPhuc {
    private double phanThuc;
    private double phanAo;
    public SoPhuc(){}
    public SoPhuc(double a, double b){
        phanThuc=a;
        phanAo=b;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }
    public void setPhanThuc(double a){
        phanThuc=a;
    }
    public void setPhanAo(double b){
        phanAo=b;
    }
    public void XuatSoPhuc(){
        System.out.println("Phan thuc: "+getPhanThuc());
        System.out.println("Phan ao: "+getPhanAo());
    }
}
