package L9;

import com.microsoft.cognitiveservices.speech.transcription.MeetingTranscriber;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeetingTranscriber f4374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MeetingTranscriber f4375c;

    public /* synthetic */ q(MeetingTranscriber meetingTranscriber, MeetingTranscriber meetingTranscriber2, int i3) {
        this.f4373a = i3;
        this.f4375c = meetingTranscriber;
        this.f4374b = meetingTranscriber2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4373a) {
            case 0:
                Set set = MeetingTranscriber.f12695b;
                MeetingTranscriber meetingTranscriber = this.f4374b;
                set.add(meetingTranscriber);
                Contracts.throwIfFail(this.f4375c.speechStartDetectedSetCallback(meetingTranscriber.getImpl().getValue()));
                break;
            case 1:
                Set set2 = MeetingTranscriber.f12695b;
                MeetingTranscriber meetingTranscriber2 = this.f4374b;
                set2.add(meetingTranscriber2);
                Contracts.throwIfFail(this.f4375c.speechEndDetectedSetCallback(meetingTranscriber2.getImpl().getValue()));
                break;
            case 2:
                Set set3 = MeetingTranscriber.f12695b;
                MeetingTranscriber meetingTranscriber3 = this.f4374b;
                set3.add(meetingTranscriber3);
                Contracts.throwIfFail(this.f4375c.recognizingSetCallback(meetingTranscriber3.getImpl().getValue()));
                break;
            case 3:
                Set set4 = MeetingTranscriber.f12695b;
                MeetingTranscriber meetingTranscriber4 = this.f4374b;
                set4.add(meetingTranscriber4);
                Contracts.throwIfFail(this.f4375c.recognizedSetCallback(meetingTranscriber4.getImpl().getValue()));
                break;
            case 4:
                Set set5 = MeetingTranscriber.f12695b;
                MeetingTranscriber meetingTranscriber5 = this.f4374b;
                set5.add(meetingTranscriber5);
                Contracts.throwIfFail(this.f4375c.canceledSetCallback(meetingTranscriber5.getImpl().getValue()));
                break;
            case 5:
                Set set6 = MeetingTranscriber.f12695b;
                MeetingTranscriber meetingTranscriber6 = this.f4374b;
                set6.add(meetingTranscriber6);
                Contracts.throwIfFail(this.f4375c.sessionStartedSetCallback(meetingTranscriber6.getImpl().getValue()));
                break;
            default:
                Set set7 = MeetingTranscriber.f12695b;
                MeetingTranscriber meetingTranscriber7 = this.f4374b;
                set7.add(meetingTranscriber7);
                Contracts.throwIfFail(this.f4375c.sessionStoppedSetCallback(meetingTranscriber7.getImpl().getValue()));
                break;
        }
    }
}
