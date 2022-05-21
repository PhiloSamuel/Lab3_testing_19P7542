public class chime {

    public boolean set = false;

    public boolean SETA(){
        if(this.set){
            return false;
        }
        this.set = true;
        return true;
    }

    public boolean UNSETA(){
        if(!this.set){
            return false;
        }
        this.set = false;
        return true;
    }

    public boolean CHECKA(){
        boolean tem = this.set;
        this.set = false;
        return tem;
    }

}
