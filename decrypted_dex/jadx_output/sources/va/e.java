package va;

import Dc.B;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.j;
import oa.o;
import oa.p;
import oa.q;
import qa.C1532c;
import sa.C1610c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class e {
    public static final byte[] j = {115, 65, 108, 84};

    /* renamed from: b, reason: collision with root package name */
    public byte[] f21895b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21897d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21899f;

    /* renamed from: h, reason: collision with root package name */
    public j f21901h;

    /* renamed from: i, reason: collision with root package name */
    public j f21902i;

    /* renamed from: a, reason: collision with root package name */
    public short f21894a = 40;

    /* renamed from: c, reason: collision with root package name */
    public final B f21896c = new B(6);

    /* renamed from: e, reason: collision with root package name */
    public final Set f21898e = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: g, reason: collision with root package name */
    public C1840a f21900g = null;

    public static boolean g(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) {
        int length = bArr.length;
        while (length > 0) {
            int read = byteArrayInputStream.read(bArr, bArr.length - length, length);
            if (read < 0) {
                break;
            }
            length -= read;
        }
        if (r3 == 0) {
            return false;
        }
        if (r3 == bArr.length) {
            return true;
        }
        StringBuilder u2 = Xa.h.u(r3, StubApp.getString2(23691), StubApp.getString2(23692));
        u2.append(bArr.length);
        throw new IOException(u2.toString());
    }

    public final void a(AbstractC1469b abstractC1469b, long j3, long j10) {
        boolean z2 = abstractC1469b instanceof q;
        Set set = this.f21898e;
        if (!z2) {
            if (abstractC1469b instanceof p) {
                if (set.contains(abstractC1469b)) {
                    return;
                }
                set.add(abstractC1469b);
                c((p) abstractC1469b, j3, j10);
                return;
            }
            if (abstractC1469b instanceof C1471d) {
                b((C1471d) abstractC1469b, j3, j10);
                return;
            }
            if (abstractC1469b instanceof C1468a) {
                C1468a c1468a = (C1468a) abstractC1469b;
                for (int i3 = 0; i3 < c1468a.f18393a.size(); i3++) {
                    a(c1468a.d(i3), j3, j10);
                }
                return;
            }
            return;
        }
        if (set.contains(abstractC1469b)) {
            return;
        }
        set.add(abstractC1469b);
        q qVar = (q) abstractC1469b;
        if (j.f18430C1.equals(this.f21902i)) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(qVar.f18640a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d(j3, j10, byteArrayInputStream, byteArrayOutputStream);
            qVar.f18640a = (byte[]) byteArrayOutputStream.toByteArray().clone();
        } catch (IOException e10) {
            Log.e(StubApp.getString2(948), StubApp.getString2(23693) + qVar.f18640a.length + StubApp.getString2(23694) + j3 + StubApp.getString2(994) + e10.getMessage());
        }
    }

    public final void b(C1471d c1471d, long j3, long j10) {
        long j11;
        long j12;
        if (c1471d.O(j.f18486P) != null) {
            return;
        }
        AbstractC1469b J10 = c1471d.J(j.f18621y3);
        boolean z2 = j.f18530c3.equals(J10) || j.f18490Q0.equals(J10) || ((c1471d.J(j.f18592s0) instanceof q) && (c1471d.J(j.f18438E) instanceof C1468a));
        for (Map.Entry entry : c1471d.f18397a.entrySet()) {
            if (!z2 || !j.f18592s0.equals(entry.getKey())) {
                AbstractC1469b abstractC1469b = (AbstractC1469b) entry.getValue();
                if ((abstractC1469b instanceof q) || (abstractC1469b instanceof C1468a) || (abstractC1469b instanceof C1471d)) {
                    j11 = j3;
                    j12 = j10;
                    a(abstractC1469b, j11, j12);
                } else {
                    j11 = j3;
                    j12 = j10;
                }
                j3 = j11;
                j10 = j12;
            }
        }
    }

    public final void c(p pVar, long j3, long j10) {
        if (j.f18430C1.equals(this.f21901h)) {
            return;
        }
        j H2 = pVar.H(j.f18621y3);
        if ((this.f21897d || !j.f18541f2.equals(H2)) && !j.f18478M3.equals(H2)) {
            boolean equals = j.f18541f2.equals(H2);
            String string2 = StubApp.getString2(948);
            if (equals) {
                C1532c a02 = pVar.a0();
                int i3 = 10;
                byte[] bArr = new byte[10];
                while (i3 > 0) {
                    int read = a02.read(bArr, 10 - i3, i3);
                    if (read < 0) {
                        break;
                    } else {
                        i3 -= read;
                    }
                }
                a02.close();
                if (Arrays.equals(bArr, StubApp.getString2(23695).getBytes(Ia.a.f3241d))) {
                    Log.w(string2, StubApp.getString2(23696));
                    Log.w(string2, StubApp.getString2(23697));
                    return;
                }
            }
            b(pVar, j3, j10);
            C1532c a03 = pVar.a0();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            F1.i(a03, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            o b02 = pVar.b0();
            try {
                try {
                    d(j3, j10, byteArrayInputStream, b02);
                } catch (IOException e10) {
                    Log.e(string2, e10.getClass().getSimpleName() + StubApp.getString2("23698") + j3 + StubApp.getString2("397") + j10 + StubApp.getString2("22860"));
                    throw e10;
                }
            } finally {
                b02.close();
            }
        }
    }

    public final void d(long j3, long j10, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) {
        boolean z2 = this.f21899f;
        String string2 = StubApp.getString2(461);
        String string22 = StubApp.getString2(23699);
        if (z2 && this.f21895b.length == 32) {
            byte[] bArr = new byte[16];
            if (g(bArr, byteArrayInputStream, outputStream)) {
                try {
                    byte[] bArr2 = this.f21895b;
                    Cipher cipher = Cipher.getInstance(string22);
                    cipher.init(2, new SecretKeySpec(bArr2, string2), new IvParameterSpec(bArr));
                    CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipher);
                    try {
                        try {
                            F1.i(cipherInputStream, outputStream);
                        } catch (IOException e10) {
                            if (!(e10.getCause() instanceof GeneralSecurityException)) {
                                throw e10;
                            }
                            Log.d(StubApp.getString2("948"), StubApp.getString2("23700"), e10);
                        }
                    } finally {
                        cipherInputStream.close();
                    }
                } catch (GeneralSecurityException e11) {
                    throw new IOException(e11);
                }
            }
        } else {
            byte[] bArr3 = this.f21895b;
            int length = bArr3.length;
            int i3 = length + 5;
            byte[] bArr4 = new byte[i3];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            bArr4[length] = (byte) (j3 & 255);
            bArr4[length + 1] = (byte) ((j3 >> 8) & 255);
            bArr4[length + 2] = (byte) ((j3 >> 16) & 255);
            bArr4[length + 3] = (byte) (j10 & 255);
            bArr4[length + 4] = (byte) ((j10 >> 8) & 255);
            MessageDigest j11 = AbstractC0624h2.j();
            j11.update(bArr4);
            if (this.f21899f) {
                j11.update(j);
            }
            byte[] digest = j11.digest();
            int min = Math.min(i3, 16);
            byte[] bArr5 = new byte[min];
            System.arraycopy(digest, 0, bArr5, 0, min);
            if (this.f21899f) {
                byte[] bArr6 = new byte[16];
                if (g(bArr6, byteArrayInputStream, outputStream)) {
                    try {
                        Cipher cipher2 = Cipher.getInstance(string22);
                        cipher2.init(2, new SecretKeySpec(bArr5, string2), new IvParameterSpec(bArr6));
                        byte[] bArr7 = new byte[256];
                        while (true) {
                            int read = byteArrayInputStream.read(bArr7);
                            if (read == -1) {
                                break;
                            }
                            byte[] update = cipher2.update(bArr7, 0, read);
                            if (update != null) {
                                outputStream.write(update);
                            }
                        }
                        outputStream.write(cipher2.doFinal());
                    } catch (GeneralSecurityException e12) {
                        throw new IOException(e12);
                    }
                }
            } else {
                e(bArr5, byteArrayInputStream, outputStream);
            }
        }
        outputStream.flush();
    }

    public final void e(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) {
        B b2 = this.f21896c;
        b2.h(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = byteArrayInputStream.read(bArr2);
            if (read == -1) {
                return;
            }
            for (int i3 = 0; i3 < read; i3++) {
                b2.i(bArr2[i3], outputStream);
            }
        }
    }

    public final void f(byte[] bArr, byte[] bArr2, ByteArrayOutputStream byteArrayOutputStream) {
        B b2 = this.f21896c;
        b2.h(bArr);
        for (byte b10 : bArr2) {
            b2.i(b10, byteArrayOutputStream);
        }
    }

    public abstract void h(C1610c c1610c, C1468a c1468a, L1 l12);
}
