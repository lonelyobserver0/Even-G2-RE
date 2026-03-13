package com.google.firebase.installations;

import R4.h;
import V4.a;
import V4.b;
import W4.c;
import W4.q;
import X4.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u5.d;
import u5.e;
import x5.C1912c;
import x5.InterfaceC1913d;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = StubApp.getString2(12561);

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC1913d lambda$getComponents$0(c cVar) {
        return new C1912c((h) cVar.get(h.class), cVar.c(e.class), (ExecutorService) cVar.e(new q(a.class, ExecutorService.class)), new i((Executor) cVar.e(new q(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<W4.b> getComponents() {
        U9.h b2 = W4.b.b(InterfaceC1913d.class);
        String string2 = StubApp.getString2(12561);
        b2.f7520a = string2;
        b2.b(W4.i.b(h.class));
        b2.b(new W4.i(0, 1, e.class));
        b2.b(new W4.i(new q(a.class, ExecutorService.class), 1, 0));
        b2.b(new W4.i(new q(b.class, Executor.class), 1, 0));
        b2.f7525f = new w0.b(27);
        W4.b e10 = b2.e();
        d dVar = new d(0);
        U9.h b10 = W4.b.b(d.class);
        b10.f7524e = 1;
        b10.f7525f = new W4.a(dVar);
        return Arrays.asList(e10, b10.e(), u0.g(string2, StubApp.getString2(12562)));
    }
}
