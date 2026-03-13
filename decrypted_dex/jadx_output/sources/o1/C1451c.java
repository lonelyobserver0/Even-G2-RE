package o1;

import L0.U;
import T0.AbstractC0311b;
import T0.u;
import Y.m;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import l4.E0;
import o0.C1438m;
import r0.C1553n;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1451c extends i {

    /* renamed from: n, reason: collision with root package name */
    public u f18320n;

    /* renamed from: o, reason: collision with root package name */
    public U f18321o;

    @Override // o1.i
    public final long b(C1553n c1553n) {
        byte[] bArr = c1553n.f20176a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i3 = (bArr[2] & UByte.MAX_VALUE) >> 4;
        if (i3 == 6 || i3 == 7) {
            c1553n.H(4);
            c1553n.B();
        }
        int v2 = AbstractC0311b.v(i3, c1553n);
        c1553n.G(0);
        return v2;
    }

    @Override // o1.i
    public final boolean c(C1553n c1553n, long j, m mVar) {
        byte[] bArr = c1553n.f20176a;
        u uVar = this.f18320n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f18320n = uVar2;
            mVar.f8674b = uVar2.c(Arrays.copyOfRange(bArr, 9, c1553n.f20178c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & ByteCompanionObject.MAX_VALUE) != 3) {
            if (b2 != -1) {
                return true;
            }
            U u2 = this.f18321o;
            if (u2 != null) {
                u2.f3994a = j;
                mVar.f8675c = u2;
            }
            ((C1438m) mVar.f8674b).getClass();
            return false;
        }
        E0 w10 = AbstractC0311b.w(c1553n);
        u uVar3 = new u(uVar.f7047a, uVar.f7048b, uVar.f7049c, uVar.f7050d, uVar.f7051e, uVar.f7053g, uVar.f7054h, uVar.j, w10, uVar.f7057l);
        this.f18320n = uVar3;
        U u10 = new U();
        u10.f3996c = uVar3;
        u10.f3997d = w10;
        u10.f3994a = -1L;
        u10.f3995b = -1L;
        this.f18321o = u10;
        return true;
    }

    @Override // o1.i
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f18320n = null;
            this.f18321o = null;
        }
    }
}
