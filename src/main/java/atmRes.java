public class atmRes {
    public int amount = 0;

    public void fill(int i){
        this.amount += i;
    }

    public boolean withdraw(){
        if(this.amount <= 0){
            return false;
        }
        this.amount--;
        return true;
}
}

