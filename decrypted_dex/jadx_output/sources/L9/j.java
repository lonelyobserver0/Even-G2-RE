package L9;

import com.microsoft.cognitiveservices.speech.transcription.ConversationTranslator;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConversationTranslator f4348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConversationTranslator f4352e;

    public j(ConversationTranslator conversationTranslator, ConversationTranslator conversationTranslator2, String str, String str2, String str3) {
        this.f4352e = conversationTranslator;
        this.f4348a = conversationTranslator2;
        this.f4349b = str;
        this.f4350c = str2;
        this.f4351d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConversationTranslator.A(this.f4348a, new J1.l(this, 18));
        return null;
    }
}
