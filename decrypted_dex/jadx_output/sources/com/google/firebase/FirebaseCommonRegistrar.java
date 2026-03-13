package com.google.firebase;

import D5.s;
import F5.a;
import U9.h;
import W4.b;
import W4.i;
import W4.q;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import u5.c;
import u5.d;
import u5.e;
import u5.f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        h b2 = b.b(F5.b.class);
        b2.b(new i(2, 0, a.class));
        b2.f7525f = new A1.a(12);
        arrayList.add(b2.e());
        q qVar = new q(V4.a.class, Executor.class);
        h hVar = new h(c.class, new Class[]{e.class, f.class});
        hVar.b(i.b(Context.class));
        hVar.b(i.b(R4.h.class));
        hVar.b(new i(2, 0, d.class));
        hVar.b(new i(1, 1, F5.b.class));
        hVar.b(new i(qVar, 1, 0));
        hVar.f7525f = new s(qVar, 1);
        arrayList.add(hVar.e());
        arrayList.add(u0.g(StubApp.getString2(12531), String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(u0.g(StubApp.getString2(12532), StubApp.getString2(12533)));
        arrayList.add(u0.g(StubApp.getString2(12534), a(Build.PRODUCT)));
        arrayList.add(u0.g(StubApp.getString2(12535), a(Build.DEVICE)));
        arrayList.add(u0.g(StubApp.getString2(12536), a(Build.BRAND)));
        arrayList.add(u0.n(StubApp.getString2(12537), new A1.a(28)));
        arrayList.add(u0.n(StubApp.getString2(12538), new A1.a(29)));
        arrayList.add(u0.n(StubApp.getString2(12539), new R4.i(0)));
        arrayList.add(u0.n(StubApp.getString2(12540), new R4.i(1)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(u0.g(StubApp.getString2(12541), str));
        }
        return arrayList;
    }
}
