package E9;

import Qb.I;
import android.os.Trace;
import android.speech.tts.TextToSpeech;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f2104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Locale f2105b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, Locale locale, Continuation continuation) {
        super(2, continuation);
        this.f2104a = wVar;
        this.f2105b = locale;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f2104a, this.f2105b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        w wVar = this.f2104a;
        Locale locale = this.f2105b;
        int i3 = J.g.f3258a;
        Trace.beginSection(StubApp.getString2(1965));
        try {
            r rVar = wVar.f2110b;
            TextToSpeech textToSpeech = wVar.f2113e;
            boolean z2 = textToSpeech.isLanguageAvailable(locale) == 0;
            wVar.f2111c = z2;
            if (z2) {
                textToSpeech.setLanguage(locale);
            } else {
                String string2 = StubApp.getString2("1948");
                if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
                    D9.l.e(StubApp.getString2("1966"), string2);
                }
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
