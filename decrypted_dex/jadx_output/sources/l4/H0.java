package l4;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16093a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16098f;

    public H0(C8.a aVar, boolean z2, Uri uri, String str, String str2) {
        this.f16096d = z2;
        this.f16097e = uri;
        this.f16094b = str;
        this.f16095c = str2;
        Objects.requireNonNull(aVar);
        this.f16098f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1 A[Catch: RuntimeException -> 0x0119, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0119, blocks: (B:36:0x014c, B:38:0x0157, B:41:0x0168, B:43:0x016e, B:44:0x018c, B:45:0x0199, B:49:0x01a1, B:51:0x01a6, B:54:0x01bc, B:55:0x01cf, B:57:0x01c3, B:58:0x01ea, B:60:0x01f0, B:62:0x01f6, B:64:0x01fc, B:66:0x0204, B:68:0x0210, B:70:0x021c, B:72:0x0222, B:75:0x023c, B:84:0x00bc, B:86:0x00c8, B:88:0x00ce, B:90:0x00d4, B:92:0x00da, B:94:0x00e6, B:96:0x00f2, B:98:0x00fe, B:100:0x010a, B:101:0x0120, B:103:0x012e), top: B:83:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.H0.run():void");
    }

    public H0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.L l9, String str, String str2, boolean z2) {
        this.f16097e = l9;
        this.f16094b = str;
        this.f16095c = str2;
        this.f16096d = z2;
        this.f16098f = appMeasurementDynamiteService;
    }

    public H0(P0 p02, AtomicReference atomicReference, String str, String str2, boolean z2) {
        this.f16097e = atomicReference;
        this.f16094b = str;
        this.f16095c = str2;
        this.f16096d = z2;
        Objects.requireNonNull(p02);
        this.f16098f = p02;
    }

    public H0(C1189j1 c1189j1, M1 m12, boolean z2, C1213u c1213u, Bundle bundle) {
        this.f16097e = m12;
        this.f16096d = z2;
        this.f16094b = c1213u;
        this.f16095c = bundle;
        Objects.requireNonNull(c1189j1);
        this.f16098f = c1189j1;
    }
}
