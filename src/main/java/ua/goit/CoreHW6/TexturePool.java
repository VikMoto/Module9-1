package ua.goit.CoreHW6;

public class TexturePool {
    private TexturePool() {
    }

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }

    private static TexturePool instance = new TexturePool();
    public static TexturePool getInstance() {
        return instance;
    }
}
/*
class LevelLoader {
    private LevelLoader(){

    }
    private static LevelLoader instance = new LevelLoader();


    public static LevelLoader getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}*/

class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}