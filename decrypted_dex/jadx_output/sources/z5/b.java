package z5;

import Bc.i;
import com.stub.StubApp;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f24112a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24114c;

    public b(long j, String str, int i3) {
        this.f24112a = str;
        this.f24113b = j;
        this.f24114c = i3;
    }

    public static i a() {
        i iVar = new i(18, (byte) 0);
        iVar.f767c = 0L;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f24112a;
        if (str == null) {
            if (bVar.f24112a != null) {
                return false;
            }
        } else if (!str.equals(bVar.f24112a)) {
            return false;
        }
        if (this.f24113b != bVar.f24113b) {
            return false;
        }
        int i3 = bVar.f24114c;
        int i10 = this.f24114c;
        return i10 == 0 ? i3 == 0 : AbstractC1856e.a(i10, i3);
    }

    public final int hashCode() {
        String str = this.f24112a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f24113b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i10 = this.f24114c;
        return (i10 != 0 ? AbstractC1856e.c(i10) : 0) ^ i3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24905));
        sb2.append(this.f24112a);
        sb2.append(StubApp.getString2(24156));
        sb2.append(this.f24113b);
        sb2.append(StubApp.getString2(24903));
        int i3 = this.f24114c;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? StubApp.getString2(1116) : StubApp.getString2(24906) : StubApp.getString2(24904) : StubApp.getString2(421));
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
