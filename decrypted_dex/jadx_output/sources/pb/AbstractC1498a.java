package pb;

import com.stub.StubApp;
import java.util.HashMap;
import o0.AbstractC1407D;
import o0.InterfaceC1410G;
import v0.C1830z;
import v0.InterfaceC1820o;

/* renamed from: pb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1498a implements InterfaceC1410G {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19766a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19767b = false;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1820o f19768c;

    /* renamed from: d, reason: collision with root package name */
    public final t f19769d;

    public AbstractC1498a(InterfaceC1820o interfaceC1820o, t tVar) {
        this.f19768c = interfaceC1820o;
        this.f19769d = tVar;
    }

    @Override // o0.InterfaceC1410G
    public final void D(boolean z2) {
        t tVar = this.f19769d;
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(1420), StubApp.getString2(22152));
        hashMap.put(StubApp.getString2(22153), Boolean.valueOf(z2));
        tVar.f19802a.success(hashMap);
    }

    @Override // o0.InterfaceC1410G
    public final void h(int i3) {
        t tVar = this.f19769d;
        String string2 = StubApp.getString2(1420);
        p pVar = tVar.f19802a;
        if (i3 == 2) {
            m(true);
            long m4 = ((C1830z) this.f19768c).m();
            HashMap hashMap = new HashMap();
            hashMap.put(string2, StubApp.getString2(22155));
            hashMap.put(StubApp.getString2(665), Long.valueOf(m4));
            pVar.success(hashMap);
        } else if (i3 != 3) {
            if (i3 == 4) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(string2, StubApp.getString2(22154));
                pVar.success(hashMap2);
            }
        } else if (!this.f19767b) {
            this.f19767b = true;
            k();
        }
        if (i3 != 2) {
            m(false);
        }
    }

    public abstract void k();

    public final void m(boolean z2) {
        if (this.f19766a == z2) {
            return;
        }
        this.f19766a = z2;
        t tVar = this.f19769d;
        String string2 = StubApp.getString2(1420);
        p pVar = tVar.f19802a;
        if (z2) {
            HashMap hashMap = new HashMap();
            hashMap.put(string2, StubApp.getString2(22156));
            pVar.success(hashMap);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(string2, StubApp.getString2(22157));
            pVar.success(hashMap2);
        }
    }

    @Override // o0.InterfaceC1410G
    public final void z(AbstractC1407D abstractC1407D) {
        m(false);
        if (abstractC1407D.f18023a != 1002) {
            this.f19769d.f19802a.error(StubApp.getString2(22159), StubApp.getString2(22158) + abstractC1407D, null);
            return;
        }
        Object obj = this.f19768c;
        Mb.b bVar = (Mb.b) obj;
        bVar.getClass();
        bVar.j(((C1830z) bVar).q(), -9223372036854775807L);
        ((C1830z) obj).C();
    }
}
