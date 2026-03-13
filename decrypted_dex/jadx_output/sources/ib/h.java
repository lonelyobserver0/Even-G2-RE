package ib;

import io.flutter.plugin.common.BasicMessageChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicMessageChannel.Reply f15001b;

    public h(ArrayList arrayList, BasicMessageChannel.Reply reply) {
        this.f15000a = arrayList;
        this.f15001b = reply;
    }

    @Override // ib.r
    public final void a(Exception exc) {
        this.f15001b.reply(android.support.v4.media.session.b.F(exc));
    }

    @Override // ib.r
    public final void b() {
        ArrayList arrayList = this.f15000a;
        arrayList.add(0, null);
        this.f15001b.reply(arrayList);
    }
}
