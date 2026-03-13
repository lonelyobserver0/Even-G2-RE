package g6;

import Y.m;
import androidx.recyclerview.widget.o0;
import com.stub.StubApp;

/* renamed from: g6.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0959d extends m {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14231d;

    public C0959d(C0957b c0957b, boolean z2) {
        super(c0957b);
        this.f14231d = z2;
    }

    public final o0 A() {
        C0956a c0956a = new C0956a();
        C0956a c0956a2 = new C0956a();
        C0956a c0956a3 = new C0956a();
        C0956a c0956a4 = new C0956a();
        o0[] o0VarArr = (o0[]) this.f8675c;
        for (o0 o0Var : o0VarArr) {
            if (o0Var != null) {
                o0Var.d();
                int i3 = o0Var.f10266e % 30;
                int i10 = o0Var.f10267f;
                if (!this.f14231d) {
                    i10 += 2;
                }
                int i11 = i10 % 3;
                if (i11 == 0) {
                    c0956a2.b((i3 * 3) + 1);
                } else if (i11 == 1) {
                    c0956a4.b(i3 / 3);
                    c0956a3.b(i3 % 3);
                } else if (i11 == 2) {
                    c0956a.b(i3 + 1);
                }
            }
        }
        if (c0956a.a().length == 0 || c0956a2.a().length == 0 || c0956a3.a().length == 0 || c0956a4.a().length == 0 || c0956a.a()[0] < 1 || c0956a2.a()[0] + c0956a3.a()[0] < 3 || c0956a2.a()[0] + c0956a3.a()[0] > 90) {
            return null;
        }
        o0 o0Var2 = new o0(c0956a.a()[0], c0956a2.a()[0], c0956a3.a()[0], c0956a4.a()[0], 1, (byte) 0);
        B(o0VarArr, o0Var2);
        return o0Var2;
    }

    public final void B(o0[] o0VarArr, o0 o0Var) {
        for (int i3 = 0; i3 < o0VarArr.length; i3++) {
            o0 o0Var2 = o0VarArr[i3];
            if (o0Var2 != null) {
                int i10 = o0Var2.f10266e % 30;
                int i11 = o0Var2.f10267f;
                if (i11 > o0Var.f10267f) {
                    o0VarArr[i3] = null;
                } else {
                    if (!this.f14231d) {
                        i11 += 2;
                    }
                    int i12 = i11 % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2 && i10 + 1 != o0Var.f10263b) {
                                o0VarArr[i3] = null;
                            }
                        } else if (i10 / 3 != o0Var.f10264c || i10 % 3 != o0Var.f10266e) {
                            o0VarArr[i3] = null;
                        }
                    } else if ((i10 * 3) + 1 != o0Var.f10265d) {
                        o0VarArr[i3] = null;
                    }
                }
            }
        }
    }

    @Override // Y.m
    public final String toString() {
        return StubApp.getString2(17806) + this.f14231d + '\n' + super.toString();
    }
}
