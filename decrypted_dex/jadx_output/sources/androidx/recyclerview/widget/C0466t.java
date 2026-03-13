package androidx.recyclerview.widget;

import android.view.View;
import java.util.Arrays;
import r0.AbstractC1550k;

/* renamed from: androidx.recyclerview.widget.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0466t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10296a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10297b;

    /* renamed from: c, reason: collision with root package name */
    public int f10298c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10299d;

    /* renamed from: e, reason: collision with root package name */
    public int f10300e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10301f;

    public C0466t(int i3) {
        this.f10298c = i3;
        byte[] bArr = new byte[131];
        this.f10301f = bArr;
        bArr[2] = 1;
    }

    public void a(int i3, int i10, byte[] bArr) {
        if (this.f10297b) {
            int i11 = i10 - i3;
            byte[] bArr2 = (byte[]) this.f10301f;
            int length = bArr2.length;
            int i12 = this.f10300e;
            if (length < i12 + i11) {
                this.f10301f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i3, (byte[]) this.f10301f, this.f10300e, i11);
            this.f10300e += i11;
        }
    }

    public void b() {
        this.f10300e = this.f10297b ? ((Y.e) this.f10301f).g() : ((Y.e) this.f10301f).k();
    }

    public void c(View view, int i3) {
        if (this.f10297b) {
            int b2 = ((Y.e) this.f10301f).b(view);
            Y.e eVar = (Y.e) this.f10301f;
            this.f10300e = (Integer.MIN_VALUE == eVar.f8655a ? 0 : eVar.l() - eVar.f8655a) + b2;
        } else {
            this.f10300e = ((Y.e) this.f10301f).e(view);
        }
        this.f10298c = i3;
    }

    public void d(View view, int i3) {
        Y.e eVar = (Y.e) this.f10301f;
        int l9 = Integer.MIN_VALUE == eVar.f8655a ? 0 : eVar.l() - eVar.f8655a;
        if (l9 >= 0) {
            c(view, i3);
            return;
        }
        this.f10298c = i3;
        if (!this.f10297b) {
            int e10 = ((Y.e) this.f10301f).e(view);
            int k3 = e10 - ((Y.e) this.f10301f).k();
            this.f10300e = e10;
            if (k3 > 0) {
                int g10 = (((Y.e) this.f10301f).g() - Math.min(0, (((Y.e) this.f10301f).g() - l9) - ((Y.e) this.f10301f).b(view))) - (((Y.e) this.f10301f).c(view) + e10);
                if (g10 < 0) {
                    this.f10300e -= Math.min(k3, -g10);
                    return;
                }
                return;
            }
            return;
        }
        int g11 = (((Y.e) this.f10301f).g() - l9) - ((Y.e) this.f10301f).b(view);
        this.f10300e = ((Y.e) this.f10301f).g() - g11;
        if (g11 > 0) {
            int c10 = this.f10300e - ((Y.e) this.f10301f).c(view);
            int k4 = ((Y.e) this.f10301f).k();
            int min = c10 - (Math.min(((Y.e) this.f10301f).e(view) - k4, 0) + k4);
            if (min < 0) {
                this.f10300e = Math.min(g11, -min) + this.f10300e;
            }
        }
    }

    public boolean e(int i3) {
        if (!this.f10297b) {
            return false;
        }
        this.f10300e -= i3;
        this.f10297b = false;
        this.f10299d = true;
        return true;
    }

    public void f(int i3) {
        this.f10297b |= i3 > 0;
        this.f10298c += i3;
    }

    public void g() {
        switch (this.f10296a) {
            case 0:
                this.f10298c = -1;
                this.f10300e = Integer.MIN_VALUE;
                this.f10297b = false;
                this.f10299d = false;
                break;
            default:
                this.f10297b = false;
                this.f10299d = false;
                break;
        }
    }

    public void h(int i3) {
        AbstractC1550k.g(!this.f10297b);
        boolean z2 = i3 == this.f10298c;
        this.f10297b = z2;
        if (z2) {
            this.f10300e = 3;
            this.f10299d = false;
        }
    }

    public String toString() {
        switch (this.f10296a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f10298c + ", mCoordinate=" + this.f10300e + ", mLayoutFromEnd=" + this.f10297b + ", mValid=" + this.f10299d + '}';
            default:
                return super.toString();
        }
    }

    public C0466t(v0.W w10) {
        this.f10301f = w10;
    }

    public C0466t() {
        g();
    }
}
