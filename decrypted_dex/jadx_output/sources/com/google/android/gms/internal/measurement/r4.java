package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r4 extends AbstractC0621h {

    /* renamed from: c, reason: collision with root package name */
    public final C0708y2 f11656c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f11657d;

    public r4(C0708y2 c0708y2) {
        super(StubApp.getString2(1300));
        this.f11657d = new HashMap();
        this.f11656c = c0708y2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0621h
    public final InterfaceC0651n e(p2.h hVar, List list) {
        InterfaceC0651n interfaceC0651n;
        a4.f.L(1, StubApp.getString2(1300), list);
        String b2 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) list.get(0)).b();
        HashMap hashMap = this.f11657d;
        if (hashMap.containsKey(b2)) {
            return (InterfaceC0651n) hashMap.get(b2);
        }
        HashMap hashMap2 = (HashMap) this.f11656c.f11771a;
        if (hashMap2.containsKey(b2)) {
            try {
                interfaceC0651n = (InterfaceC0651n) ((Callable) hashMap2.get(b2)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(StubApp.getString2(12205).concat(String.valueOf(b2)));
            }
        } else {
            interfaceC0651n = InterfaceC0651n.f11619U;
        }
        if (interfaceC0651n instanceof AbstractC0621h) {
            hashMap.put(b2, (AbstractC0621h) interfaceC0651n);
        }
        return interfaceC0651n;
    }
}
