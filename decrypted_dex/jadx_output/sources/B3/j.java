package B3;

import android.util.Base64;
import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f628a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f629b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.d f630c;

    public j(String str, byte[] bArr, y3.d dVar) {
        this.f628a = str;
        this.f629b = bArr;
        this.f630c = dVar;
    }

    public static Q2.g a() {
        Q2.g gVar = new Q2.g(1, (char) 0);
        gVar.f5713d = y3.d.f23506a;
        return gVar;
    }

    public final j b(y3.d dVar) {
        Q2.g a3 = a();
        a3.T(this.f628a);
        if (dVar == null) {
            throw new NullPointerException(StubApp.getString2(582));
        }
        a3.f5713d = dVar;
        a3.f5712c = this.f629b;
        return a3.u();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f628a.equals(jVar.f628a) && Arrays.equals(this.f629b, jVar.f629b) && this.f630c.equals(jVar.f630c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f628a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f629b)) * 1000003) ^ this.f630c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f629b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(583));
        sb2.append(this.f628a);
        String string2 = StubApp.getString2(81);
        sb2.append(string2);
        sb2.append(this.f630c);
        sb2.append(string2);
        sb2.append(encodeToString);
        sb2.append(StubApp.getString2(74));
        return sb2.toString();
    }
}
