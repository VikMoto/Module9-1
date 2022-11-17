package ua.goit.CoreHW6;

import java.util.Objects;

class QuarkeTrack {
    private int[] lines;
    private int sum;
    public QuarkeTrack(int[] lines) {
        this.lines = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            this.sum += lines[i];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuarkeTrack)) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return sum == that.sum; //&& Arrays.equals(lines, that.lines);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(sum);
        result = 31 * result;
        return result;
    }
}
class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}