package kc;

import N5.m;
import com.stub.StubApp;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import m6.C1274b;
import m6.InterfaceC1273a;

/* renamed from: kc.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C1127d implements InterfaceC1273a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1128e f15566b;

    public C1127d(List list, C1128e c1128e) {
        this.f15565a = list;
        this.f15566b = c1128e;
    }

    @Override // m6.InterfaceC1273a
    public final void f(List resultPoints) {
        Intrinsics.checkNotNullParameter(resultPoints, "resultPoints");
    }

    @Override // m6.InterfaceC1273a
    public final void h(C1274b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        List list = this.f15565a;
        if (list.isEmpty() || list.contains(result.f17058a.f4911d)) {
            Pair pair = TuplesKt.to(StubApp.getString2(1052), result.f17058a.f4908a);
            m mVar = result.f17058a;
            Map mapOf = MapsKt.mapOf(pair, TuplesKt.to(StubApp.getString2(660), mVar.f4911d.name()), TuplesKt.to(StubApp.getString2(26060), mVar.f4909b));
            C1128e c1128e = this.f15566b;
            c1128e.f15570d.invokeMethod(StubApp.getString2(26061), mapOf);
        }
    }
}
