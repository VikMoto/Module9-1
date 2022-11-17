package ua.goit.CoreHW6;

class Level {

    private int sqeare;
    private int width;
    private int height;


    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        this.sqeare = width * height;
    }


    public int getSqeare() {
        return sqeare;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }






}

class LevelTooBigException extends Exception {
    public LevelTooBigException() {
        super();
    }
}
class LevelLoader {
        public void load(Level level) throws LevelTooBigException {
            int sqear = level.getSqeare();
            if (sqear > 100000) {
                throw new LevelTooBigException();
            }
            System.out.println("Level loaded");
        }

}



class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));

        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(1595, 10731));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}