package l0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.stub.StubApp;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1136a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f15711a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f15712b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15713c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15714d;

    public C1136a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f15711a = intentFilter;
        this.f15712b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(StubApp.getString2(19215));
        sb2.append(this.f15712b);
        sb2.append(StubApp.getString2(19216));
        sb2.append(this.f15711a);
        if (this.f15714d) {
            sb2.append(StubApp.getString2(19217));
        }
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
