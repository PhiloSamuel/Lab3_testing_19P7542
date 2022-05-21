public class atm extends atmRes {
    public String state = "logout";

    public Boolean input(char c){
        if(this.state.equals("logout")){
            if(c == 'l'){
                this.state = "login";
                return true;
            }else if(c == 'u'){
                this.state = "unclock";
                return true;
            }
        }else if(this.state.equals("logout")){
            if(c == 'w'){
                return this.withdraw();
            }else if(c == 'd') {
                this.fill(1);
                return true;
            }else if(c == 'o') {
                this.state = "logout";
                return true;
            }
        }else if(this.state.equals("unlock")){
            if(c == 'f'){
                this.fill(1);
                return true;
            }else if(c == 'l') {
                this.state = "logout";
                return true;
            }
        }
        return false;
    }
}
