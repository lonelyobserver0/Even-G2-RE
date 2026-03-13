package E9;

import Qb.I;
import android.os.Bundle;
import android.os.Trace;
import android.speech.tts.TextToSpeech;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f2106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f2106a = wVar;
        this.f2107b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f2106a, this.f2107b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        w wVar = this.f2106a;
        String str = this.f2107b;
        int i3 = J.g.f3258a;
        Trace.beginSection(StubApp.getString2(1967));
        try {
            Bundle bundle = new Bundle();
            bundle.putFloat(StubApp.getString2("1968"), wVar.f2114f);
            r rVar = wVar.f2110b;
            TextToSpeech textToSpeech = wVar.f2113e;
            Intrinsics.checkNotNullParameter(textToSpeech, "textToSpeech");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            new q(rVar, 0).invoke(textToSpeech, bundle);
            textToSpeech.speak(str, 0, bundle, StubApp.getString2("1969"));
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
