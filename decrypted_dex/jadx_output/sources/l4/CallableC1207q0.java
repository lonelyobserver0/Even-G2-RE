package l4;

import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import com.microsoft.cognitiveservices.speech.transcription.ConversationTranslator;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: l4.q0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class CallableC1207q0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16591e;

    public CallableC1207q0(ConversationTranslator conversationTranslator, ConversationTranslator conversationTranslator2, Conversation conversation, String str) {
        this.f16587a = 4;
        this.f16591e = conversationTranslator;
        this.f16589c = conversationTranslator2;
        this.f16590d = conversation;
        this.f16588b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16587a) {
            case 0:
                BinderC1212t0 binderC1212t0 = (BinderC1212t0) this.f16591e;
                binderC1212t0.f16629e.A();
                C1199n c1199n = binderC1212t0.f16629e.f16061c;
                F1.S(c1199n);
                return c1199n.i0(this.f16588b, (String) this.f16589c, (String) this.f16590d);
            case 1:
                BinderC1212t0 binderC1212t02 = (BinderC1212t0) this.f16591e;
                binderC1212t02.f16629e.A();
                C1199n c1199n2 = binderC1212t02.f16629e.f16061c;
                F1.S(c1199n2);
                return c1199n2.i0(this.f16588b, (String) this.f16589c, (String) this.f16590d);
            case 2:
                BinderC1212t0 binderC1212t03 = (BinderC1212t0) this.f16591e;
                binderC1212t03.f16629e.A();
                C1199n c1199n3 = binderC1212t03.f16629e.f16061c;
                F1.S(c1199n3);
                return c1199n3.m0(this.f16588b, (String) this.f16589c, (String) this.f16590d);
            case 3:
                BinderC1212t0 binderC1212t04 = (BinderC1212t0) this.f16591e;
                binderC1212t04.f16629e.A();
                C1199n c1199n4 = binderC1212t04.f16629e.f16061c;
                F1.S(c1199n4);
                return c1199n4.m0(this.f16588b, (String) this.f16589c, (String) this.f16590d);
            default:
                ConversationTranslator.A((ConversationTranslator) this.f16589c, new J1.l(this, 17));
                return null;
        }
    }

    public CallableC1207q0(BinderC1212t0 binderC1212t0, String str, String str2, String str3, int i3) {
        this.f16587a = i3;
        switch (i3) {
            case 1:
                this.f16588b = str;
                this.f16589c = str2;
                this.f16590d = str3;
                Objects.requireNonNull(binderC1212t0);
                this.f16591e = binderC1212t0;
                break;
            case 2:
                this.f16588b = str;
                this.f16589c = str2;
                this.f16590d = str3;
                Objects.requireNonNull(binderC1212t0);
                this.f16591e = binderC1212t0;
                break;
            case 3:
                this.f16588b = str;
                this.f16589c = str2;
                this.f16590d = str3;
                Objects.requireNonNull(binderC1212t0);
                this.f16591e = binderC1212t0;
                break;
            default:
                this.f16588b = str;
                this.f16589c = str2;
                this.f16590d = str3;
                Objects.requireNonNull(binderC1212t0);
                this.f16591e = binderC1212t0;
                break;
        }
    }
}
