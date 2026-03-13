package e5;

import com.stub.StubApp;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f13621a;

    /* renamed from: b, reason: collision with root package name */
    public int f13622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f13623c;

    public j(l lVar, i iVar) {
        this.f13623c = lVar;
        this.f13621a = lVar.G(iVar.f13619a + 4);
        this.f13622b = iVar.f13620b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(17306));
        }
        if ((i3 | i10) < 0 || i10 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f13622b;
        if (i11 <= 0) {
            return -1;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = this.f13621a;
        l lVar = this.f13623c;
        lVar.A(i12, i3, bArr, i10);
        this.f13621a = lVar.G(this.f13621a + i10);
        this.f13622b -= i10;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f13622b == 0) {
            return -1;
        }
        l lVar = this.f13623c;
        lVar.f13625a.seek(this.f13621a);
        int read = lVar.f13625a.read();
        this.f13621a = lVar.G(this.f13621a + 1);
        this.f13622b--;
        return read;
    }
}
