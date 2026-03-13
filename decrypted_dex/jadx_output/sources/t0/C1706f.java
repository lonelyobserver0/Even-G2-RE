package t0;

import android.net.Uri;
import android.util.Base64;
import com.stub.StubApp;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import o0.C1406C;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1706f extends AbstractC1703c {

    /* renamed from: e, reason: collision with root package name */
    public C1711k f21065e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f21066f;

    /* renamed from: g, reason: collision with root package name */
    public int f21067g;

    /* renamed from: h, reason: collision with root package name */
    public int f21068h;

    @Override // t0.InterfaceC1708h
    public final void close() {
        if (this.f21066f != null) {
            this.f21066f = null;
            d();
        }
        this.f21065e = null;
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        g();
        this.f21065e = c1711k;
        Uri normalizeScheme = c1711k.f21077a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC1550k.b(StubApp.getString2(23386) + scheme, StubApp.getString2(1485).equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i3 = AbstractC1560u.f20190a;
        String[] split = schemeSpecificPart.split(StubApp.getString2(321), -1);
        if (split.length != 2) {
            throw new C1406C(StubApp.getString2(23389) + normalizeScheme, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(StubApp.getString2(23387))) {
            try {
                this.f21066f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new C1406C(E1.a.j(StubApp.getString2(23388), str), e10, true, 0);
            }
        } else {
            this.f21066f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f21066f;
        long length = bArr.length;
        long j = c1711k.f21081e;
        if (j > length) {
            this.f21066f = null;
            throw new C1709i(2008);
        }
        int i10 = (int) j;
        this.f21067g = i10;
        int length2 = bArr.length - i10;
        this.f21068h = length2;
        long j3 = c1711k.f21082f;
        if (j3 != -1) {
            this.f21068h = (int) Math.min(length2, j3);
        }
        j(c1711k);
        return j3 != -1 ? j3 : this.f21068h;
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f21068h;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.f21066f;
        int i12 = AbstractC1560u.f20190a;
        System.arraycopy(bArr2, this.f21067g, bArr, i3, min);
        this.f21067g += min;
        this.f21068h -= min;
        a(min);
        return min;
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        C1711k c1711k = this.f21065e;
        if (c1711k != null) {
            return c1711k.f21077a;
        }
        return null;
    }
}
