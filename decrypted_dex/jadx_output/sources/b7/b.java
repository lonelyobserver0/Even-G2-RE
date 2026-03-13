package b7;

import com.stub.StubApp;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10715a = new b(2, Q6.c.class, StubApp.getString2(9282), StubApp.getString2(9281), 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p02 = (String) obj;
        String p1 = (String) obj2;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return new Q6.c(p02, p1);
    }
}
