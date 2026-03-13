package com.google.firebase.datatransport;

import B3.t;
import U9.h;
import W4.b;
import W4.c;
import W4.i;
import W4.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import g5.C0955a;
import java.util.Arrays;
import java.util.List;
import n5.InterfaceC1385a;
import n5.InterfaceC1386b;
import y3.f;
import z3.C2005a;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = StubApp.getString2(12556);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        t.b((Context) cVar.get(Context.class));
        return t.a().c(C2005a.f24033f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        t.b((Context) cVar.get(Context.class));
        return t.a().c(C2005a.f24033f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        t.b((Context) cVar.get(Context.class));
        return t.a().c(C2005a.f24032e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        h b2 = b.b(f.class);
        String string2 = StubApp.getString2(12556);
        b2.f7520a = string2;
        b2.b(i.b(Context.class));
        b2.f7525f = new C0955a(10);
        b e10 = b2.e();
        h a3 = b.a(new q(InterfaceC1385a.class, f.class));
        a3.b(i.b(Context.class));
        a3.f7525f = new C0955a(11);
        b e11 = a3.e();
        h a9 = b.a(new q(InterfaceC1386b.class, f.class));
        a9.b(i.b(Context.class));
        a9.f7525f = new C0955a(12);
        return Arrays.asList(e10, e11, a9.e(), u0.g(string2, StubApp.getString2(12557)));
    }
}
