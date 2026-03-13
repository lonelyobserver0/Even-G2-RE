package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0404d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p0.AbstractC1482f;

/* renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0594b2 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0594b2 f11453c = new C0594b2(AbstractC0673r2.f11653b);

    /* renamed from: a, reason: collision with root package name */
    public int f11454a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11455b;

    static {
        int i3 = X1.f11407a;
    }

    public C0594b2(byte[] bArr) {
        bArr.getClass();
        this.f11455b = bArr;
    }

    public static C0594b2 d(int i3, int i10, byte[] bArr) {
        f(i3, i3 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        return new C0594b2(bArr2);
    }

    public static int f(int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if ((i3 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i3);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < i3) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(i10).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i3);
            sb3.append(", ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length());
        sb4.append("End index: ");
        sb4.append(i10);
        sb4.append(" >= ");
        sb4.append(i11);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public byte a(int i3) {
        return this.f11455b[i3];
    }

    public byte b(int i3) {
        return this.f11455b[i3];
    }

    public int c() {
        return this.f11455b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C0594b2) && c() == ((C0594b2) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof C0594b2)) {
                return obj.equals(this);
            }
            C0594b2 c0594b2 = (C0594b2) obj;
            int i3 = this.f11454a;
            int i10 = c0594b2.f11454a;
            if (i3 == 0 || i10 == 0 || i3 == i10) {
                int c10 = c();
                if (c10 > c0594b2.c()) {
                    int c11 = c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 18 + String.valueOf(c11).length());
                    sb2.append("Length too large: ");
                    sb2.append(c10);
                    sb2.append(c11);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (c10 <= c0594b2.c()) {
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < c10) {
                        if (this.f11455b[i11] == c0594b2.f11455b[i12]) {
                            i11++;
                            i12++;
                        }
                    }
                    return true;
                }
                int c12 = c0594b2.c();
                StringBuilder sb3 = new StringBuilder(String.valueOf(c10).length() + 27 + String.valueOf(c12).length());
                sb3.append("Ran off end of other: 0, ");
                sb3.append(c10);
                sb3.append(", ");
                sb3.append(c12);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f11454a;
        if (i3 != 0) {
            return i3;
        }
        int c10 = c();
        int i10 = c10;
        for (int i11 = 0; i11 < c10; i11++) {
            i10 = (i10 * 31) + this.f11455b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f11454a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0404d(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int c10 = c();
        if (c() <= 50) {
            concat = AbstractC0624h2.C(this);
        } else {
            int f10 = f(0, 47, c());
            concat = AbstractC0624h2.C(f10 == 0 ? f11453c : new C0589a2(this.f11455b, f10)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(c10);
        sb2.append(" contents=\"");
        return AbstractC1482f.k(sb2, concat, "\">");
    }
}
