package A3;

import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends G {

    /* renamed from: a, reason: collision with root package name */
    public final long f207a;

    /* renamed from: b, reason: collision with root package name */
    public final long f208b;

    /* renamed from: c, reason: collision with root package name */
    public final n f209c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f210d;

    /* renamed from: e, reason: collision with root package name */
    public final String f211e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f212f;

    public u(long j, long j3, n nVar, Integer num, String str, ArrayList arrayList) {
        K k3 = K.f122a;
        this.f207a = j;
        this.f208b = j3;
        this.f209c = nVar;
        this.f210d = num;
        this.f211e = str;
        this.f212f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        u uVar = (u) ((G) obj);
        if (this.f207a != uVar.f207a) {
            return false;
        }
        if (this.f208b != uVar.f208b) {
            return false;
        }
        if (!this.f209c.equals(uVar.f209c)) {
            return false;
        }
        Integer num = uVar.f210d;
        Integer num2 = this.f210d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = uVar.f211e;
        String str2 = this.f211e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f212f.equals(uVar.f212f)) {
            return false;
        }
        Object obj2 = K.f122a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f207a;
        long j3 = this.f208b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f209c.hashCode()) * 1000003;
        Integer num = this.f210d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f211e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f212f.hashCode()) * 1000003) ^ K.f122a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(331) + this.f207a + StubApp.getString2(332) + this.f208b + StubApp.getString2(333) + this.f209c + StubApp.getString2(334) + this.f210d + StubApp.getString2(335) + this.f211e + StubApp.getString2(336) + this.f212f + StubApp.getString2(337) + K.f122a + StubApp.getString2(265);
    }
}
