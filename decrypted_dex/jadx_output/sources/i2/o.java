package i2;

import android.content.Context;
import android.util.Log;
import android.view.KeyCharacterMap;
import com.stub.StubApp;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o implements a4.b {

    /* renamed from: b, reason: collision with root package name */
    public static o f14745b;

    /* renamed from: a, reason: collision with root package name */
    public int f14746a;

    public /* synthetic */ o(int i3) {
        this.f14746a = i3;
    }

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f14745b == null) {
                    f14745b = new o(3);
                }
                oVar = f14745b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(StubApp.getString2(18476));
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public Character a(int i3) {
        char c10 = (char) i3;
        if ((Integer.MIN_VALUE & i3) != 0) {
            int i10 = i3 & IntCompanionObject.MAX_VALUE;
            int i11 = this.f14746a;
            if (i11 != 0) {
                this.f14746a = KeyCharacterMap.getDeadChar(i11, i10);
            } else {
                this.f14746a = i10;
            }
        } else {
            int i12 = this.f14746a;
            if (i12 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i12, i3);
                if (deadChar > 0) {
                    c10 = (char) deadChar;
                }
                this.f14746a = 0;
            }
        }
        return Character.valueOf(c10);
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f14746a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // a4.b
    public int c(Context context, String str, boolean z2) {
        return 0;
    }

    public void d(String str, String str2, Throwable... thArr) {
        if (this.f14746a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.f14746a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.f14746a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // a4.b
    public int j(Context context, String str) {
        return this.f14746a;
    }

    public o() {
        this.f14746a = 0;
    }
}
