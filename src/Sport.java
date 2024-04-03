class Sport {
    void playerCount(){
    }
}
class Cricket extends Sport{
    @Override
    void playerCount() {
        System.out.println("11");
    }
}
class FootBall extends Sport{
    FootBall(String x) {
        System.out.println("Team :- "+x);
    }
}
class OneBounce extends Cricket{
    @Override
    void playerCount() {
        super.playerCount();
        System.out.println("Java class OneBoubce team");
    }
}
class Rugby extends Sport{
    Rugby(String x){
        System.out.println("Team :- "+x);
        System.out.println("11");
    }
}
class Test4{
    public static void main(String[] args) {
        Sport s;
        s=new Cricket();
        s.playerCount();
        s=new FootBall("Alnsser");
        s.playerCount();
        s=new Rugby("New Zeland");
        Cricket c= new OneBounce();
        c.playerCount();
    }
}