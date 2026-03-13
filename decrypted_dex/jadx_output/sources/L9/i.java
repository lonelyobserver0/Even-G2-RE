package L9;

import com.microsoft.cognitiveservices.speech.transcription.ConversationTranslator;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationTranslator f4346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationTranslator f4347c;

    public /* synthetic */ i(ConversationTranslator conversationTranslator, ConversationTranslator conversationTranslator2, int i3) {
        this.f4345a = i3;
        this.f4347c = conversationTranslator;
        this.f4346b = conversationTranslator2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long conversationExpireSetCallback;
        long participantsChangedSetCallback;
        long transcribingSetCallback;
        long transcribedSetCallback;
        long textMessageSetCallback;
        long sessionStartedSetCallback;
        long sessionStoppedSetCallback;
        long canceledSetCallback;
        switch (this.f4345a) {
            case 0:
                Set set = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator = this.f4346b;
                set.add(conversationTranslator);
                conversationExpireSetCallback = this.f4347c.conversationExpireSetCallback(conversationTranslator.f12685a.getValue());
                Contracts.throwIfFail(conversationExpireSetCallback);
                break;
            case 1:
                Set set2 = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator2 = this.f4346b;
                set2.add(conversationTranslator2);
                participantsChangedSetCallback = this.f4347c.participantsChangedSetCallback(conversationTranslator2.f12685a.getValue());
                Contracts.throwIfFail(participantsChangedSetCallback);
                break;
            case 2:
                Set set3 = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator3 = this.f4346b;
                set3.add(conversationTranslator3);
                transcribingSetCallback = this.f4347c.transcribingSetCallback(conversationTranslator3.f12685a.getValue());
                Contracts.throwIfFail(transcribingSetCallback);
                break;
            case 3:
                Set set4 = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator4 = this.f4346b;
                set4.add(conversationTranslator4);
                transcribedSetCallback = this.f4347c.transcribedSetCallback(conversationTranslator4.f12685a.getValue());
                Contracts.throwIfFail(transcribedSetCallback);
                break;
            case 4:
                Set set5 = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator5 = this.f4346b;
                set5.add(conversationTranslator5);
                textMessageSetCallback = this.f4347c.textMessageSetCallback(conversationTranslator5.f12685a.getValue());
                Contracts.throwIfFail(textMessageSetCallback);
                break;
            case 5:
                Set set6 = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator6 = this.f4346b;
                set6.add(conversationTranslator6);
                sessionStartedSetCallback = this.f4347c.sessionStartedSetCallback(conversationTranslator6.f12685a.getValue());
                Contracts.throwIfFail(sessionStartedSetCallback);
                break;
            case 6:
                Set set7 = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator7 = this.f4346b;
                set7.add(conversationTranslator7);
                sessionStoppedSetCallback = this.f4347c.sessionStoppedSetCallback(conversationTranslator7.f12685a.getValue());
                Contracts.throwIfFail(sessionStoppedSetCallback);
                break;
            default:
                Set set8 = ConversationTranslator.f12684f;
                ConversationTranslator conversationTranslator8 = this.f4346b;
                set8.add(conversationTranslator8);
                canceledSetCallback = this.f4347c.canceledSetCallback(conversationTranslator8.f12685a.getValue());
                Contracts.throwIfFail(canceledSetCallback);
                break;
        }
    }
}
