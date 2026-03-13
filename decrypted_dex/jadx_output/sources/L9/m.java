package L9;

import com.microsoft.cognitiveservices.speech.transcription.Meeting;
import com.microsoft.cognitiveservices.speech.transcription.Participant;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Meeting f4361c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Meeting f4362d;

    public /* synthetic */ m(Meeting meeting, String str, Meeting meeting2, int i3) {
        this.f4359a = i3;
        this.f4362d = meeting;
        this.f4360b = str;
        this.f4361c = meeting2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4359a) {
            case 0:
                Meeting.F(this.f4361c, new J1.l(this, 29));
                return null;
            case 1:
                Meeting.F(this.f4361c, new n(this, 0));
                return null;
            case 2:
                Participant[] participantArr = new Participant[1];
                Meeting.F(this.f4361c, new Q4.b(this, participantArr, 5, false));
                return participantArr[0];
            default:
                Meeting.F(this.f4361c, new n(this, 5));
                return null;
        }
    }
}
