public class coffeeRes {

    public int Milk = 0;
    public int Beans = 0;
    public int Water = 0;
    public int Choco = 0;

    public void reLABAN(int i){
        this.Milk += i;
    }

    public void reCOFFEE(int i){
        this.Beans += i;
    }

    public void reWAter(int i){
        this.Water += i;
    }

    public void reNesquik(int i){
        this.Choco += i;
    }

    public boolean useLABAN(){
        if(this.Milk <= 0){
            return false;
        }
        this.Milk--;
        return true;
    }

    public boolean useCOFFEE(){
        if(this.Beans <= 0){
            return false;
        }
        this.Beans--;
        return true;
    }

    public boolean useWater(){
        if(this.Water <= 0){
            return false;
        }
        this.Water--;
        return true;
    }

    public boolean useNESQUIK(){
        if(this.Choco <= 0){
            return false;
        }
        this.Choco--;
        return true;
    }
}
