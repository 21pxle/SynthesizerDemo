import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrillNote {

    private int pitch1, pitch2, channel, velocity, offset, duration;
    // Constructor for Note. Please, when trying to play a song in another key signature, use the constructor to your advantage.
    public TrillNote(int duration, int offset, int pitch1, int pitch2, int channel, int velocity) {
        this.duration = duration;
        this.offset = offset;
        this.pitch1 = pitch1;
        this.pitch2 = pitch2;
        this.channel = channel;
        this.velocity = velocity;
    }

    public TrillNote(int duration, int offset, int pitch1, int pitch2, int channel) {
        this(duration, offset, pitch1, pitch2, channel, 64);
    }

    public TrillNote(int duration, int offset, int pitch1, int pitch2) {
        this(duration, offset, pitch1, pitch2, 0, 64);
    }

    public List<MidiEvent> getEvents() {
        try {

            List<MidiEvent> list = new ArrayList<>();
            for (int i = 0; i < duration / 2; i += Note.BEAT / 8) {
                list.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, channel, pitch1, velocity), offset + i));
                list.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, channel, pitch1, velocity), offset + 3 + 2 * i));
                list.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, channel, pitch2, velocity), offset + 3 + 2 * i));
                list.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, channel, pitch2, velocity), offset + 6 + 2 * i));
            }
            return list;
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            return null;
        }
    }
}
