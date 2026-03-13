package i4;

import S3.D;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import com.stub.StubApp;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: i4.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1049m {

    /* renamed from: a, reason: collision with root package name */
    public final int f14782a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14783b;

    /* renamed from: c, reason: collision with root package name */
    public long f14784c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f14785d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f14786e = LongCompanionObject.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f14787f = IntCompanionObject.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f14788g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14789h = true;

    /* renamed from: i, reason: collision with root package name */
    public long f14790i = -1;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f14791k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14792l = false;

    /* renamed from: m, reason: collision with root package name */
    public WorkSource f14793m = null;

    public C1049m(int i3, long j) {
        this.f14782a = 102;
        D.a(StubApp.getString2(1075), j >= 0);
        this.f14783b = j;
        y.a(i3);
        this.f14782a = i3;
    }

    public final LocationRequest a() {
        int i3 = this.f14782a;
        long j = this.f14783b;
        long j3 = this.f14784c;
        if (j3 == -1) {
            j3 = j;
        } else if (i3 != 105) {
            j3 = Math.min(j3, j);
        }
        long max = Math.max(this.f14785d, this.f14783b);
        long j10 = this.f14786e;
        int i10 = this.f14787f;
        float f10 = this.f14788g;
        boolean z2 = this.f14789h;
        long j11 = this.f14790i;
        if (j11 == -1) {
            j11 = this.f14783b;
        }
        return new LocationRequest(i3, j, j3, max, LongCompanionObject.MAX_VALUE, j10, i10, f10, z2, j11, this.j, this.f14791k, this.f14792l, new WorkSource(this.f14793m), null);
    }

    public final void b(int i3) {
        int i10;
        boolean z2 = true;
        if (i3 != 0 && i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                z2 = false;
            }
            D.c(z2, StubApp.getString2(18515), Integer.valueOf(i10));
            this.j = i3;
        }
        i10 = i3;
        D.c(z2, StubApp.getString2(18515), Integer.valueOf(i10));
        this.j = i3;
    }

    public final void c(long j) {
        boolean z2 = true;
        if (j != -1 && j < 0) {
            z2 = false;
        }
        D.a(StubApp.getString2(18516), z2);
        this.f14790i = j;
    }

    public final void d(long j) {
        boolean z2 = true;
        if (j != -1 && j < 0) {
            z2 = false;
        }
        D.a(StubApp.getString2(1076), z2);
        this.f14784c = j;
    }
}
