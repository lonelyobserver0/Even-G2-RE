package hb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.android.gms.internal.measurement.X;
import com.google.android.gms.internal.measurement.Y;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import q4.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f14492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f14493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f14494d;

    public /* synthetic */ h(i iVar, Map map, k kVar) {
        this.f14491a = 0;
        this.f14493c = iVar;
        this.f14492b = map;
        this.f14494d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14491a) {
            case 0:
                i iVar = this.f14493c;
                Map map = this.f14492b;
                k kVar = this.f14494d;
                try {
                    FirebaseAnalytics firebaseAnalytics = iVar.f14495a;
                    if (firebaseAnalytics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics = null;
                    }
                    Bundle a3 = i.a(map);
                    if (a3 != null) {
                        firebaseAnalytics.getClass();
                        a3 = new Bundle(a3);
                    }
                    C0657o0 c0657o0 = firebaseAnalytics.f12042a;
                    c0657o0.getClass();
                    c0657o0.a(new Y(c0657o0, a3, 2));
                    kVar.b(null);
                    break;
                } catch (Exception e10) {
                    kVar.a(e10);
                    return;
                }
            case 1:
                Map map2 = this.f14492b;
                i iVar2 = this.f14493c;
                k kVar2 = this.f14494d;
                try {
                    Boolean bool = (Boolean) map2.get(StubApp.getString2("18332"));
                    Boolean bool2 = (Boolean) map2.get(StubApp.getString2("18333"));
                    Boolean bool3 = (Boolean) map2.get(StubApp.getString2("18334"));
                    Boolean bool4 = (Boolean) map2.get(StubApp.getString2("18335"));
                    HashMap hashMap = new HashMap();
                    S4.a aVar = S4.a.f6583b;
                    S4.a aVar2 = S4.a.f6582a;
                    if (bool != null) {
                        hashMap.put(S4.b.f6585a, bool.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool2 != null) {
                        hashMap.put(S4.b.f6586b, bool2.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool3 != null) {
                        hashMap.put(S4.b.f6588d, bool3.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool4 != null) {
                        S4.b bVar = S4.b.f6587c;
                        if (bool4.booleanValue()) {
                            aVar = aVar2;
                        }
                        hashMap.put(bVar, aVar);
                    }
                    FirebaseAnalytics firebaseAnalytics2 = iVar2.f14495a;
                    if (firebaseAnalytics2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics2 = null;
                    }
                    firebaseAnalytics2.a(hashMap);
                    kVar2.b(null);
                    break;
                } catch (Exception e11) {
                    kVar2.a(e11);
                    return;
                }
            default:
                Map map3 = this.f14492b;
                i iVar3 = this.f14493c;
                k kVar3 = this.f14494d;
                try {
                    Object obj = map3.get(StubApp.getString2("18331"));
                    Objects.requireNonNull(obj);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    Map map4 = (Map) map3.get(StubApp.getString2("3808"));
                    iVar3.getClass();
                    Bundle a9 = i.a(map4);
                    FirebaseAnalytics firebaseAnalytics3 = iVar3.f14495a;
                    if (firebaseAnalytics3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics3 = null;
                    }
                    C0657o0 c0657o02 = firebaseAnalytics3.f12042a;
                    c0657o02.getClass();
                    c0657o02.a(new X(c0657o02, (String) null, str, a9, false));
                    kVar3.b(null);
                    break;
                } catch (Exception e12) {
                    kVar3.a(e12);
                }
        }
    }

    public /* synthetic */ h(Map map, i iVar, k kVar, int i3) {
        this.f14491a = i3;
        this.f14492b = map;
        this.f14493c = iVar;
        this.f14494d = kVar;
    }
}
