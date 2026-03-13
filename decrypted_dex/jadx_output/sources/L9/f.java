package L9;

import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import com.microsoft.cognitiveservices.speech.transcription.User;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ User f4336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Conversation f4337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Conversation f4338d;

    public /* synthetic */ f(Conversation conversation, User user, Conversation conversation2, int i3) {
        this.f4335a = i3;
        this.f4338d = conversation;
        this.f4336b = user;
        this.f4337c = conversation2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4335a) {
            case 0:
                Conversation.F(this.f4337c, new J1.l(this, 10));
                return this.f4336b;
            default:
                Conversation.F(this.f4337c, new J1.l(this, 11));
                return null;
        }
    }
}
