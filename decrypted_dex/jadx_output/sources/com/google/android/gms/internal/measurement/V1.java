package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class V1 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = AbstractC0673r2.f11652a;
        iterable.getClass();
        if (iterable instanceof H2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof J2) {
                J2 j22 = (J2) list;
                int i3 = ((J2) list).f11294c + size;
                int length = j22.f11293b.length;
                if (i3 > length) {
                    if (length != 0) {
                        while (length < i3) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        j22.f11293b = Arrays.copyOf(j22.f11293b, length);
                    } else {
                        j22.f11293b = new Object[Math.max(i3, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC0634j2.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                AbstractC0634j2.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) this;
            int k3 = abstractC0639k2.k();
            byte[] bArr = new byte[k3];
            C0599c2 c0599c2 = new C0599c2(bArr, k3);
            abstractC0639k2.d(c0599c2);
            if (k3 - c0599c2.f11466h == 0) {
                return bArr;
            }
            throw new IllegalStateException(StubApp.getString2("11636"));
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(E1.a.n(new StringBuilder(name.length() + 72), StubApp.getString2(11852), name, StubApp.getString2(11853)), e10);
        }
    }

    public abstract int b(L2 l22);
}
