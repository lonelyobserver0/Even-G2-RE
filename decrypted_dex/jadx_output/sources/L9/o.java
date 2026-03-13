package L9;

import com.microsoft.cognitiveservices.speech.transcription.Meeting;
import com.microsoft.cognitiveservices.speech.transcription.Participant;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Participant f4366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Meeting f4367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Meeting f4368d;

    public /* synthetic */ o(Meeting meeting, Participant participant, Meeting meeting2, int i3) {
        this.f4365a = i3;
        this.f4368d = meeting;
        this.f4366b = participant;
        this.f4367c = meeting2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4365a) {
            case 0:
                Meeting.F(this.f4367c, new n(this, 1));
                return this.f4366b;
            default:
                Meeting.F(this.f4367c, new n(this, 4));
                return null;
        }
    }
}
