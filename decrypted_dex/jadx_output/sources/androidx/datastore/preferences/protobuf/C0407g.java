package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.F1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p0.AbstractC1482f;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0407g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0407g f9780c = new C0407g(AbstractC0422w.f9853b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0405e f9781d;

    /* renamed from: a, reason: collision with root package name */
    public int f9782a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9783b;

    static {
        f9781d = AbstractC0403c.a() ? new C0405e(1) : new C0405e(0);
    }

    public C0407g(byte[] bArr) {
        bArr.getClass();
        this.f9783b = bArr;
    }

    public static int b(int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if ((i3 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(Xa.h.g(i3, "Beginning index: ", " < 0"));
        }
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(Xa.h.o("Beginning index larger than ending index: ", i3, i10, ", "));
        }
        throw new IndexOutOfBoundsException(Xa.h.o("End index: ", i10, i11, " >= "));
    }

    public static C0407g c(int i3, int i10, byte[] bArr) {
        byte[] copyOfRange;
        b(i3, i3 + i10, bArr.length);
        switch (f9781d.f9776a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i10 + i3);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i3, copyOfRange, 0, i10);
                break;
        }
        return new C0407g(copyOfRange);
    }

    public byte a(int i3) {
        return this.f9783b[i3];
    }

    public void d(int i3, byte[] bArr) {
        System.arraycopy(this.f9783b, 0, bArr, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0407g) || size() != ((C0407g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0407g)) {
            return obj.equals(this);
        }
        C0407g c0407g = (C0407g) obj;
        int i3 = this.f9782a;
        int i10 = c0407g.f9782a;
        if (i3 != 0 && i10 != 0 && i3 != i10) {
            return false;
        }
        int size = size();
        if (size > c0407g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0407g.size()) {
            StringBuilder u2 = Xa.h.u(size, "Ran off end of other: 0, ", ", ");
            u2.append(c0407g.size());
            throw new IllegalArgumentException(u2.toString());
        }
        int f10 = f() + size;
        int f11 = f();
        int f12 = c0407g.f();
        while (f11 < f10) {
            if (this.f9783b[f11] != c0407g.f9783b[f12]) {
                return false;
            }
            f11++;
            f12++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i3) {
        return this.f9783b[i3];
    }

    public final int hashCode() {
        int i3 = this.f9782a;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        int f10 = f();
        int i10 = size;
        for (int i11 = f10; i11 < f10 + size; i11++) {
            i10 = (i10 * 31) + this.f9783b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f9782a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0404d(this);
    }

    public int size() {
        return this.f9783b.length;
    }

    public final String toString() {
        C0407g c0406f;
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = F1.n(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int b2 = b(0, 47, size());
            if (b2 == 0) {
                c0406f = f9780c;
            } else {
                c0406f = new C0406f(this.f9783b, f(), b2);
            }
            sb3.append(F1.n(c0406f));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("<ByteString@");
        sb4.append(hexString);
        sb4.append(" size=");
        sb4.append(size);
        sb4.append(" contents=\"");
        return AbstractC1482f.k(sb4, sb2, "\">");
    }
}
