package androidx.datastore.preferences.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c0 {
    public static b0 a(Object obj) {
        AbstractC0420u abstractC0420u = (AbstractC0420u) obj;
        b0 b0Var = abstractC0420u.unknownFields;
        if (b0Var != b0.f9764f) {
            return b0Var;
        }
        b0 b0Var2 = new b0(0, new int[8], new Object[8], true);
        abstractC0420u.unknownFields = b0Var2;
        return b0Var2;
    }

    public static boolean b(int i3, Ab.g gVar, Object obj) {
        int i10 = gVar.f275b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) gVar.f278e;
        if (i12 == 0) {
            gVar.R(0);
            ((b0) obj).c(i11 << 3, Long.valueOf(abstractC0410j.o()));
            return true;
        }
        if (i12 == 1) {
            gVar.R(1);
            ((b0) obj).c((i11 << 3) | 1, Long.valueOf(abstractC0410j.l()));
            return true;
        }
        if (i12 == 2) {
            ((b0) obj).c((i11 << 3) | 2, gVar.i());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw C0424y.b();
            }
            gVar.R(5);
            ((b0) obj).c(5 | (i11 << 3), Integer.valueOf(abstractC0410j.k()));
            return true;
        }
        b0 b0Var = new b0(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i3 + 1;
        if (i15 >= 100) {
            throw new C0424y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (gVar.b() != Integer.MAX_VALUE && b(i15, gVar, b0Var)) {
        }
        if (i14 != gVar.f275b) {
            throw new C0424y("Protocol message end-group tag did not match expected tag.");
        }
        if (b0Var.f9769e) {
            b0Var.f9769e = false;
        }
        ((b0) obj).c(i13 | 3, b0Var);
        return true;
    }
}
