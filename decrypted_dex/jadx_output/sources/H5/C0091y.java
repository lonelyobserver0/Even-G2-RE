package H5;

import com.stub.StubApp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0091y extends FunctionReferenceImpl implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0091y f2924a = new C0091y(4, W.a.class, StubApp.getString2(2686), StubApp.getString2(2685), 1);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String name = (String) obj;
        Function1 produceMigrations = (Function1) obj3;
        Qb.I scope = (Qb.I) obj4;
        Intrinsics.checkNotNullParameter(name, "p0");
        Intrinsics.checkNotNullParameter(produceMigrations, "p2");
        Intrinsics.checkNotNullParameter(scope, "p3");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new W.b(name, (U.a) obj2, produceMigrations, scope);
    }
}
