package ua.goit.CoreHW6;

class AIPlayer {
    private int hp;

    public void setHp(int hp) {
       /* try {
            if (slot < 0 || slot > weaponSlots.length-1)
                throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            //process exception
        }*/



            try {this.hp = hp;
                if (hp < 0 || hp > 100) {
                    throw new IllegalArgumentException();
                }


            }
            catch (IllegalArgumentException e) {
                //process exception
                throw new IllegalArgumentException();
            }


    }
}

class AIPlayerTest {
    public static void main(String[] args) {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}