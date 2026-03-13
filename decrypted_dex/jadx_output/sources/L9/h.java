package L9;

import com.microsoft.cognitiveservices.speech.transcription.ConversationTranscriber;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationTranscriber f4343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationTranscriber f4344c;

    public /* synthetic */ h(ConversationTranscriber conversationTranscriber, ConversationTranscriber conversationTranscriber2, int i3) {
        this.f4342a = i3;
        this.f4344c = conversationTranscriber;
        this.f4343b = conversationTranscriber2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConversationTranscriber conversationTranscriber = this.f4343b;
        switch (this.f4342a) {
            case 0:
                J1.l lVar = new J1.l(this, 15);
                Set set = ConversationTranscriber.f12669b;
                conversationTranscriber.doAsyncRecognitionAction(lVar);
                break;
            default:
                J1.l lVar2 = new J1.l(this, 16);
                Set set2 = ConversationTranscriber.f12669b;
                conversationTranscriber.doAsyncRecognitionAction(lVar2);
                break;
        }
        return null;
    }
}
