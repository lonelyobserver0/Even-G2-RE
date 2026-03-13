package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Z1 extends C0636k {

    /* renamed from: b, reason: collision with root package name */
    public final a5.c f11436b;

    public Z1(a5.c cVar) {
        this.f11436b = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C0636k, com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        char c10;
        Z1 z12;
        int hashCode = str.hashCode();
        String string2 = StubApp.getString2(11875);
        String string22 = StubApp.getString2(11876);
        String string23 = StubApp.getString2(11877);
        String string24 = StubApp.getString2(11878);
        String string25 = StubApp.getString2(11879);
        String string26 = StubApp.getString2(11880);
        switch (hashCode) {
            case 21624207:
                if (str.equals(string2)) {
                    c10 = 0;
                    z12 = this;
                    break;
                }
                c10 = 65535;
                z12 = this;
            case 45521504:
                if (str.equals(string22)) {
                    z12 = this;
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                z12 = this;
                break;
            case 146575578:
                if (str.equals(string23)) {
                    z12 = this;
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                z12 = this;
                break;
            case 700587132:
                if (str.equals(string24)) {
                    z12 = this;
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                z12 = this;
                break;
            case 920706790:
                if (str.equals(string25)) {
                    c10 = 5;
                    z12 = this;
                    break;
                }
                c10 = 65535;
                z12 = this;
            case 1570616835:
                if (str.equals(string26)) {
                    z12 = this;
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                z12 = this;
                break;
            default:
                c10 = 65535;
                z12 = this;
                break;
        }
        a5.c cVar = z12.f11436b;
        if (c10 == 0) {
            a4.f.L(0, string2, arrayList);
            return new C0666q(((C0591b) cVar.f9283c).f11447a);
        }
        if (c10 == 1) {
            a4.f.L(1, string23, arrayList);
            String b2 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b();
            HashMap hashMap = ((C0591b) cVar.f9283c).f11449c;
            return android.support.v4.media.session.b.H(hashMap.containsKey(b2) ? hashMap.get(b2) : null);
        }
        if (c10 == 2) {
            a4.f.L(0, string24, arrayList);
            HashMap hashMap2 = ((C0591b) cVar.f9283c).f11449c;
            C0636k c0636k = new C0636k();
            for (String str2 : hashMap2.keySet()) {
                c0636k.g(str2, android.support.v4.media.session.b.H(hashMap2.get(str2)));
            }
            return c0636k;
        }
        if (c10 == 3) {
            a4.f.L(0, string22, arrayList);
            return new C0616g(Double.valueOf(((C0591b) cVar.f9283c).f11448b));
        }
        if (c10 == 4) {
            a4.f.L(1, string26, arrayList);
            InterfaceC0651n c11 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0));
            if (InterfaceC0651n.f11619U.equals(c11) || InterfaceC0651n.f11620V.equals(c11)) {
                throw new IllegalArgumentException(StubApp.getString2(11881));
            }
            ((C0591b) cVar.f9283c).f11447a = c11.b();
            return new C0666q(c11.b());
        }
        if (c10 != 5) {
            return super.i(str, hVar, arrayList);
        }
        a4.f.L(2, string25, arrayList);
        String b10 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b();
        InterfaceC0651n c12 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1));
        C0591b c0591b = (C0591b) cVar.f9283c;
        Object Y5 = a4.f.Y(c12);
        HashMap hashMap3 = c0591b.f11449c;
        if (Y5 == null) {
            hashMap3.remove(b10);
            return c12;
        }
        hashMap3.put(b10, C0591b.b(b10, hashMap3.get(b10), Y5));
        return c12;
    }
}
