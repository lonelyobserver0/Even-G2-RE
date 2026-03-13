package A3;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends F {

    /* renamed from: a, reason: collision with root package name */
    public final long f198a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f199b;

    /* renamed from: c, reason: collision with root package name */
    public final o f200c;

    /* renamed from: d, reason: collision with root package name */
    public final long f201d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f202e;

    /* renamed from: f, reason: collision with root package name */
    public final String f203f;

    /* renamed from: g, reason: collision with root package name */
    public final long f204g;

    /* renamed from: h, reason: collision with root package name */
    public final w f205h;

    /* renamed from: i, reason: collision with root package name */
    public final p f206i;

    public t(long j, Integer num, o oVar, long j3, byte[] bArr, String str, long j10, w wVar, p pVar) {
        this.f198a = j;
        this.f199b = num;
        this.f200c = oVar;
        this.f201d = j3;
        this.f202e = bArr;
        this.f203f = str;
        this.f204g = j10;
        this.f205h = wVar;
        this.f206i = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        t tVar = (t) f10;
        if (this.f198a != tVar.f198a) {
            return false;
        }
        Integer num = this.f199b;
        if (num == null) {
            if (tVar.f199b != null) {
                return false;
            }
        } else if (!num.equals(tVar.f199b)) {
            return false;
        }
        o oVar = this.f200c;
        if (oVar == null) {
            if (tVar.f200c != null) {
                return false;
            }
        } else if (!oVar.equals(tVar.f200c)) {
            return false;
        }
        if (this.f201d != tVar.f201d) {
            return false;
        }
        if (!Arrays.equals(this.f202e, f10 instanceof t ? ((t) f10).f202e : tVar.f202e)) {
            return false;
        }
        String str = tVar.f203f;
        String str2 = this.f203f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f204g != tVar.f204g) {
            return false;
        }
        w wVar = tVar.f205h;
        w wVar2 = this.f205h;
        if (wVar2 == null) {
            if (wVar != null) {
                return false;
            }
        } else if (!wVar2.equals(wVar)) {
            return false;
        }
        p pVar = tVar.f206i;
        p pVar2 = this.f206i;
        return pVar2 == null ? pVar == null : pVar2.equals(pVar);
    }

    public final int hashCode() {
        long j = this.f198a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f199b;
        int hashCode = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        o oVar = this.f200c;
        int hashCode2 = (hashCode ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        long j3 = this.f201d;
        int hashCode3 = (((hashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f202e)) * 1000003;
        String str = this.f203f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f204g;
        int i10 = (hashCode4 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        w wVar = this.f205h;
        int hashCode5 = (i10 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        p pVar = this.f206i;
        return hashCode5 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(322) + this.f198a + StubApp.getString2(323) + this.f199b + StubApp.getString2(324) + this.f200c + StubApp.getString2(325) + this.f201d + StubApp.getString2(326) + Arrays.toString(this.f202e) + StubApp.getString2(327) + this.f203f + StubApp.getString2(328) + this.f204g + StubApp.getString2(329) + this.f205h + StubApp.getString2(330) + this.f206i + StubApp.getString2(265);
    }
}
