package com.google.protobuf;

import com.stub.StubApp;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0720c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0755z f12142b = new C0755z(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f12143a;

    public C0720c0(AbstractC0747q abstractC0747q) {
        Q.a(abstractC0747q, StubApp.getString2(295));
        this.f12143a = abstractC0747q;
        abstractC0747q.f12212d = this;
    }

    public void a(int i3, Object obj, u0 u0Var) {
        AbstractC0747q abstractC0747q = (AbstractC0747q) this.f12143a;
        abstractC0747q.g0(i3, 3);
        u0Var.e((InterfaceC0732i0) obj, abstractC0747q.f12212d);
        abstractC0747q.g0(i3, 4);
    }

    public C0720c0() {
        InterfaceC0728g0 interfaceC0728g0;
        try {
            interfaceC0728g0 = (InterfaceC0728g0) Class.forName(StubApp.getString2("12635")).getDeclaredMethod(StubApp.getString2("2877"), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC0728g0 = f12142b;
        }
        InterfaceC0728g0[] interfaceC0728g0Arr = {C0755z.f12250b, interfaceC0728g0};
        C0718b0 c0718b0 = new C0718b0();
        c0718b0.f12141a = interfaceC0728g0Arr;
        Charset charset = Q.f12119a;
        this.f12143a = c0718b0;
    }
}
