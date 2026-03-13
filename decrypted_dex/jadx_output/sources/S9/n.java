package S9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends i {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f6645s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(S9.i r7, kotlin.reflect.KClass r8, java.lang.Object r9) {
        /*
            r6 = this;
            S9.d r1 = S9.d.f6616d
            S9.s r3 = S9.s.f6666c
            r6.f6645s = r7
            r5 = 0
            r0 = r6
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.n.<init>(S9.i, kotlin.reflect.KClass, java.lang.Object):void");
    }

    @Override // S9.i
    public final Object b(o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        i iVar = this.f6645s;
        long d8 = reader.d();
        Object obj = iVar.f6643d;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                reader.e(d8);
                return obj;
            }
            if (g10 == 1) {
                obj = iVar.b(reader);
            } else {
                reader.j(g10);
            }
        }
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj != null) {
            i iVar = this.f6645s;
            if (Intrinsics.areEqual(obj, iVar.f6643d)) {
                return;
            }
            iVar.f(writer, 1, obj);
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj != null) {
            i iVar = this.f6645s;
            if (Intrinsics.areEqual(obj, iVar.f6643d)) {
                return;
            }
            iVar.g(writer, 1, obj);
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        i iVar = this.f6645s;
        if (Intrinsics.areEqual(obj, iVar.f6643d)) {
            return 0;
        }
        return iVar.i(1, obj);
    }
}
