package B3;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f619a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f620b;

    /* renamed from: c, reason: collision with root package name */
    public final m f621c;

    /* renamed from: d, reason: collision with root package name */
    public final long f622d;

    /* renamed from: e, reason: collision with root package name */
    public final long f623e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f624f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f625g;

    /* renamed from: h, reason: collision with root package name */
    public final String f626h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f627i;
    public final byte[] j;

    public i(String str, Integer num, m mVar, long j, long j3, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f619a = str;
        this.f620b = num;
        this.f621c = mVar;
        this.f622d = j;
        this.f623e = j3;
        this.f624f = hashMap;
        this.f625g = num2;
        this.f626h = str2;
        this.f627i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f624f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f624f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f619a;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(571));
        }
        hVar.f610a = str;
        hVar.f612c = this.f620b;
        hVar.f613d = this.f625g;
        hVar.f611b = this.f626h;
        hVar.f618i = this.f627i;
        hVar.j = this.j;
        m mVar = this.f621c;
        if (mVar == null) {
            throw new NullPointerException(StubApp.getString2(570));
        }
        hVar.f614e = mVar;
        hVar.f615f = Long.valueOf(this.f622d);
        hVar.f616g = Long.valueOf(this.f623e);
        hVar.f617h = new HashMap(this.f624f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f619a.equals(iVar.f619a)) {
            return false;
        }
        Integer num = iVar.f620b;
        Integer num2 = this.f620b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.f621c.equals(iVar.f621c) || this.f622d != iVar.f622d || this.f623e != iVar.f623e || !this.f624f.equals(iVar.f624f)) {
            return false;
        }
        Integer num3 = iVar.f625g;
        Integer num4 = this.f625g;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = iVar.f626h;
        String str2 = this.f626h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return Arrays.equals(this.f627i, iVar.f627i) && Arrays.equals(this.j, iVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.f619a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f620b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f621c.hashCode()) * 1000003;
        long j = this.f622d;
        int i3 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f623e;
        int hashCode3 = (((i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f624f.hashCode()) * 1000003;
        Integer num2 = this.f625g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f626h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f627i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return StubApp.getString2(572) + this.f619a + StubApp.getString2(573) + this.f620b + StubApp.getString2(574) + this.f621c + StubApp.getString2(575) + this.f622d + StubApp.getString2(576) + this.f623e + StubApp.getString2(577) + this.f624f + StubApp.getString2(578) + this.f625g + StubApp.getString2(579) + this.f626h + StubApp.getString2(580) + Arrays.toString(this.f627i) + StubApp.getString2(581) + Arrays.toString(this.j) + StubApp.getString2(265);
    }
}
