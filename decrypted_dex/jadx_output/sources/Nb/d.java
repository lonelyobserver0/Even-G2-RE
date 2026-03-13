package Nb;

import android.os.ConditionVariable;
import com.stub.StubApp;
import java.util.concurrent.Callable;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d implements Callable, e {

    /* renamed from: a, reason: collision with root package name */
    public final D5.u f4984a;

    /* renamed from: c, reason: collision with root package name */
    public final ConditionVariable f4986c = new ConditionVariable(true);

    /* renamed from: b, reason: collision with root package name */
    public int f4985b = 1;

    public d(D5.u uVar) {
        this.f4984a = uVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D5.u call() {
        if (this.f4985b == 4) {
            return this.f4984a;
        }
        while (true) {
            D5.u uVar = this.f4984a;
            byte[] bArr = (byte[]) uVar.f1459c;
            if (bArr != null && uVar.f1457a == bArr.length) {
                synchronized (this) {
                    this.f4985b = 4;
                    E0 e02 = (E0) this.f4984a.f1460d;
                    ((Mb.a) e02.f16037b).h((Cb.l) e02.f16038c);
                }
                return this.f4984a;
            }
            this.f4986c.block();
            if (this.f4985b == 4) {
                return this.f4984a;
            }
            this.f4985b = 2;
            try {
                this.f4984a.f();
                synchronized (this) {
                    try {
                        if (this.f4985b == 4) {
                            return this.f4984a;
                        }
                        D5.u uVar2 = this.f4984a;
                        byte[] bArr2 = (byte[]) uVar2.f1459c;
                        if (bArr2 == null) {
                            throw new NullPointerException(StubApp.getString2("25406"));
                        }
                        ((Ab.j) ((Mb.b) ((Mb.a) ((E0) uVar2.f1460d).f16037b).f4727f)).f295b.J(uVar2.f1457a, bArr2.length, System.currentTimeMillis());
                    } finally {
                    }
                }
            } catch (Db.c e10) {
                if (e10 instanceof Db.a) {
                    throw ((Db.a) e10);
                }
                synchronized (this) {
                    this.f4985b = 4;
                    E0 e03 = (E0) this.f4984a.f1460d;
                    ((Mb.a) e03.f16037b).i((Cb.l) e03.f16038c, e10);
                    return this.f4984a;
                }
            }
        }
    }

    @Override // Nb.e
    public final synchronized void cancel() {
        this.f4985b = 4;
        this.f4986c.open();
        E0 e02 = (E0) this.f4984a.f1460d;
        ((Mb.a) e02.f16037b).h((Cb.l) e02.f16038c);
    }

    @Override // Nb.e
    public final synchronized void pause() {
        if (this.f4985b == 2) {
            this.f4985b = 3;
            this.f4986c.close();
        }
    }

    @Override // Nb.e
    public final synchronized void resume() {
        if (this.f4985b == 3) {
            this.f4985b = 2;
            this.f4986c.open();
        }
    }
}
