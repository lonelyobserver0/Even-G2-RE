package da;

import android.util.Log;
import com.stub.StubApp;
import fa.AbstractC0936b;
import java.io.EOFException;
import java.io.IOException;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C extends H {

    /* renamed from: f, reason: collision with root package name */
    public float f13462f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f13463g;

    @Override // da.H
    public final void a(J j, F f10) {
        String[] strArr;
        this.f13462f = f10.k();
        f10.k();
        f10.A();
        f10.A();
        f10.F();
        f10.F();
        f10.F();
        f10.F();
        f10.F();
        float f11 = this.f13462f;
        int i3 = 0;
        if (f11 == 1.0f) {
            String[] strArr2 = new String[258];
            this.f13463g = strArr2;
            System.arraycopy(M.f13488a, 0, strArr2, 0, 258);
        } else {
            String string2 = StubApp.getString2(948);
            if (f11 == 2.0f) {
                int G4 = f10.G();
                int[] iArr = new int[G4];
                this.f13463g = new String[G4];
                int i10 = Integer.MIN_VALUE;
                for (int i11 = 0; i11 < G4; i11++) {
                    int G10 = f10.G();
                    iArr[i11] = G10;
                    if (G10 <= 32767) {
                        i10 = Math.max(i10, G10);
                    }
                }
                if (i10 >= 258) {
                    int i12 = i10 - 257;
                    strArr = new String[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        int read = f10.read();
                        if (read == -1) {
                            throw new EOFException(StubApp.getString2(17122));
                        }
                        try {
                            strArr[i13] = f10.C(read, AbstractC0936b.f14188a);
                            i13++;
                        } catch (IOException e10) {
                            Log.w(string2, AbstractC1482f.e(i13, StubApp.getString2(17120), i12, StubApp.getString2(11855), StubApp.getString2(17121)), e10);
                            while (i13 < i12) {
                                strArr[i13] = StubApp.getString2(7719);
                                i13++;
                            }
                        }
                    }
                } else {
                    strArr = null;
                }
                while (i3 < G4) {
                    int i14 = iArr[i3];
                    if (i14 >= 0 && i14 < 258) {
                        this.f13463g[i3] = M.f13488a[i14];
                    } else if (i14 < 258 || i14 > 32767) {
                        this.f13463g[i3] = StubApp.getString2(17123);
                    } else {
                        this.f13463g[i3] = strArr[i14 - 258];
                    }
                    i3++;
                }
            } else if (f11 == 2.5f) {
                int A4 = j.A();
                int[] iArr2 = new int[A4];
                int i15 = 0;
                while (i15 < A4) {
                    int read2 = f10.read();
                    if (read2 > 127) {
                        read2 -= 256;
                    }
                    int i16 = i15 + 1;
                    iArr2[i15] = read2 + i16;
                    i15 = i16;
                }
                this.f13463g = new String[A4];
                while (true) {
                    String[] strArr3 = this.f13463g;
                    if (i3 >= strArr3.length) {
                        break;
                    }
                    int i17 = iArr2[i3];
                    if (i17 < 0 || i17 >= 258) {
                        Log.d(string2, StubApp.getString2(17124) + i17 + StubApp.getString2(17125));
                    } else {
                        String str = M.f13488a[i17];
                        if (str != null) {
                            strArr3[i3] = str;
                        }
                    }
                    i3++;
                }
            } else if (f11 == 3.0f) {
                Log.d(string2, StubApp.getString2(17126) + this.f13473e.getName());
            }
        }
        this.f13472d = true;
    }
}
