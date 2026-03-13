package L9;

import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import com.microsoft.cognitiveservices.speech.transcription.Participant;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Participant f4332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Conversation f4333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Conversation f4334d;

    public /* synthetic */ e(Conversation conversation, Participant participant, Conversation conversation2, int i3) {
        this.f4331a = i3;
        this.f4334d = conversation;
        this.f4332b = participant;
        this.f4333c = conversation2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4331a) {
            case 0:
                Conversation.F(this.f4333c, new J1.l(this, 9));
                return this.f4332b;
            default:
                Conversation.F(this.f4333c, new J1.l(this, 12));
                return null;
        }
    }
}
