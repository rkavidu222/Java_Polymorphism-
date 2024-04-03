class CentralBank {
   double  getRevenue(){
       return 10.76;
   }
}
class DFCC extends CentralBank{
    @Override
    double getRevenue() {
        return 2.756;
    }
}
class BOC extends CentralBank{
    @Override
    double getRevenue() {
        return 4.76;
    }
}
class  CDB extends CentralBank{
    @Override
    double getRevenue() {
        return 1.876;
    }
}
class Test{
    public static void main(String[] args) {
        CentralBank cb;
        cb=new DFCC();
        System.out.println("Revenue:-"+cb.getRevenue());
        cb=new BOC();
        System.out.println("Revenue:-"+cb.getRevenue());
        cb=new CDB();
        System.out.println("Revenue:-"+cb.getRevenue());
    }
}