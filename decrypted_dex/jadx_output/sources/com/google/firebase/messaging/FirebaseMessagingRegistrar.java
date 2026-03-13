package com.google.firebase.messaging;

import D5.s;
import F5.b;
import R4.h;
import W4.c;
import W4.i;
import W4.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.Arrays;
import java.util.List;
import n5.InterfaceC1386b;
import t5.InterfaceC1733d;
import u5.f;
import v5.InterfaceC1834a;
import x5.InterfaceC1913d;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = StubApp.getString2(12581);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q qVar, c cVar) {
        h hVar = (h) cVar.get(h.class);
        if (cVar.get(InterfaceC1834a.class) == null) {
            return new FirebaseMessaging(hVar, cVar.c(b.class), cVar.c(f.class), (InterfaceC1913d) cVar.get(InterfaceC1913d.class), cVar.d(qVar), (InterfaceC1733d) cVar.get(InterfaceC1733d.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<W4.b> getComponents() {
        q qVar = new q(InterfaceC1386b.class, y3.f.class);
        U9.h b2 = W4.b.b(FirebaseMessaging.class);
        String string2 = StubApp.getString2(12581);
        b2.f7520a = string2;
        b2.b(i.b(h.class));
        b2.b(new i(0, 0, InterfaceC1834a.class));
        b2.b(new i(0, 1, b.class));
        b2.b(new i(0, 1, f.class));
        b2.b(i.b(InterfaceC1913d.class));
        b2.b(new i(qVar, 0, 1));
        b2.b(i.b(InterfaceC1733d.class));
        b2.f7525f = new s(qVar, 0);
        b2.g(1);
        return Arrays.asList(b2.e(), u0.g(string2, StubApp.getString2(12582)));
    }
}
