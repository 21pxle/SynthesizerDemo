import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import java.util.Arrays;
import java.util.List;

public class Note {
    private int duration, pitch, offset, channel, velocity;

    public static final int WHOLE_NOTE = 96;
    public static final int HALF_NOTE = 48;
    public static final int QUARTER_NOTE = 24;
    public static final int EIGHTH_NOTE = 12;
    public static final int SIXTEENTH_NOTE = 6;
    public static final int THIRTYSECOND_NOTE = 3;

    public static final int QUARTER_NOTE_TRIPLET = 16;
    public static final int EIGHTH_NOTE_TRIPLET = 8;
    public static final int SIXTEENTH_NOTE_TRIPLET = 4;
    public static final int THIRTYSECOND_NOTE_TRIPLET = 2;

    public static final int DOTTED_HALF_NOTE = 72;
    public static final int DOTTED_QUARTER_NOTE = 36;
    public static final int DOTTED_EIGHTH_NOTE = 18;
    public static final int DOTTED_SIXTEENTH_NOTE = 9;


    public static int MEASURE = 0;
    public static int BEAT = 0;

    //Ticks per Quarter Note: 24 (for 8th, 16th, and 32nd triplets)

    /**
     * Constructor for Note. Please, when trying to play a song in another key signature, use the constructor to your advantage.
     * @param duration The duration of the note in ticks.
     * @param offset The offset, in ticks.
     * @param pitch The MIDI pitch of the note (Middle C = 60, range 0-127)
     * @param channel The channel
     * @param velocity Velocity of the key pressed (0-127).
     */
    public Note(int duration, int offset, int pitch, int channel, int velocity) {
        this.duration = duration;
        this.offset = offset;
        this.pitch = pitch;
        this.channel = channel;
        this.velocity = velocity;
    }

    /**
     * Constructor for Note.
     * @param duration The duration of the note in ticks.
     * @param offset The offset, in ticks.
     * @param pitch The MIDI pitch of the note (Middle C = 60, range 0-127)
     * @param channel The channel
     */
    public Note(int duration, int offset, int pitch, int channel) {
        this(duration, offset, pitch, channel, 64);
    }

    /**
     * Constructor for Note.
     * @param duration The duration of the note in ticks.
     * @param offset The offset, in ticks.
     * @param pitch The MIDI pitch of the note (Middle C = 60, range 0-127)
     */
    public Note(int duration, int offset, int pitch) {
        this(duration, offset, pitch, 0, 64);
    }

    public List<MidiEvent> getEvents() {
        try {
            return Arrays.asList(
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, channel, pitch, velocity), offset),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, channel, pitch, velocity), offset + duration)
            );
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            return null;
        }
    }
}
