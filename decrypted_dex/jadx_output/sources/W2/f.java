package W2;

import Qb.C0227w0;
import Qb.I;
import Qb.L;
import Qb.W;
import com.microsoft.cognitiveservices.speech.SpeechRecognizer;
import com.microsoft.cognitiveservices.speech.audio.PushAudioInputStream;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B3.h f8086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(B3.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f8086b = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f8086b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0227w0 c0227w0;
        String string2 = StubApp.getString2(6861);
        String string22 = StubApp.getString2(6862);
        String string23 = StubApp.getString2(6863);
        String string24 = StubApp.getString2(6864);
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f8085a;
        String string25 = StubApp.getString2(6865);
        String string26 = StubApp.getString2(546);
        B3.h hVar = this.f8086b;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    V2.g gVar = (V2.g) hVar.f612c;
                    if (gVar == V2.g.f7734c || gVar == V2.g.f7735d) {
                        R2.c.b(string26, StubApp.getString2("6866"));
                        Xb.c cVar = W.f5839b;
                        e eVar = new e(hVar, null);
                        this.f8085a = 1;
                        if (L.n(cVar, eVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException(StubApp.getString2(275));
                    }
                    ResultKt.throwOnFailure(obj);
                }
                PushAudioInputStream pushAudioInputStream = (PushAudioInputStream) hVar.f613d;
                if (pushAudioInputStream != null) {
                    try {
                        pushAudioInputStream.close();
                        R2.c.b(string26, StubApp.getString2("6867"));
                    } catch (Exception e10) {
                        R2.c.f(string26, string24 + e10);
                    }
                    hVar.f613d = null;
                }
                c cVar2 = (c) hVar.f617h;
                if (cVar2 != null) {
                    try {
                        cVar2.a();
                        R2.c.b(string26, StubApp.getString2("6868"));
                    } catch (Exception e11) {
                        R2.c.f(string26, string23 + e11);
                    }
                    hVar.f617h = null;
                }
                hVar.f614e = null;
                hVar.f615f = null;
                SpeechRecognizer speechRecognizer = (SpeechRecognizer) hVar.f616g;
                if (speechRecognizer != null) {
                    try {
                        speechRecognizer.close();
                        R2.c.b(string26, StubApp.getString2("6869"));
                    } catch (Exception e12) {
                        R2.c.f(string26, string22 + e12);
                    }
                    hVar.f616g = null;
                }
                hVar.f612c = V2.g.f7732a;
                R2.c.d(string26, StubApp.getString2("6870"));
                c0227w0 = (C0227w0) hVar.f618i;
            } catch (Exception e13) {
                hVar.getClass();
                R2.c.c(string26, string2 + e13);
                hVar.f612c = V2.g.f7732a;
                c0227w0 = (C0227w0) hVar.f618i;
            }
            c0227w0.d(null);
            R2.c.b(string26, string25);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            ((C0227w0) hVar.f618i).d(null);
            R2.c.b(string26, string25);
            throw th;
        }
    }
}
