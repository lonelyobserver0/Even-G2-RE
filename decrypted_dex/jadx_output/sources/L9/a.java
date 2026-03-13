package L9;

import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Conversation f4320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Conversation f4321c;

    public /* synthetic */ a(Conversation conversation, Conversation conversation2, int i3) {
        this.f4319a = i3;
        this.f4321c = conversation;
        this.f4320b = conversation2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4319a) {
            case 0:
                Conversation.F(this.f4320b, new J1.l(this, 1));
                break;
            case 1:
                Conversation.F(this.f4320b, new J1.l(this, 2));
                break;
            case 2:
                Conversation.F(this.f4320b, new J1.l(this, 3));
                break;
            case 3:
                Conversation.F(this.f4320b, new J1.l(this, 4));
                break;
            case 4:
                Conversation.F(this.f4320b, new J1.l(this, 5));
                break;
            case 5:
                Conversation.F(this.f4320b, new J1.l(this, 6));
                break;
            default:
                Conversation.F(this.f4320b, new J1.l(this, 14));
                break;
        }
        return null;
    }
}
