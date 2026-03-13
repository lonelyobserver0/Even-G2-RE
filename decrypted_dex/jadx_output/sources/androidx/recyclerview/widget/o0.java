package androidx.recyclerview.widget;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10262a;

    /* renamed from: b, reason: collision with root package name */
    public int f10263b;

    /* renamed from: c, reason: collision with root package name */
    public int f10264c;

    /* renamed from: d, reason: collision with root package name */
    public int f10265d;

    /* renamed from: e, reason: collision with root package name */
    public int f10266e;

    /* renamed from: f, reason: collision with root package name */
    public int f10267f;

    public /* synthetic */ o0() {
        this.f10262a = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static o0 b(String str) {
        char c10;
        AbstractC1550k.c(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i3 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < split.length; i13++) {
            String y10 = AbstractC0624h2.y(split[i13].trim());
            y10.getClass();
            switch (y10.hashCode()) {
                case 100571:
                    if (y10.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (y10.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (y10.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (y10.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = i13;
                    break;
                case 1:
                    i12 = i13;
                    break;
                case 2:
                    i3 = i13;
                    break;
                case 3:
                    i11 = i13;
                    break;
            }
        }
        if (i3 == -1 || i10 == -1 || i12 == -1) {
            return null;
        }
        return new o0(i3, i10, i11, i12, split.length);
    }

    public boolean a() {
        int i3 = this.f10263b;
        int i10 = 2;
        if ((i3 & 7) != 0) {
            int i11 = this.f10266e;
            int i12 = this.f10264c;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 112) != 0) {
            int i13 = this.f10266e;
            int i14 = this.f10265d;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 1792) != 0) {
            int i15 = this.f10267f;
            int i16 = this.f10264c;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 28672) != 0) {
            int i17 = this.f10267f;
            int i18 = this.f10265d;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i3 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean c(int i3) {
        if (i3 != -1) {
            return this.f10265d == (i3 % 3) * 3;
        }
        return false;
    }

    public void d() {
        this.f10267f = (this.f10265d / 3) + ((this.f10266e / 30) * 3);
    }

    public String toString() {
        switch (this.f10262a) {
            case 2:
                return this.f10267f + "|" + this.f10266e;
            default:
                return super.toString();
        }
    }

    public o0(int i3, int i10, int i11, int i12, int i13, byte b2) {
        this.f10262a = i13;
        switch (i13) {
            case 2:
                this.f10267f = -1;
                this.f10263b = i3;
                this.f10264c = i10;
                this.f10265d = i11;
                this.f10266e = i12;
                break;
            default:
                this.f10263b = i3;
                this.f10264c = i12;
                this.f10265d = i10;
                this.f10266e = i11;
                this.f10267f = i10 + i11;
                break;
        }
    }

    public o0(int i3, int i10, int i11, int i12, int i13) {
        this.f10262a = 3;
        this.f10263b = i3;
        this.f10264c = i10;
        this.f10265d = i11;
        this.f10266e = i12;
        this.f10267f = i13;
    }
}
