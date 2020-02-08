import javax.sound.midi.*;
import java.util.Arrays;
import java.util.List;

public class SynthDemo {
    private static final int MEASURE = 128;

    public static void main(String[] args) throws InvalidMidiDataException, MidiUnavailableException {
        //The initial 4-measure delay helps the synthesizer to be better calibrated
        Sequencer sequencer = MidiSystem.getSequencer();
        for (Instrument instrument : MidiSystem.getSynthesizer().getAvailableInstruments())
            System.out.println(instrument);
        if (sequencer != null) {
            sequencer.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 16);
            sequencer.setTempoInBPM(240);
            List<MidiEvent> events = Arrays.asList(
                    new MidiEvent(new ShortMessage(ShortMessage.PROGRAM_CHANGE, 3, 0, 0), 0),
                    //Melody
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 0),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 64),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 64),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 96),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 96),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 128),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 128),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 176),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 176),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 184),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 184),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 192),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 192),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 256),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 81, 93), 256),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 81, 93), 320),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 320),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 352),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 84, 93), 352),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 84, 93), 384),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 384),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 416),

                    //Doing 8 trills - BEGIN TRILL
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 416),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 420),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 420),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 424),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 424),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 428),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 428),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 432),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 432),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 436),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 436),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 440),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 440),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 444),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 444),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 448),

                    //END Eight-Note Trill

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 448),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 480),

                    // One-Octave Scales - BEGIN

                    // Begin 1st
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 512),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 528),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 528),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 536),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 536),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 544),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 544),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 552),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 552),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 560),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 560),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 568),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 568),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 576),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 81, 93), 576),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 81, 93), 584),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 584),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 592),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 592),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 600),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 600),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 608),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 608),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 616),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 616),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 624),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 624),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 632),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 632),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 640),
                    // End 1st

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 640),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 656),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 656),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 664),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 664),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 672),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 672),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 680),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 680),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 688),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 688),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 696),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 696),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 704),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 704),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 712),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 712),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 720),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 720),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 728),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 728),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 736),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 736),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 744),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 744),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 752),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 752),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 760),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 760),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 768),

                    //End 2nd Scale

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 768),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 65, 93), 784),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 784),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 792),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 792),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 800),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 800),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 808),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 808),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 816),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 816),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 824),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 824),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 832),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 832),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 840),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 840),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 848),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 848),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 856),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 856),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 864),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 864),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 872),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 872),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 880),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 880),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 888),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 888),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 65, 93), 896),
                    //End 3rd Scale

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 896),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 912),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 912),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 65, 93), 920),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 920),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 928),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 928),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 936),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 936),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 944),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 944),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 952),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 952),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 960),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 960),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 968),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 968),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 976),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 976),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 984),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 984),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 992),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 992),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 1000),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 1000),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 1008),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 1008),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 65, 93), 1016),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 1016),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 1024),

                    // End 4th Scale

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 62, 93), 1024),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 62, 93), 1040),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 1040),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 1048),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 1048),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 65, 93), 1056),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 1056),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 1064),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 1064),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 1072),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 1072),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 1080),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 73, 93), 1080),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 73, 93), 1088),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 1088),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 1096),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 1096),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 1104),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 1104),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 1112),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 73, 93), 1112),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 73, 93), 1120),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 1120),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 1128),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 1128),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 1136),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 1136),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 1144),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 1144),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 1152),
                    //End 5th Scale

                    //One-Octave Scales - END

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 81, 93), 1152),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 81, 93), 1160),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 83, 93), 1160),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 83, 93), 1168),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 84, 93), 1168),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 84, 93), 1176),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 83, 93), 1176),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 83, 93), 1184),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 81, 93), 1184),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 81, 93), 1192),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 1192),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 1200),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 1200),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 1208),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 1208),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 1216),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 1216),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 1224),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 1224),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 1232),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 1232),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 1240),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 1240),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 1248),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 77, 93), 1248),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 77, 93), 1256),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 1256),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 1264),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 1264),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 1272),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 1272),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 1280),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 1280),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 1288),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 1296),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 1304),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 1312),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 1320),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 1328),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 1336),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 1344),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 1352),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 1360),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 1368),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 76, 93), 1376),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 76, 93), 1384),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 72, 93), 1392),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 72, 93), 1400),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 1408),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 1424),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 71, 93), 1440),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 74, 93), 1440),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 79, 93), 1440),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 71, 93), 1456),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 74, 93), 1456),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 79, 93), 1456),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 1472),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 1488),

                    //Accompaniment
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 0),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 16),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 16),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 32),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 32),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 48),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 48),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 64),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 64),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 80),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 80),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 96),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 96),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 112),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 112),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 128),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 62, 93), 128),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 144),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 144),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 160),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 160),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 176),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 176),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 192),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 192),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 208),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 208),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 224),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 224),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 240),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 240),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 256),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 256),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 272),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 272),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 288),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 288),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 65, 93), 304),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 69, 93), 304),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 69, 93), 320),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 320),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 336),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 336),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 352),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 352),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 368),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 368),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 384),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 59, 93), 384),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 59, 93), 400),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 400),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 416),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 62, 93), 416),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 62, 93), 432),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 432),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 448),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 448),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 59, 93), 464),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 464),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 480),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 64, 93), 480),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 64, 93), 496),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 67, 93), 496),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 67, 93), 512),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 65, 93), 512),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 65, 93), 544),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 53, 93), 608),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 608),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 53, 93), 640),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 640),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 52, 93), 640),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 640),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 52, 93), 672),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 672),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 52, 93), 736),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 736),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 52, 93), 768),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 768),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 50, 93), 768),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 768),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 50, 93), 800),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 800),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 50, 93), 864),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 59, 93), 864),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 50, 93), 896),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 59, 93), 896),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 48, 93), 896),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 60, 93), 896),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 48, 93), 928),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 60, 93), 928),


                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 48, 93), 992),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 52, 93), 992),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 53, 93), 1024),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 57, 93), 1024),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 53, 93), 1152),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 53, 93), 1200),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 55, 93), 1200),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 55, 93), 1216),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 57, 93), 1216),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 57, 93), 1264),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 54, 93), 1264),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 54, 93), 1280),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 43, 93), 1280),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 43, 93), 1288),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 47, 93), 1288),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 47, 93), 1296),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 50, 93), 1296),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 50, 93), 1304),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 55, 93), 1304),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 55, 93), 1312),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 43, 93), 1312),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 43, 93), 1320),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 48, 93), 1320),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 48, 93), 1328),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 52, 93), 1328),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 52, 93), 1336),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 55, 93), 1336),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 55, 93), 1344),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 43, 93), 1344),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 43, 93), 1352),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 47, 93), 1352),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 47, 93), 1360),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 50, 93), 1360),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 50, 93), 1368),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 55, 93), 1368),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 55, 93), 1376),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 43, 93), 1376),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 43, 93), 1384),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 48, 93), 1384),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 48, 93), 1392),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 52, 93), 1392),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 52, 93), 1400),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 55, 93), 1400),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 55, 93), 1408),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 43, 93), 1408),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 43, 93), 1424),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 55, 93), 1440),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 55, 93), 1456),

                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 3, 43, 93), 1472),
                    new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 3, 43, 93), 1488)
                    );

            Track track = sequence.createTrack();

            for (MidiEvent event : events) {
                track.add(event);
            }
            sequencer.setSequence(sequence);
            sequencer.startRecording();
            sequencer.stopRecording();
        }
    }
}