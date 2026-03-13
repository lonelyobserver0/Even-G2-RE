package P3;

import H0.A;
import H0.B;
import N5.o;
import android.content.Context;
import android.net.Uri;
import android.os.HandlerThread;
import android.util.Base64;
import android.util.Log;
import androidx.recyclerview.widget.o0;
import com.stub.StubApp;
import g6.C0957b;
import g6.C0959d;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o0.C1406C;
import q4.s;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static m f5526f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5527a;

    /* renamed from: b, reason: collision with root package name */
    public int f5528b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5529c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5530d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5531e;

    public m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5527a = 0;
        this.f5531e = new k(this);
        this.f5528b = 1;
        this.f5530d = scheduledExecutorService;
        this.f5529c = StubApp.getOrigApplicationContext(context.getApplicationContext());
    }

    public static synchronized m d(Context context) {
        m mVar;
        synchronized (m.class) {
            try {
                if (f5526f == null) {
                    f5526f = new m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new X3.a(StubApp.getString2("3016")))));
                }
                mVar = f5526f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public void a(Y.m mVar) {
        if (mVar != null) {
            C0959d c0959d = (C0959d) mVar;
            o0[] o0VarArr = (o0[]) c0959d.f8675c;
            for (o0 o0Var : o0VarArr) {
                if (o0Var != null) {
                    o0Var.d();
                }
            }
            o0 o0Var2 = (o0) this.f5529c;
            c0959d.B(o0VarArr, o0Var2);
            C0957b c0957b = (C0957b) c0959d.f8674b;
            boolean z2 = c0959d.f14231d;
            o oVar = z2 ? c0957b.f14220b : c0957b.f14222d;
            o oVar2 = z2 ? c0957b.f14221c : c0957b.f14223e;
            int p8 = c0959d.p((int) oVar.f4927b);
            int p9 = c0959d.p((int) oVar2.f4927b);
            int i3 = -1;
            int i10 = 0;
            int i11 = 1;
            while (p8 < p9) {
                o0 o0Var3 = o0VarArr[p8];
                if (o0Var3 != null) {
                    int i12 = o0Var3.f10267f;
                    int i13 = i12 - i3;
                    if (i13 == 0) {
                        i10++;
                    } else {
                        if (i13 == 1) {
                            i11 = Math.max(i11, i10);
                            i3 = o0Var3.f10267f;
                        } else if (i13 < 0 || i12 >= o0Var2.f10267f || i13 > p8) {
                            o0VarArr[p8] = null;
                        } else {
                            if (i11 > 2) {
                                i13 *= i11 - 2;
                            }
                            boolean z10 = i13 >= p8;
                            for (int i14 = 1; i14 <= i13 && !z10; i14++) {
                                z10 = o0VarArr[p8 - i14] != null;
                            }
                            if (z10) {
                                o0VarArr[p8] = null;
                            } else {
                                i3 = o0Var3.f10267f;
                            }
                        }
                        i10 = 1;
                    }
                }
                p8++;
            }
        }
    }

    public String b(C2.a aVar, Uri uri, int i3) {
        String string2 = StubApp.getString2(478);
        int i10 = this.f5528b;
        if (i10 == 1) {
            String encodeToString = Base64.encodeToString((aVar.f1045a + string2 + aVar.f1046b).getBytes(A.f2463g), 0);
            int i11 = AbstractC1560u.f20190a;
            Locale locale = Locale.US;
            return E1.a.j(StubApp.getString2(4897), encodeToString);
        }
        if (i10 != 2) {
            throw new C1406C(null, new UnsupportedOperationException(), false, 4);
        }
        String str = (String) this.f5530d;
        String str2 = (String) this.f5529c;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(StubApp.getString2("4894"));
            String h2 = B.h(i3);
            String str3 = aVar.f1045a + string2 + str2 + string2 + aVar.f1046b;
            Charset charset = A.f2463g;
            String U5 = AbstractC1560u.U(messageDigest.digest((AbstractC1560u.U(messageDigest.digest(str3.getBytes(charset))) + string2 + str + string2 + AbstractC1560u.U(messageDigest.digest((h2 + string2 + uri).getBytes(charset)))).getBytes(charset)));
            String str4 = (String) this.f5531e;
            if (str4.isEmpty()) {
                return String.format(Locale.US, StubApp.getString2("4895"), aVar.f1045a, str2, str, uri, U5);
            }
            return String.format(Locale.US, StubApp.getString2("4896"), aVar.f1045a, str2, str, uri, U5, str4);
        } catch (NoSuchAlgorithmException e10) {
            throw new C1406C(null, e10, false, 4);
        }
    }

    public void c() {
        HandlerThread handlerThread;
        synchronized (this.f5529c) {
            try {
                AbstractC1550k.g(this.f5528b > 0);
                int i3 = this.f5528b - 1;
                this.f5528b = i3;
                if (i3 == 0 && (handlerThread = (HandlerThread) this.f5531e) != null) {
                    handlerThread.quit();
                    this.f5531e = null;
                    this.f5530d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized s e(l lVar) {
        try {
            if (Log.isLoggable(StubApp.getString2("3016"), 3)) {
                Log.d(StubApp.getString2("3016"), StubApp.getString2("4898").concat(lVar.toString()));
            }
            if (!((k) this.f5531e).d(lVar)) {
                k kVar = new k(this);
                this.f5531e = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.f5522b.f20051a;
    }

    public String toString() {
        switch (this.f5527a) {
            case 2:
                Y.m[] mVarArr = (Y.m[]) this.f5530d;
                Y.m mVar = mVarArr[0];
                int i3 = this.f5528b;
                if (mVar == null) {
                    mVar = mVarArr[i3 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i10 = 0; i10 < ((o0[]) mVar.f8675c).length; i10++) {
                    try {
                        formatter.format(StubApp.getString2("4899"), Integer.valueOf(i10));
                        for (int i11 = 0; i11 < i3 + 2; i11++) {
                            Y.m mVar2 = mVarArr[i11];
                            if (mVar2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                o0 o0Var = ((o0[]) mVar2.f8675c)[i10];
                                if (o0Var == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(StubApp.getString2("4900"), Integer.valueOf(o0Var.f10267f), Integer.valueOf(o0Var.f10266e));
                                }
                            }
                        }
                        formatter.format(StubApp.getString2("4901"), new Object[0]);
                    } catch (Throwable th) {
                        try {
                            formatter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                String formatter2 = formatter.toString();
                formatter.close();
                return formatter2;
            default:
                return super.toString();
        }
    }

    public m(o0 o0Var, C0957b c0957b) {
        this.f5527a = 2;
        this.f5529c = o0Var;
        int i3 = o0Var.f10263b;
        this.f5528b = i3;
        this.f5531e = c0957b;
        this.f5530d = new Y.m[i3 + 2];
    }

    public m(int i3) {
        this.f5527a = i3;
        switch (i3) {
            case 4:
                this.f5529c = new Object();
                this.f5530d = null;
                this.f5531e = null;
                this.f5528b = 0;
                break;
        }
    }

    public m(String str, int i3, String str2, String str3) {
        this.f5527a = 1;
        this.f5528b = i3;
        this.f5529c = str;
        this.f5530d = str2;
        this.f5531e = str3;
    }
}
