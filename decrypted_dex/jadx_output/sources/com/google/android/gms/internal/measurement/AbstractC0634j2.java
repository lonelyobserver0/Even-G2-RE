package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0634j2 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0639k2 f11592a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0639k2 f11593b;

    public AbstractC0634j2(AbstractC0639k2 abstractC0639k2) {
        this.f11592a = abstractC0639k2;
        if (abstractC0639k2.e()) {
            throw new IllegalArgumentException(StubApp.getString2(12099));
        }
        this.f11593b = (AbstractC0639k2) abstractC0639k2.o(4);
    }

    public static void a(int i3, List list) {
        int size = list.size() - i3;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append(StubApp.getString2(6809));
        sb2.append(size);
        sb2.append(StubApp.getString2(6810));
        String sb3 = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i3) {
                throw new NullPointerException(sb3);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f11593b.e()) {
            return;
        }
        AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) this.f11592a.o(4);
        I2.f11287c.a(abstractC0639k2.getClass()).c(abstractC0639k2, this.f11593b);
        this.f11593b = abstractC0639k2;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC0634j2 clone() {
        AbstractC0634j2 abstractC0634j2 = (AbstractC0634j2) this.f11592a.o(5);
        abstractC0634j2.f11593b = d();
        return abstractC0634j2;
    }

    public final AbstractC0639k2 d() {
        if (!this.f11593b.e()) {
            return this.f11593b;
        }
        this.f11593b.g();
        return this.f11593b;
    }

    public final AbstractC0639k2 e() {
        AbstractC0639k2 d8 = d();
        d8.getClass();
        boolean z2 = true;
        byte byteValue = ((Byte) d8.o(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z2 = false;
            } else {
                z2 = I2.f11287c.a(d8.getClass()).e(d8);
                d8.o(2);
            }
        }
        if (z2) {
            return d8;
        }
        throw new H9.b(StubApp.getString2(12100));
    }

    public final void f(AbstractC0639k2 abstractC0639k2) {
        AbstractC0639k2 abstractC0639k22 = this.f11592a;
        if (abstractC0639k22.equals(abstractC0639k2)) {
            return;
        }
        if (!this.f11593b.e()) {
            AbstractC0639k2 abstractC0639k23 = (AbstractC0639k2) abstractC0639k22.o(4);
            I2.f11287c.a(abstractC0639k23.getClass()).c(abstractC0639k23, this.f11593b);
            this.f11593b = abstractC0639k23;
        }
        AbstractC0639k2 abstractC0639k24 = this.f11593b;
        I2.f11287c.a(abstractC0639k24.getClass()).c(abstractC0639k24, abstractC0639k2);
    }

    public final void g(byte[] bArr, int i3, C0604d2 c0604d2) {
        if (!this.f11593b.e()) {
            AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) this.f11592a.o(4);
            I2.f11287c.a(abstractC0639k2.getClass()).c(abstractC0639k2, this.f11593b);
            this.f11593b = abstractC0639k2;
        }
        try {
            L2 a3 = I2.f11287c.a(this.f11593b.getClass());
            AbstractC0639k2 abstractC0639k22 = this.f11593b;
            Y1 y12 = new Y1();
            c0604d2.getClass();
            a3.h(abstractC0639k22, bArr, 0, i3, y12);
        } catch (C0683t2 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(StubApp.getString2(12101), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C0683t2(StubApp.getString2(11586));
        }
    }
}
