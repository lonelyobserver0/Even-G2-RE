package L9;

import com.microsoft.cognitiveservices.speech.transcription.MeetingTranscriber;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeetingTranscriber f4377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MeetingTranscriber f4378c;

    public /* synthetic */ r(MeetingTranscriber meetingTranscriber, MeetingTranscriber meetingTranscriber2, int i3) {
        this.f4376a = i3;
        this.f4378c = meetingTranscriber;
        this.f4377b = meetingTranscriber2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MeetingTranscriber meetingTranscriber = this.f4377b;
        switch (this.f4376a) {
            case 0:
                n nVar = new n(this, 8);
                Set set = MeetingTranscriber.f12695b;
                meetingTranscriber.doAsyncRecognitionAction(nVar);
                break;
            case 1:
                n nVar2 = new n(this, 9);
                Set set2 = MeetingTranscriber.f12695b;
                meetingTranscriber.doAsyncRecognitionAction(nVar2);
                break;
            default:
                n nVar3 = new n(this, 10);
                Set set3 = MeetingTranscriber.f12695b;
                meetingTranscriber.doAsyncRecognitionAction(nVar3);
                break;
        }
        return null;
    }
}
