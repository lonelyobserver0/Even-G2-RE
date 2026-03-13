package L9;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import com.microsoft.cognitiveservices.speech.transcription.Meeting;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpeechConfig f4329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4330c;

    public /* synthetic */ d(SpeechConfig speechConfig, String str, int i3) {
        this.f4328a = i3;
        this.f4329b = speechConfig;
        this.f4330c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long createConversationFromConfig;
        long createMeetingFromConfig;
        switch (this.f4328a) {
            case 0:
                IntRef intRef = new IntRef(0L);
                createConversationFromConfig = Conversation.createConversationFromConfig(intRef, this.f4329b.getImpl(), this.f4330c);
                Contracts.throwIfFail(createConversationFromConfig);
                return new Conversation(intRef.getValue());
            default:
                IntRef intRef2 = new IntRef(0L);
                createMeetingFromConfig = Meeting.createMeetingFromConfig(intRef2, this.f4329b.getImpl(), this.f4330c);
                Contracts.throwIfFail(createMeetingFromConfig);
                return new Meeting(intRef2.getValue());
        }
    }
}
