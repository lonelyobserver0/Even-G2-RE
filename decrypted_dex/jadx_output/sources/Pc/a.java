package Pc;

import Qc.c;
import Qc.g;
import com.stub.StubApp;
import f5.u0;
import java.util.TimeZone;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final c f5649f = new c(4, b.f5657b);

    /* renamed from: g, reason: collision with root package name */
    public static final TimeZone f5650g = TimeZone.getTimeZone(StubApp.getString2(8779));

    /* renamed from: a, reason: collision with root package name */
    public final g f5651a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeZone f5652b;

    /* renamed from: c, reason: collision with root package name */
    public long f5653c;

    /* renamed from: d, reason: collision with root package name */
    public long f5654d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5655e;

    public a(long j) {
        this(f5649f, f5650g, j);
    }

    public static a b(c cVar, String str) {
        String string2 = StubApp.getString2(620);
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(25437));
        }
        try {
            if (str.length() == 8) {
                return new a(cVar, c(2, str) + (c(0, str) * 100), c(4, str) - 1, c(6, str));
            }
            if (str.length() == 15 && str.charAt(8) == 'T') {
                return new a(cVar, null, c(2, str) + (c(0, str) * 100), c(4, str) - 1, c(6, str), c(9, str), c(11, str), c(13, str));
            }
            if (str.length() != 16 || str.charAt(8) != 'T' || str.charAt(15) != 'Z') {
                throw new IllegalArgumentException(E1.a.k(StubApp.getString2(25435), str, string2));
            }
            return new a(cVar, f5650g, c(2, str) + (c(0, str) * 100), c(4, str) - 1, c(6, str), c(9, str), c(11, str), c(13, str));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(E1.a.k(StubApp.getString2(25436), str, string2), e10);
        }
    }

    public static int c(int i3, String str) {
        int charAt = str.charAt(i3) - '0';
        int charAt2 = str.charAt(i3 + 1) - '0';
        if (charAt >= 0 && charAt2 >= 0 && charAt <= 9 && charAt2 <= 9) {
            return (charAt * 10) + charAt2;
        }
        throw new NumberFormatException(StubApp.getString2(25438) + str.substring(i3, 2));
    }

    public static boolean d(TimeZone timeZone, TimeZone timeZone2) {
        if (timeZone == timeZone2) {
            return true;
        }
        String id = timeZone != null ? timeZone.getID() : null;
        TimeZone timeZone3 = f5650g;
        String string2 = StubApp.getString2(8779);
        if (timeZone2 == null && (string2.equals(id) || timeZone3.equals(timeZone) || timeZone3.hasSameRules(timeZone))) {
            return true;
        }
        String id2 = timeZone2 != null ? timeZone2.getID() : null;
        if (timeZone == null && (string2.equals(id2) || timeZone3.equals(timeZone2) || timeZone3.hasSameRules(timeZone2))) {
            return true;
        }
        if (timeZone == null || timeZone2 == null) {
            return false;
        }
        return id.equals(id2) || timeZone.equals(timeZone2) || timeZone.hasSameRules(timeZone2);
    }

    public final long a() {
        long j = this.f5653c;
        if (j != LongCompanionObject.MAX_VALUE) {
            return j;
        }
        long j3 = this.f5654d;
        if (j3 == LongCompanionObject.MAX_VALUE) {
            j3 = this.f5651a.c(j, this.f5652b);
            this.f5654d = j3;
        }
        long d8 = this.f5651a.d(this.f5652b, (int) ((18014329790005248L & j3) >>> 36), (int) ((68451041280L & j3) >>> 28), u0.i(j3), (int) ((2031616 & j3) >>> 16), (int) ((64512 & j3) >>> 10), (int) ((1008 & j3) >>> 4));
        this.f5653c = d8;
        return d8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            long j = this.f5654d;
            TimeZone timeZone = this.f5652b;
            g gVar = this.f5651a;
            boolean z2 = this.f5655e;
            if (j != LongCompanionObject.MAX_VALUE) {
                long j3 = aVar.f5654d;
                if (j3 != LongCompanionObject.MAX_VALUE) {
                    if (j != j3 || z2 != aVar.f5655e || gVar.getClass() != aVar.f5651a.getClass()) {
                        return false;
                    }
                    TimeZone timeZone2 = aVar.f5652b;
                    if (timeZone == timeZone2) {
                        return true;
                    }
                    if (timeZone != null && timeZone2 != null && d(timeZone, timeZone2)) {
                        return true;
                    }
                }
            }
            if (z2 == aVar.f5655e && gVar.getClass() == aVar.f5651a.getClass() && a() == aVar.a()) {
                TimeZone timeZone3 = aVar.f5652b;
                if (timeZone == timeZone3) {
                    return true;
                }
                if (timeZone != null && timeZone3 != null && d(timeZone, timeZone3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) a();
    }

    public final String toString() {
        long j = this.f5654d;
        TimeZone timeZone = this.f5652b;
        if (j == LongCompanionObject.MAX_VALUE) {
            j = this.f5651a.c(this.f5653c, timeZone);
            this.f5654d = j;
        }
        StringBuilder sb2 = new StringBuilder(16);
        int i3 = (int) ((18014329790005248L & j) >>> 36);
        u0.B(sb2, i3 / 100);
        u0.B(sb2, i3 % 100);
        u0.B(sb2, ((int) ((68451041280L & j) >>> 28)) + 1);
        u0.B(sb2, u0.i(j));
        boolean z2 = this.f5655e;
        if (!z2) {
            sb2.append('T');
            u0.B(sb2, (int) ((2031616 & j) >>> 16));
            u0.B(sb2, (int) ((64512 & j) >>> 10));
            u0.B(sb2, (int) ((j & 1008) >>> 4));
        }
        if (!z2 && timeZone != null && StubApp.getString2(8779).equals(timeZone.getID())) {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public a(c cVar, int i3, int i10, int i11) {
        this.f5653c = LongCompanionObject.MAX_VALUE;
        this.f5654d = LongCompanionObject.MAX_VALUE;
        this.f5651a = cVar;
        this.f5654d = u0.r(i3, i10, i11, 0, 0, 0);
        this.f5652b = null;
        this.f5655e = true;
    }

    public a(c cVar, TimeZone timeZone, int i3, int i10, int i11, int i12, int i13, int i14) {
        this.f5653c = LongCompanionObject.MAX_VALUE;
        this.f5654d = LongCompanionObject.MAX_VALUE;
        this.f5651a = cVar;
        this.f5654d = u0.r(i3, i10, i11, i12, i13, i14);
        this.f5652b = timeZone;
        this.f5655e = false;
    }

    public a(c cVar, TimeZone timeZone, long j) {
        this.f5654d = LongCompanionObject.MAX_VALUE;
        this.f5651a = cVar;
        this.f5653c = j;
        this.f5652b = timeZone;
        this.f5655e = false;
    }

    public a(g gVar, a aVar) {
        this.f5653c = LongCompanionObject.MAX_VALUE;
        this.f5654d = LongCompanionObject.MAX_VALUE;
        this.f5651a = gVar;
        this.f5653c = aVar.a();
        this.f5652b = aVar.f5652b;
        this.f5655e = aVar.f5655e;
    }
}
