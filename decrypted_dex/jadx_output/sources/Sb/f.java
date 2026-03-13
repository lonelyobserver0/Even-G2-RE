package Sb;

import com.stub.StubApp;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f6691a = new f(2, g.class, StubApp.getString2(25632), StubApp.getString2(25631), 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        n nVar = (n) obj2;
        n nVar2 = g.f6692a;
        e eVar = nVar.f6717e;
        Intrinsics.checkNotNull(eVar);
        return new n(longValue, nVar, eVar, 0);
    }
}
