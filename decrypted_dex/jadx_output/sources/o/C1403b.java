package o;

import android.os.Handler;
import c5.w;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1403b extends hc.b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f18014c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f18015d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Handler f18016e;

    public C1403b() {
        super(14);
        this.f18014c = new Object();
        this.f18015d = Executors.newFixedThreadPool(4, new w());
    }
}
