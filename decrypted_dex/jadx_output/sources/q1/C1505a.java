package q1;

import M4.I;
import java.util.List;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1505a {

    /* renamed from: a, reason: collision with root package name */
    public final I f19879a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19880b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19881c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19882d;

    public C1505a(List list, long j, long j3) {
        this.f19879a = I.m(list);
        this.f19880b = j;
        this.f19881c = j3;
        long j10 = -9223372036854775807L;
        if (j != -9223372036854775807L && j3 != -9223372036854775807L) {
            j10 = j + j3;
        }
        this.f19882d = j10;
    }
}
