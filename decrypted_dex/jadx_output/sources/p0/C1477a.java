package p0;

import M4.Z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import r0.AbstractC1550k;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1477a {

    /* renamed from: a, reason: collision with root package name */
    public final Z f19602a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19603b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f19604c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f19605d;

    public C1477a(Z z2) {
        this.f19602a = z2;
        C1478b c1478b = C1478b.f19606e;
        this.f19605d = false;
    }

    public final C1478b a(C1478b c1478b) {
        if (c1478b.equals(C1478b.f19606e)) {
            throw new C1479c(c1478b);
        }
        int i3 = 0;
        while (true) {
            Z z2 = this.f19602a;
            if (i3 >= z2.f4580d) {
                return c1478b;
            }
            InterfaceC1480d interfaceC1480d = (InterfaceC1480d) z2.get(i3);
            C1478b d8 = interfaceC1480d.d(c1478b);
            if (interfaceC1480d.a()) {
                AbstractC1550k.g(!d8.equals(C1478b.f19606e));
                c1478b = d8;
            }
            i3++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f19603b;
        arrayList.clear();
        this.f19605d = false;
        int i3 = 0;
        while (true) {
            Z z2 = this.f19602a;
            if (i3 >= z2.f4580d) {
                break;
            }
            InterfaceC1480d interfaceC1480d = (InterfaceC1480d) z2.get(i3);
            interfaceC1480d.flush();
            if (interfaceC1480d.a()) {
                arrayList.add(interfaceC1480d);
            }
            i3++;
        }
        this.f19604c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= c(); i10++) {
            this.f19604c[i10] = ((InterfaceC1480d) arrayList.get(i10)).b();
        }
    }

    public final int c() {
        return this.f19604c.length - 1;
    }

    public final boolean d() {
        return this.f19605d && ((InterfaceC1480d) this.f19603b.get(c())).f() && !this.f19604c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f19603b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1477a) {
            C1477a c1477a = (C1477a) obj;
            Z z2 = this.f19602a;
            if (z2.f4580d == c1477a.f19602a.f4580d) {
                for (int i3 = 0; i3 < z2.f4580d; i3++) {
                    if (z2.get(i3) == c1477a.f19602a.get(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z2;
        for (boolean z10 = true; z10; z10 = z2) {
            z2 = false;
            int i3 = 0;
            while (i3 <= c()) {
                if (!this.f19604c[i3].hasRemaining()) {
                    ArrayList arrayList = this.f19603b;
                    InterfaceC1480d interfaceC1480d = (InterfaceC1480d) arrayList.get(i3);
                    if (!interfaceC1480d.f()) {
                        ByteBuffer byteBuffer2 = i3 > 0 ? this.f19604c[i3 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1480d.f19611a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC1480d.c(byteBuffer2);
                        this.f19604c[i3] = interfaceC1480d.b();
                        z2 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f19604c[i3].hasRemaining();
                    } else if (!this.f19604c[i3].hasRemaining() && i3 < c()) {
                        ((InterfaceC1480d) arrayList.get(i3 + 1)).e();
                    }
                }
                i3++;
            }
        }
    }

    public final int hashCode() {
        return this.f19602a.hashCode();
    }
}
