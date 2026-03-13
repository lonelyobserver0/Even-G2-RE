package Lc;

import Kc.B;
import Kc.C0101h;
import Kc.n;
import Kc.y;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class k {
    public static final Map a(ArrayList arrayList) {
        List<h> sortedWith;
        String str = y.f3858b;
        y v2 = C2.i.v(StubApp.getString2(601), false);
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(v2, new h(v2)));
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new A.i(1));
        for (h hVar : sortedWith) {
            if (((h) mutableMapOf.put(hVar.f4411a, hVar)) == null) {
                while (true) {
                    y yVar = hVar.f4411a;
                    y c10 = yVar.c();
                    if (c10 != null) {
                        h hVar2 = (h) mutableMapOf.get(c10);
                        if (hVar2 != null) {
                            hVar2.f4416f.add(yVar);
                            break;
                        }
                        h hVar3 = new h(c10);
                        mutableMapOf.put(c10, hVar3);
                        hVar3.f4416f.add(yVar);
                        hVar = hVar3;
                    }
                }
            }
        }
        return mutableMapOf;
    }

    public static final String b(int i3) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(463));
        String num = Integer.toString(i3, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        return sb2.toString();
    }

    public static final h c(B b2) {
        Long valueOf;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(b2, "<this>");
        int k3 = b2.k();
        if (k3 != 33639248) {
            throw new IOException(StubApp.getString2(24962) + b(33639248) + StubApp.getString2(6049) + b(k3));
        }
        b2.skip(4L);
        short v2 = b2.v();
        int i3 = v2 & UShort.MAX_VALUE;
        if ((v2 & 1) != 0) {
            throw new IOException(StubApp.getString2(25401) + b(i3));
        }
        int v8 = b2.v() & UShort.MAX_VALUE;
        short v10 = b2.v();
        int i10 = v10 & UShort.MAX_VALUE;
        short v11 = b2.v();
        int i11 = v11 & UShort.MAX_VALUE;
        if (i10 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i11 >> 9) & CertificateBody.profileType) + 1980, ((i11 >> 5) & 15) - 1, v11 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (v10 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l9 = valueOf;
        b2.k();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = b2.k() & BodyPartID.bodyIdMax;
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = b2.k() & BodyPartID.bodyIdMax;
        int v12 = b2.v() & UShort.MAX_VALUE;
        int v13 = b2.v() & UShort.MAX_VALUE;
        int v14 = b2.v() & UShort.MAX_VALUE;
        b2.skip(8L);
        Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = b2.k() & BodyPartID.bodyIdMax;
        String A4 = b2.A(v12);
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) A4, (char) 0, false, 2, (Object) null);
        if (contains$default) {
            throw new IOException(StubApp.getString2(25400));
        }
        long j = longRef2.element == BodyPartID.bodyIdMax ? 8 : 0L;
        if (longRef.element == BodyPartID.bodyIdMax) {
            j += 8;
        }
        if (longRef3.element == BodyPartID.bodyIdMax) {
            j += 8;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        d(b2, v13, new i(booleanRef, j, longRef2, b2, longRef, longRef3));
        if (j > 0 && !booleanRef.element) {
            throw new IOException(StubApp.getString2(25399));
        }
        String A5 = b2.A(v14);
        String str = y.f3858b;
        String string2 = StubApp.getString2(601);
        return new h(C2.i.v(string2, false).d(A4), StringsKt.u(A4, string2), A5, longRef.element, longRef2.element, v8, l9, longRef3.element);
    }

    public static final void d(B b2, int i3, Function2 function2) {
        long j = i3;
        while (j != 0) {
            if (j < 4) {
                throw new IOException(StubApp.getString2(25404));
            }
            int v2 = b2.v() & UShort.MAX_VALUE;
            long v8 = b2.v() & 65535;
            long j3 = j - 4;
            if (j3 < v8) {
                throw new IOException(StubApp.getString2(25403));
            }
            b2.D(v8);
            C0101h c0101h = b2.f3774b;
            long j10 = c0101h.f3819b;
            function2.invoke(Integer.valueOf(v2), Long.valueOf(v8));
            long j11 = (c0101h.f3819b + v8) - j10;
            if (j11 < 0) {
                throw new IOException(u.p(v2, StubApp.getString2(25402)));
            }
            if (j11 > 0) {
                c0101h.skip(j11);
            }
            j = j3 - v8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n e(B b2, n nVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = nVar != null ? nVar.f3834e : 0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int k3 = b2.k();
        if (k3 != 67324752) {
            throw new IOException(StubApp.getString2(24962) + b(67324752) + StubApp.getString2(6049) + b(k3));
        }
        b2.skip(2L);
        short v2 = b2.v();
        int i3 = v2 & UShort.MAX_VALUE;
        if ((v2 & 1) != 0) {
            throw new IOException(StubApp.getString2(25401) + b(i3));
        }
        b2.skip(18L);
        int v8 = b2.v() & UShort.MAX_VALUE;
        b2.skip(b2.v() & 65535);
        if (nVar == null) {
            b2.skip(v8);
            return null;
        }
        d(b2, v8, new j(b2, objectRef, objectRef2, objectRef3));
        return new n(nVar.f3830a, nVar.f3831b, nVar.f3832c, (Long) objectRef3.element, (Long) objectRef.element, (Long) objectRef2.element);
    }
}
