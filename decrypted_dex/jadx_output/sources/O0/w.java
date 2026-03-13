package O0;

import java.util.Objects;
import o0.C1422T;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import v0.b0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f5189a;

    /* renamed from: b, reason: collision with root package name */
    public final b0[] f5190b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f5191c;

    /* renamed from: d, reason: collision with root package name */
    public final C1422T f5192d;

    /* renamed from: e, reason: collision with root package name */
    public final u f5193e;

    public w(b0[] b0VarArr, s[] sVarArr, C1422T c1422t, u uVar) {
        AbstractC1550k.c(b0VarArr.length == sVarArr.length);
        this.f5190b = b0VarArr;
        this.f5191c = (s[]) sVarArr.clone();
        this.f5192d = c1422t;
        this.f5193e = uVar;
        this.f5189a = b0VarArr.length;
    }

    public final boolean a(w wVar, int i3) {
        if (wVar == null) {
            return false;
        }
        b0 b0Var = this.f5190b[i3];
        b0 b0Var2 = wVar.f5190b[i3];
        int i10 = AbstractC1560u.f20190a;
        return Objects.equals(b0Var, b0Var2) && Objects.equals(this.f5191c[i3], wVar.f5191c[i3]);
    }

    public final boolean b(int i3) {
        return this.f5190b[i3] != null;
    }
}
