package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0607e0 extends AbstractRunnableC0637k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11478e = 4;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607e0(C0652n0 c0652n0, Activity activity, G g10) {
        super(c0652n0.f11627a, true);
        this.f11480g = activity;
        this.f11481h = g10;
        this.f11479f = c0652n0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:21|22|(1:24)|25|26|(12:57|58|59|29|(1:56)(1:33)|34|35|36|(1:38)(1:52)|39|40|(1:42)(3:44|(1:50)(1:47)|48))|28|29|(1:31)|56|34|35|36|(0)(0)|39|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010f, code lost:
    
        r7.b(r0, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5 A[Catch: Exception -> 0x00bd, a -> 0x00f8, TRY_ENTER, TryCatch #1 {a -> 0x00f8, blocks: (B:38:0x00f5, B:39:0x00fc, B:52:0x00fa), top: B:36:0x00f3, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:22:0x00a2, B:24:0x00b8, B:25:0x00c0, B:29:0x00de, B:31:0x00e5, B:34:0x00ee, B:38:0x00f5, B:39:0x00fc, B:40:0x0112, B:42:0x0118, B:44:0x0128, B:48:0x0141, B:52:0x00fa, B:55:0x010f, B:58:0x00d5), top: B:21:0x00a2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:22:0x00a2, B:24:0x00b8, B:25:0x00c0, B:29:0x00de, B:31:0x00e5, B:34:0x00ee, B:38:0x00f5, B:39:0x00fc, B:40:0x0112, B:42:0x0118, B:44:0x0128, B:48:0x0141, B:52:0x00fa, B:55:0x010f, B:58:0x00d5), top: B:21:0x00a2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa A[Catch: Exception -> 0x00bd, a -> 0x00f8, TryCatch #1 {a -> 0x00f8, blocks: (B:38:0x00f5, B:39:0x00fc, B:52:0x00fa), top: B:36:0x00f3, outer: #0 }] */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0607e0.a():void");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0637k0
    public void b() {
        switch (this.f11478e) {
            case 2:
                ((G) this.f11481h).y(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607e0(C0652n0 c0652n0, Bundle bundle, Activity activity) {
        super(c0652n0.f11627a, true);
        this.f11481h = bundle;
        this.f11480g = activity;
        this.f11479f = c0652n0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607e0(C0657o0 c0657o0, Context context, Bundle bundle) {
        super(c0657o0, true);
        this.f11480g = context;
        this.f11481h = bundle;
        Objects.requireNonNull(c0657o0);
        this.f11479f = c0657o0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607e0(C0657o0 c0657o0, String str, G g10) {
        super(c0657o0, true);
        this.f11480g = str;
        this.f11481h = g10;
        this.f11479f = c0657o0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607e0(C0657o0 c0657o0, String str, Exception exc) {
        super(c0657o0, false);
        this.f11480g = str;
        this.f11481h = exc;
        Objects.requireNonNull(c0657o0);
        this.f11479f = c0657o0;
    }
}
