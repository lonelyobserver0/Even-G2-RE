package L9;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import com.microsoft.cognitiveservices.speech.transcription.Meeting;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpeechConfig f4327b;

    public /* synthetic */ c(SpeechConfig speechConfig, int i3) {
        this.f4326a = i3;
        this.f4327b = speechConfig;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long createConversationFromConfig;
        long createMeetingFromConfig;
        switch (this.f4326a) {
            case 0:
                IntRef intRef = new IntRef(0L);
                createConversationFromConfig = Conversation.createConversationFromConfig(intRef, this.f4327b.getImpl(), "");
                Contracts.throwIfFail(createConversationFromConfig);
                return new Conversation(intRef.getValue());
            default:
                IntRef intRef2 = new IntRef(0L);
                createMeetingFromConfig = Meeting.createMeetingFromConfig(intRef2, this.f4327b.getImpl(), "");
                Contracts.throwIfFail(createMeetingFromConfig);
                return new Meeting(intRef2.getValue());
        }
    }
}
