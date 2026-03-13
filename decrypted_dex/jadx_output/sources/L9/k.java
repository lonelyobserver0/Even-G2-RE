package L9;

import com.microsoft.cognitiveservices.speech.transcription.ConversationTranslator;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationTranslator f4354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationTranslator f4355c;

    public /* synthetic */ k(ConversationTranslator conversationTranslator, ConversationTranslator conversationTranslator2, int i3) {
        this.f4353a = i3;
        this.f4355c = conversationTranslator;
        this.f4354b = conversationTranslator2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4353a) {
            case 0:
                ConversationTranslator.A(this.f4354b, new J1.l(this, 19));
                break;
            case 1:
                ConversationTranslator.A(this.f4354b, new J1.l(this, 21));
                break;
            default:
                ConversationTranslator.A(this.f4354b, new J1.l(this, 22));
                break;
        }
        return null;
    }
}
