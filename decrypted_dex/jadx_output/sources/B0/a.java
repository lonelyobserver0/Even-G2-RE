package B0;

import android.net.Uri;
import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import t0.C1710j;
import t0.C1711k;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC1708h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1708h f401a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f402b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f403c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f404d;

    public a(InterfaceC1708h interfaceC1708h, byte[] bArr, byte[] bArr2) {
        this.f401a = interfaceC1708h;
        this.f402b = bArr;
        this.f403c = bArr2;
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        if (this.f404d != null) {
            this.f404d = null;
            this.f401a.close();
        }
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        try {
            Cipher cipher = Cipher.getInstance(StubApp.getString2("460"));
            try {
                cipher.init(2, new SecretKeySpec(this.f402b, StubApp.getString2(461)), new IvParameterSpec(this.f403c));
                C1710j c1710j = new C1710j(this.f401a, c1711k);
                this.f404d = new CipherInputStream(c1710j, cipher);
                if (c1710j.f21074d) {
                    return -1L;
                }
                c1710j.f21071a.n(c1710j.f21072b);
                c1710j.f21074d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        this.f404d.getClass();
        int read = this.f404d.read(bArr, i3, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // t0.InterfaceC1708h
    public final Map s() {
        return this.f401a.s();
    }

    @Override // t0.InterfaceC1708h
    public final void y(InterfaceC1726z interfaceC1726z) {
        interfaceC1726z.getClass();
        this.f401a.y(interfaceC1726z);
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f401a.z();
    }
}
