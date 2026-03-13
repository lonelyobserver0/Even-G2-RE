package com.google.firebase.crashlytics;

import I5.d;
import U9.h;
import V4.a;
import V4.b;
import V4.c;
import W4.i;
import W4.q;
import Zb.e;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import x5.InterfaceC1913d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12048d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final q f12049a = new q(a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final q f12050b = new q(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final q f12051c = new q(c.class, ExecutorService.class);

    static {
        d subscriberName = d.f3230a;
        I5.c cVar = I5.c.f3228a;
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        Map dependencies = I5.c.f3229b;
        boolean containsKey = dependencies.containsKey(subscriberName);
        String string2 = StubApp.getString2(979);
        if (containsKey) {
            Log.d(string2, StubApp.getString2(12551) + subscriberName + StubApp.getString2(12552));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new I5.a(new e(true)));
        Log.d(string2, StubApp.getString2(12553) + subscriberName + StubApp.getString2(12554));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        h b2 = W4.b.b(Y4.b.class);
        String string2 = StubApp.getString2(12555);
        b2.f7520a = string2;
        b2.b(i.b(R4.h.class));
        b2.b(i.b(InterfaceC1913d.class));
        b2.b(new i(this.f12049a, 1, 0));
        b2.b(new i(this.f12050b, 1, 0));
        b2.b(new i(this.f12051c, 1, 0));
        b2.b(new i(0, 2, Z4.a.class));
        b2.b(new i(0, 2, T4.a.class));
        b2.b(new i(0, 2, G5.a.class));
        b2.f7525f = new C2.d(this, 27);
        b2.g(2);
        return Arrays.asList(b2.e(), u0.g(string2, StubApp.getString2(3976)));
    }
}
