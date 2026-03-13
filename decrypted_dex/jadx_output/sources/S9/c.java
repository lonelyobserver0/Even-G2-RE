package S9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c extends i {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(kotlin.reflect.KClass r7, S9.t r8) {
        /*
            r6 = this;
            S9.s r3 = S9.s.f6666c
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "syntax"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            S9.d r1 = S9.d.f6614b
            r5 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.c.<init>(kotlin.reflect.KClass, S9.t):void");
    }

    @Override // S9.i
    public final Object b(o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int k3 = reader.k();
        t j = j(k3);
        if (j != null) {
            return j;
        }
        throw new h(k3, this.f6641b);
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.h(value.getValue());
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.E(value.getValue());
    }

    @Override // S9.i
    public final int h(Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int value2 = value.getValue();
        if ((value2 & (-128)) == 0) {
            return 1;
        }
        if ((value2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & value2) == 0) {
            return 3;
        }
        return (value2 & (-268435456)) == 0 ? 4 : 5;
    }

    public abstract t j(int i3);
}
