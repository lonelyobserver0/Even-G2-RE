package L9;

import com.microsoft.cognitiveservices.speech.transcription.Meeting;
import com.microsoft.cognitiveservices.speech.transcription.User;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ User f4370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Meeting f4371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Meeting f4372d;

    public /* synthetic */ p(Meeting meeting, User user, Meeting meeting2, int i3) {
        this.f4369a = i3;
        this.f4372d = meeting;
        this.f4370b = user;
        this.f4371c = meeting2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4369a) {
            case 0:
                Meeting.F(this.f4371c, new n(this, 2));
                return this.f4370b;
            default:
                Meeting.F(this.f4371c, new n(this, 3));
                return null;
        }
    }
}
