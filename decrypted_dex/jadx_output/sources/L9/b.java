package L9;

import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import com.microsoft.cognitiveservices.speech.transcription.Participant;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Conversation f4324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Conversation f4325d;

    public /* synthetic */ b(Conversation conversation, String str, Conversation conversation2, int i3) {
        this.f4322a = i3;
        this.f4325d = conversation;
        this.f4323b = str;
        this.f4324c = conversation2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4322a) {
            case 0:
                Conversation.F(this.f4324c, new J1.l(this, 7));
                return null;
            case 1:
                Conversation.F(this.f4324c, new J1.l(this, 8));
                return null;
            case 2:
                Participant[] participantArr = new Participant[1];
                Conversation.F(this.f4324c, new Q4.b(this, participantArr, 4, false));
                return participantArr[0];
            default:
                Conversation.F(this.f4324c, new J1.l(this, 13));
                return null;
        }
    }
}
