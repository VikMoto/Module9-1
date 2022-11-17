package ua.goit.CoreHW5;

public class SpaceRocketLauncher {
    private int smallRocketCount;
    private int bigRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 ) {return;}
        if (bigRocketCount > 100) {return;}
        this.bigRocketCount = bigRocketCount;
    }



    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 ) {return;}
        if (smallRocketCount > 100) {return;}
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            bigRocketCount--;
            System.out.println("Launch big rocket");
        }
    }
    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
            smallRocketCount--;
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower() {
        return (bigRocketCount*100 + smallRocketCount*50);
    }

}
