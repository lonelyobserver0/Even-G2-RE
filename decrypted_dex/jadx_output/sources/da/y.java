package da;

import android.util.Log;
import com.stub.StubApp;
import fa.AbstractC0936b;
import java.io.EOFException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y extends H {

    /* renamed from: f, reason: collision with root package name */
    public int f13548f;

    /* renamed from: g, reason: collision with root package name */
    public int f13549g;

    /* renamed from: h, reason: collision with root package name */
    public int f13550h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f13551i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f13552k;

    @Override // da.H
    public final void a(J j, F f10) {
        String string2 = StubApp.getString2(948);
        this.f13548f = f10.G();
        f10.A();
        this.f13549g = f10.G();
        f10.G();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        f10.A();
        this.f13550h = f10.A();
        this.f13551i = f10.h(10);
        f10.F();
        f10.F();
        f10.F();
        f10.F();
        f10.C(4, AbstractC0936b.f14188a);
        f10.G();
        f10.G();
        f10.G();
        try {
            f10.A();
            f10.A();
            f10.A();
            f10.G();
            f10.G();
            if (this.f13548f >= 1) {
                try {
                    this.j = f10.F();
                    this.f13552k = f10.F();
                } catch (EOFException e10) {
                    this.f13548f = 0;
                    Log.w(string2, StubApp.getString2(17238), e10);
                    this.f13472d = true;
                    return;
                }
            }
            if (this.f13548f >= 2) {
                try {
                    f10.A();
                    f10.A();
                    f10.G();
                    f10.G();
                    f10.G();
                } catch (EOFException e11) {
                    this.f13548f = 1;
                    Log.w(string2, StubApp.getString2(17239), e11);
                    this.f13472d = true;
                    return;
                }
            }
            this.f13472d = true;
        } catch (EOFException unused) {
            Log.d(string2, StubApp.getString2(17240));
            this.f13472d = true;
        }
    }
}
