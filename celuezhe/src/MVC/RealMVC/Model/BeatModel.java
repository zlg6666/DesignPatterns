package MVC.RealMVC.Model;

import MVC.RealMVC.View.BPMObserver;
import MVC.RealMVC.View.BeatObserver;

import javax.sound.midi.*;
import java.util.ArrayList;

/**
 * @author: zlg
 * @date: 2022/10/21
 *
 * 击打模型
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {

    //定序器 对象知道如何产生真实的节拍
    Sequencer sequencer;
    //Arraylist 持有 两种观察者（一种观察节拍，一种观察BPM的改变）
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers  = new ArrayList();
    int bpm = 90;

    Sequence sequence;
    Track track;


    @Override
    public void initialize() {
        //这个方法为我们设置 定序器 和节拍音轨
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        //这里开始了定序器，并将 bpm设定为默认值90
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        // 这里通过将 BPM设置为0 ，停止定序器
        setBPM(0);
        sequencer.stop();
    }

    //控制器调用此 方法 操纵 节拍，这里做了三件事
    //1。 设置BPM实例 变量 2。 要求定序器改变BPM 3。 通知所有的BPM观察者，BPM已经改变了
    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObserver();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    //当新的节拍开始时，会通知全部的BeatObserver
    void beatEvent() {
        notifyBeatObserver();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    public void notifyBeatObserver() {
        for (int i = 0; i < beatObservers.size(); i++) {
            BeatObserver beatObserver = (BeatObserver)beatObservers.get(i);
            beatObserver.updateBeat();
        }
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    public void notifyBPMObserver() {
        for (int i = 0; i < bpmObservers.size(); i++) {
            BPMObserver bpmObserver = (BPMObserver)beatObservers.get(i);
            bpmObserver.updateBPM();
        }
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

    @Override
    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequencer.getSequence().createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();
        markTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void markTracks(int[] trackList) {
        for (int i = 0; i < trackList.length; i++) {
            int key = trackList[i];
            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i+1));
            }
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
