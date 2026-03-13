package L9;

import com.microsoft.cognitiveservices.speech.transcription.Meeting;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Meeting f4357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Meeting f4358c;

    public /* synthetic */ l(Meeting meeting, Meeting meeting2, int i3) {
        this.f4356a = i3;
        this.f4358c = meeting;
        this.f4357b = meeting2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4356a) {
            case 0:
                Meeting.F(this.f4357b, new J1.l(this, 23));
                break;
            case 1:
                Meeting.F(this.f4357b, new J1.l(this, 24));
                break;
            case 2:
                Meeting.F(this.f4357b, new J1.l(this, 25));
                break;
            case 3:
                Meeting.F(this.f4357b, new J1.l(this, 26));
                break;
            case 4:
                Meeting.F(this.f4357b, new J1.l(this, 27));
                break;
            case 5:
                Meeting.F(this.f4357b, new J1.l(this, 28));
                break;
            default:
                Meeting.F(this.f4357b, new n(this, 6));
                break;
        }
        return null;
    }
}
