package com.google.protobuf;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y0 {
    public static x0 a(Object obj) {
        F f10 = (F) obj;
        x0 x0Var = f10.unknownFields;
        if (x0Var != x0.f12241f) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        f10.unknownFields = x0Var2;
        return x0Var2;
    }

    public static boolean b(Object obj, Ab.g gVar) {
        int i3 = gVar.f275b;
        int i10 = i3 >>> 3;
        int i11 = i3 & 7;
        AbstractC0741n abstractC0741n = (AbstractC0741n) gVar.f278e;
        if (i11 == 0) {
            gVar.R(0);
            ((x0) obj).f(i10 << 3, Long.valueOf(abstractC0741n.r()));
            return true;
        }
        if (i11 == 1) {
            gVar.R(1);
            ((x0) obj).f((i10 << 3) | 1, Long.valueOf(abstractC0741n.o()));
            return true;
        }
        if (i11 == 2) {
            ((x0) obj).f((i10 << 3) | 2, gVar.j());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw T.c();
            }
            gVar.R(5);
            ((x0) obj).f((i10 << 3) | 5, Integer.valueOf(abstractC0741n.n()));
            return true;
        }
        x0 x0Var = new x0();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (gVar.b() != Integer.MAX_VALUE && b(x0Var, gVar)) {
        }
        if (i13 != gVar.f275b) {
            throw new T(StubApp.getString2(12646));
        }
        if (x0Var.f12246e) {
            x0Var.f12246e = false;
        }
        ((x0) obj).f(i12 | 3, x0Var);
        return true;
    }
}
