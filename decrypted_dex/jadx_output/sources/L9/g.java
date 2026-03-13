package L9;

import com.microsoft.cognitiveservices.speech.transcription.ConversationTranscriber;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationTranscriber f4340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationTranscriber f4341c;

    public /* synthetic */ g(ConversationTranscriber conversationTranscriber, ConversationTranscriber conversationTranscriber2, int i3) {
        this.f4339a = i3;
        this.f4341c = conversationTranscriber;
        this.f4340b = conversationTranscriber2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4339a) {
            case 0:
                Set set = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber = this.f4340b;
                set.add(conversationTranscriber);
                Contracts.throwIfFail(this.f4341c.speechEndDetectedSetCallback(conversationTranscriber.getImpl().getValue()));
                break;
            case 1:
                Set set2 = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber2 = this.f4340b;
                set2.add(conversationTranscriber2);
                Contracts.throwIfFail(this.f4341c.recognizingSetCallback(conversationTranscriber2.getImpl().getValue()));
                break;
            case 2:
                Set set3 = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber3 = this.f4340b;
                set3.add(conversationTranscriber3);
                Contracts.throwIfFail(this.f4341c.recognizedSetCallback(conversationTranscriber3.getImpl().getValue()));
                break;
            case 3:
                Set set4 = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber4 = this.f4340b;
                set4.add(conversationTranscriber4);
                Contracts.throwIfFail(this.f4341c.canceledSetCallback(conversationTranscriber4.getImpl().getValue()));
                break;
            case 4:
                Set set5 = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber5 = this.f4340b;
                set5.add(conversationTranscriber5);
                Contracts.throwIfFail(this.f4341c.sessionStartedSetCallback(conversationTranscriber5.getImpl().getValue()));
                break;
            case 5:
                Set set6 = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber6 = this.f4340b;
                set6.add(conversationTranscriber6);
                Contracts.throwIfFail(this.f4341c.sessionStoppedSetCallback(conversationTranscriber6.getImpl().getValue()));
                break;
            case 6:
                Set set7 = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber7 = this.f4340b;
                set7.add(conversationTranscriber7);
                Contracts.throwIfFail(this.f4341c.tokenRefreshSetCallback(conversationTranscriber7.getImpl().getValue()));
                break;
            default:
                Set set8 = ConversationTranscriber.f12669b;
                ConversationTranscriber conversationTranscriber8 = this.f4340b;
                set8.add(conversationTranscriber8);
                Contracts.throwIfFail(this.f4341c.speechStartDetectedSetCallback(conversationTranscriber8.getImpl().getValue()));
                break;
        }
    }
}
