package O0;

import R3.C0241j;
import S3.D;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import androidx.work.OverwritingInputMerger;
import com.stub.StubApp;
import d5.C0805e;
import e5.C0846e;
import f4.C0881e;
import i5.C1059c;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k6.AbstractC1110b;
import k6.C1111c;
import k6.C1114f;
import kotlin.jvm.internal.Intrinsics;
import l4.C1164b0;
import o0.C1428c;
import o0.C1438m;
import r0.AbstractC1560u;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements R3.n, f4.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5142a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5143b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5144c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5145d;

    public l(C1164b0 c1164b0, String str) {
        Objects.requireNonNull(c1164b0);
        this.f5145d = c1164b0;
        D.e(str);
        this.f5143b = str;
    }

    @Override // f4.m
    public synchronized R3.l a() {
        return (R3.l) this.f5144c;
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        C0241j c0241j;
        boolean z2;
        f4.p pVar = (f4.p) obj;
        q4.k kVar = (q4.k) obj2;
        synchronized (this) {
            c0241j = (C0241j) ((R3.l) this.f5144c).f6142c;
            z2 = this.f5142a;
            ((R3.l) this.f5144c).a();
        }
        if (c0241j == null) {
            kVar.b(Boolean.FALSE);
        } else {
            ((c7.f) this.f5143b).getClass();
            pVar.D(c0241j, z2, kVar);
        }
    }

    @Override // f4.m
    public void b() {
        C0241j c0241j;
        synchronized (this) {
            this.f5142a = false;
            c0241j = (C0241j) ((R3.l) this.f5144c).f6142c;
        }
        if (c0241j != null) {
            ((C0881e) this.f5145d).c(c0241j, 2441);
        }
    }

    @Override // f4.m
    public synchronized void c(R3.l lVar) {
        R3.l lVar2 = (R3.l) this.f5144c;
        if (lVar2 != lVar) {
            lVar2.a();
            this.f5144c = lVar;
        }
    }

    public i2.p d() {
        if (this.f5142a && ((r2.f) this.f5144c).j.f14720c) {
            throw new IllegalArgumentException(StubApp.getString2(3966));
        }
        i2.p pVar = new i2.p((UUID) this.f5143b, (r2.f) this.f5144c, (HashSet) this.f5145d);
        i2.b bVar = ((r2.f) this.f5144c).j;
        boolean z2 = bVar.f14725h.f14728a.size() > 0 || bVar.f14721d || bVar.f14719b || bVar.f14720c;
        r2.f fVar = (r2.f) this.f5144c;
        if (fVar.f20317q) {
            if (z2) {
                throw new IllegalArgumentException(StubApp.getString2(3968));
            }
            if (fVar.f20308g > 0) {
                throw new IllegalArgumentException(StubApp.getString2(3967));
            }
        }
        this.f5143b = UUID.randomUUID();
        r2.f fVar2 = (r2.f) this.f5144c;
        r2.f fVar3 = new r2.f();
        fVar3.f20303b = 1;
        i2.g gVar = i2.g.f14736c;
        fVar3.f20306e = gVar;
        fVar3.f20307f = gVar;
        fVar3.j = i2.b.f14717i;
        fVar3.f20312l = 1;
        fVar3.f20313m = 30000L;
        fVar3.f20316p = -1L;
        fVar3.f20318r = 1;
        fVar3.f20302a = fVar2.f20302a;
        fVar3.f20304c = fVar2.f20304c;
        fVar3.f20303b = fVar2.f20303b;
        fVar3.f20305d = fVar2.f20305d;
        fVar3.f20306e = new i2.g(fVar2.f20306e);
        fVar3.f20307f = new i2.g(fVar2.f20307f);
        fVar3.f20308g = fVar2.f20308g;
        fVar3.f20309h = fVar2.f20309h;
        fVar3.f20310i = fVar2.f20310i;
        i2.b bVar2 = fVar2.j;
        i2.b bVar3 = new i2.b();
        bVar3.f14718a = 1;
        bVar3.f14723f = -1L;
        bVar3.f14724g = -1L;
        bVar3.f14725h = new i2.d();
        bVar3.f14719b = bVar2.f14719b;
        bVar3.f14720c = bVar2.f14720c;
        bVar3.f14718a = bVar2.f14718a;
        bVar3.f14721d = bVar2.f14721d;
        bVar3.f14722e = bVar2.f14722e;
        bVar3.f14725h = bVar2.f14725h;
        fVar3.j = bVar3;
        fVar3.f20311k = fVar2.f20311k;
        fVar3.f20312l = fVar2.f20312l;
        fVar3.f20313m = fVar2.f20313m;
        fVar3.f20314n = fVar2.f20314n;
        fVar3.f20315o = fVar2.f20315o;
        fVar3.f20316p = fVar2.f20316p;
        fVar3.f20317q = fVar2.f20317q;
        fVar3.f20318r = fVar2.f20318r;
        this.f5144c = fVar3;
        fVar3.f20302a = ((UUID) this.f5143b).toString();
        return pVar;
    }

    public boolean e(C1428c c1428c, C1438m c1438m) {
        boolean canBeSpatialized;
        boolean equals = Objects.equals(c1438m.f18216n, StubApp.getString2(938));
        int i3 = c1438m.f18193C;
        if (!equals) {
            String str = c1438m.f18216n;
            if (Objects.equals(str, StubApp.getString2(3956))) {
                if (i3 == -1) {
                    i3 = 6;
                }
            } else if (Objects.equals(str, StubApp.getString2(3955)) && (i3 == 18 || i3 == 21)) {
                i3 = 24;
            }
        } else if (i3 == 16) {
            i3 = 12;
        }
        int q10 = AbstractC1560u.q(i3);
        if (q10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(q10);
        int i10 = c1438m.f18194D;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        canBeSpatialized = ((Spatializer) this.f5143b).canBeSpatialized((AudioAttributes) c1428c.a().f9233b, channelMask.build());
        return canBeSpatialized;
    }

    public int f(int i3, int i10, int i11) {
        boolean z2 = this.f5142a;
        T5.b bVar = (T5.b) this.f5143b;
        return z2 ? bVar.b(i10, i3) : bVar.b(i3, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public C1111c g() {
        C1111c c1111c = (C1111c) this.f5145d;
        if (c1111c != null) {
            return c1111c;
        }
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = f(i11, 8, i10);
        }
        int f10 = f(8, 7, f(8, 8, f(7, 8, i10)));
        for (int i12 = 5; i12 >= 0; i12--) {
            f10 = f(8, i12, f10);
        }
        int i13 = ((T5.b) this.f5143b).f7184b;
        int i14 = i13 - 7;
        for (int i15 = i13 - 1; i15 >= i14; i15--) {
            i3 = f(8, i15, i3);
        }
        for (int i16 = i13 - 8; i16 < i13; i16++) {
            i3 = f(i16, 8, i3);
        }
        C1111c a3 = C1111c.a(f10, i3);
        if (a3 == null) {
            a3 = C1111c.a(f10 ^ 21522, i3 ^ 21522);
        }
        this.f5145d = a3;
        if (a3 != null) {
            return a3;
        }
        throw N5.e.a();
    }

    public C1114f h() {
        C1114f c1114f = (C1114f) this.f5144c;
        if (c1114f != null) {
            return c1114f;
        }
        int i3 = ((T5.b) this.f5143b).f7184b;
        int i10 = (i3 - 17) / 4;
        if (i10 <= 6) {
            return C1114f.c(i10);
        }
        int i11 = i3 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i3 - 9; i15 >= i11; i15--) {
                i13 = f(i15, i14, i13);
            }
        }
        C1114f b2 = C1114f.b(i13);
        if (b2 != null && (b2.f15470a * 4) + 17 == i3) {
            this.f5144c = b2;
            return b2;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i3 - 9; i17 >= i11; i17--) {
                i12 = f(i16, i17, i12);
            }
        }
        C1114f b10 = C1114f.b(i12);
        if (b10 == null || (b10.f15470a * 4) + 17 != i3) {
            throw N5.e.a();
        }
        this.f5144c = b10;
        return b10;
    }

    public void i() {
        if (((C1111c) this.f5145d) == null) {
            return;
        }
        int i3 = AbstractC1856e.d(8)[((C1111c) this.f5145d).f15456b];
        T5.b bVar = (T5.b) this.f5143b;
        int i10 = bVar.f7184b;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (AbstractC1110b.a(i3, i11, i12)) {
                    bVar.a(i12, i11);
                }
            }
        }
    }

    public boolean j(String str, String str2) {
        synchronized (this) {
            try {
                if (!((C0846e) ((AtomicMarkableReference) this.f5143b).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f5143b;
                atomicMarkableReference.set((C0846e) atomicMarkableReference.getReference(), true);
                B0.o oVar = new B0.o(this, 23);
                AtomicReference atomicReference = (AtomicReference) this.f5144c;
                while (!atomicReference.compareAndSet(null, oVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((C0805e) ((C1059c) this.f5145d).f14844c).f13423b.a(oVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String k() {
        if (!this.f5142a) {
            this.f5142a = true;
            this.f5144c = ((C1164b0) this.f5145d).o().getString((String) this.f5143b, null);
        }
        return (String) this.f5144c;
    }

    public void l(String str) {
        SharedPreferences.Editor edit = ((C1164b0) this.f5145d).o().edit();
        edit.putString((String) this.f5143b, str);
        edit.apply();
        this.f5144c = str;
    }

    public l(Class cls) {
        this.f5142a = false;
        this.f5145d = new HashSet();
        this.f5143b = UUID.randomUUID();
        this.f5144c = new r2.f(((UUID) this.f5143b).toString(), cls.getName());
        ((HashSet) this.f5145d).add(cls.getName());
        ((r2.f) this.f5144c).f20305d = OverwritingInputMerger.class.getName();
    }

    public l(C1059c c1059c, boolean z2) {
        this.f5145d = c1059c;
        this.f5144c = new AtomicReference(null);
        this.f5142a = z2;
        this.f5143b = new AtomicMarkableReference(new C0846e(z2 ? 8192 : 1024), false);
    }

    public l(Context context, String str, J1.s callback, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5143b = context;
        this.f5144c = str;
        this.f5145d = callback;
        this.f5142a = z2;
    }
}
