package H5;

import android.util.Log;
import com.stub.StubApp;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(String str, Continuation continuation) {
        super(2, continuation);
        this.f2826b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y(this.f2826b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2825a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            I5.c cVar = I5.c.f3228a;
            this.f2825a = 1;
            obj = cVar.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        Collection<c5.i> values = ((Map) obj).values();
        String str = this.f2826b;
        for (c5.i iVar : values) {
            I5.e eVar = new I5.e(str);
            iVar.getClass();
            String str2 = StubApp.getString2(2590) + eVar;
            if (Log.isLoggable(StubApp.getString2(280), 3)) {
                Log.d(StubApp.getString2(280), str2, null);
            }
            c5.h hVar = iVar.f10882b;
            synchronized (hVar) {
                if (!Objects.equals(hVar.f10880c, str)) {
                    c5.h.a(hVar.f10878a, hVar.f10879b, str);
                    hVar.f10880c = str;
                }
            }
            Log.d(StubApp.getString2(88), StubApp.getString2(2591) + I5.d.f3230a + StubApp.getString2(2592) + str);
        }
        return Unit.INSTANCE;
    }
}
