package X2;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JsPromptResult;
import com.stub.StubApp;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt___SequencesKt$minus$1;
import sb.A0;
import sb.L0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class t implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8326c;

    public /* synthetic */ t(int i3, Object obj, Object obj2) {
        this.f8324a = i3;
        this.f8325b = obj;
        this.f8326c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean iterator$lambda$0;
        switch (this.f8324a) {
            case 0:
                Result result = (Result) obj;
                boolean m46isFailureimpl = Result.m46isFailureimpl(result.getValue());
                w wVar = (w) this.f8325b;
                z zVar = (z) this.f8326c;
                String string2 = StubApp.getString2(390);
                if (m46isFailureimpl) {
                    R2.c.c(string2, StubApp.getString2(7102));
                    Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(result.getValue());
                    if (m43exceptionOrNullimpl == null) {
                        m43exceptionOrNullimpl = new Exception(StubApp.getString2(7103));
                    }
                    zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(m43exceptionOrNullimpl))));
                } else {
                    R2.c.b(string2, StubApp.getString2(7104));
                    new Handler(Looper.getMainLooper()).postDelayed(new Ab.b(22, wVar, zVar), 100L);
                }
                return Unit.INSTANCE;
            case 1:
                iterator$lambda$0 = SequencesKt___SequencesKt$minus$1.iterator$lambda$0((Ref.BooleanRef) this.f8325b, this.f8326c, obj);
                return Boolean.valueOf(iterator$lambda$0);
            default:
                A0 a02 = (A0) obj;
                L0 l02 = (L0) this.f8325b;
                if (a02.f20847d) {
                    B3.s sVar = l02.f20879b.f20977a;
                    Throwable th = a02.f20846c;
                    Objects.requireNonNull(th);
                    sVar.getClass();
                    B3.s.m(th);
                    return null;
                }
                String str = (String) a02.f20845b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f8326c;
                if (str != null) {
                    jsPromptResult.confirm(str);
                    return null;
                }
                jsPromptResult.cancel();
                return null;
        }
    }
}
