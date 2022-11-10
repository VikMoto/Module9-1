package CoreHW5;

import java.util.Objects;

class StarTrack {
    private Point start = new Point();
    private Point finish = new Point();

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StarTrack)) return false;
        StarTrack starTrack = (StarTrack) o;
        return start.equals(starTrack.start) && finish.equals(starTrack.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}
