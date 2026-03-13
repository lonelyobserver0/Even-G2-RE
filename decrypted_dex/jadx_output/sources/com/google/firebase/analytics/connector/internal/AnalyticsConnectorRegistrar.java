package com.google.firebase.analytics.connector.internal;

import R4.h;
import S3.D;
import T4.a;
import T4.b;
import T4.d;
import W4.c;
import W4.i;
import W4.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.Arrays;
import java.util.List;
import t5.InterfaceC1733d;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(c cVar) {
        h hVar = (h) cVar.get(h.class);
        Context context = (Context) cVar.get(Context.class);
        InterfaceC1733d interfaceC1733d = (InterfaceC1733d) cVar.get(InterfaceC1733d.class);
        D.h(hVar);
        D.h(context);
        D.h(interfaceC1733d);
        D.h(StubApp.getOrigApplicationContext(context.getApplicationContext()));
        if (b.f7173c == null) {
            synchronized (b.class) {
                try {
                    if (b.f7173c == null) {
                        Bundle bundle = new Bundle(1);
                        hVar.a();
                        if (StubApp.getString2("429").equals(hVar.f6194b)) {
                            ((k) interfaceC1733d).b(d.f7177b, T4.c.f7176a);
                            bundle.putBoolean(StubApp.getString2("9342"), hVar.k());
                        }
                        b.f7173c = new b(C0657o0.c(context, bundle).f11636b);
                    }
                } finally {
                }
            }
        }
        return b.f7173c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<W4.b> getComponents() {
        U9.h b2 = W4.b.b(a.class);
        b2.b(i.b(h.class));
        b2.b(i.b(Context.class));
        b2.b(i.b(InterfaceC1733d.class));
        b2.f7525f = C2.i.f1077c;
        b2.g(2);
        return Arrays.asList(b2.e(), u0.g(StubApp.getString2(12549), StubApp.getString2(12550)));
    }
}
