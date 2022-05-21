public class coffee extends coffeeRes {
    public String state = "VENDING";

    public Boolean input(char c){
        if(this.state.equals("VENDING")){
            if(c == 'c'){ //coffee
                return (this.useWater() && this.useCOFFEE());
            }else if(c == 'l'){ //latte
                return (this.useWater() && this.useCOFFEE() && this.useLABAN());
            }else if(c == 'm'){ //mocha
                return (this.useLABAN() && this.useCOFFEE() && this.useNESQUIK());
            }
            else if(c == 'r'){
                this.state = "REFILL";
                return true;
            }
        }else if(this.state.equals("REFILL")){
            if(c == 'b'){ //beans
                this.reCOFFEE(1);
                return true;
            }else if(c == 'w'){ //water
                this.reWAter(1);
                return true;
            }else if(c == 'm'){ //milk
                this.reLABAN(1);
                return true;
            }else if(c == 'c'){ //choco
                this.reNesquik(1);
                return true;
            }
            else if(c == 'v'){
                this.state = "VENDING";
                return true;
            }
        }
        return false;
    }

}
