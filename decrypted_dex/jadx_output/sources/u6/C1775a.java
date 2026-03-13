package u6;

import Q9.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.stub.StubApp;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1775a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21454a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f21455b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f21456c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f21457d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f21458e;

    /* renamed from: f, reason: collision with root package name */
    public c f21459f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21460g;

    public C1775a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21454a = context;
        IntentFilter intentFilter = new IntentFilter();
        this.f21455b = intentFilter;
        Object systemService = context.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f21456c = (AudioManager) systemService;
        this.f21457d = new HashSet();
        this.f21458e = new HashSet();
        intentFilter.addAction(StubApp.getString2(681));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra(StubApp.getString2(5368), -1);
        HashSet hashSet = this.f21457d;
        if (intExtra == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC1776b) it.next()).getClass();
            }
        } else {
            if (intExtra != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1776b) it2.next()).getClass();
            }
        }
    }
}
