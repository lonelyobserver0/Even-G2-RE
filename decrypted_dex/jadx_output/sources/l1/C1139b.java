package l1;

import T0.l;
import f4.C0879c;
import java.util.ArrayDeque;
import kotlin.UByte;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1139b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15724a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f15725b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final C1142e f15726c = new C1142e();

    /* renamed from: d, reason: collision with root package name */
    public C0879c f15727d;

    /* renamed from: e, reason: collision with root package name */
    public int f15728e;

    /* renamed from: f, reason: collision with root package name */
    public int f15729f;

    /* renamed from: g, reason: collision with root package name */
    public long f15730g;

    public final long a(l lVar, int i3) {
        lVar.e(this.f15724a, 0, i3, false);
        long j = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j = (j << 8) | (r0[i10] & UByte.MAX_VALUE);
        }
        return j;
    }
}
