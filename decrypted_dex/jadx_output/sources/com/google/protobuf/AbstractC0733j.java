package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import p0.AbstractC1482f;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0733j implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0731i f12158b = new C0731i(Q.f12120b);

    /* renamed from: c, reason: collision with root package name */
    public static final C0727g f12159c;

    /* renamed from: a, reason: collision with root package name */
    public int f12160a;

    static {
        f12159c = AbstractC0723e.a() ? new C0727g(1) : new C0727g(0);
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

    public static C0731i c(int i3, int i10, byte[] bArr) {
        byte[] copyOfRange;
        b(i3, i3 + i10, bArr.length);
        switch (f12159c.f12154a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i10 + i3);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i3, copyOfRange, 0, i10);
                break;
        }
        return new C0731i(copyOfRange);
    }

    public static C0731i d(String str) {
        return new C0731i(str.getBytes(Q.f12119a));
    }

    public abstract byte a(int i3);

    public abstract byte f(int i3);

    public abstract boolean g();

    public final int hashCode() {
        int i3 = this.f12160a;
        if (i3 == 0) {
            int size = size();
            i3 = j(size, size);
            if (i3 == 0) {
                i3 = 1;
            }
            this.f12160a = i3;
        }
        return i3;
    }

    public abstract AbstractC0741n i();

    public abstract int j(int i3, int i10);

    public abstract AbstractC0733j l(int i3);

    public abstract String m(Charset charset);

    public final String n() {
        return size() == 0 ? "" : m(Q.f12119a);
    }

    public abstract void o(AbstractC0747q abstractC0747q);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = Ec.l.k(this);
        } else {
            str = Ec.l.k(l(47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AbstractC1482f.k(sb2, str, "\">");
    }
}
