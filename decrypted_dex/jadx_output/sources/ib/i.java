package ib;

import io.flutter.plugin.common.BasicMessageChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicMessageChannel.Reply f15003b;

    public i(ArrayList arrayList, BasicMessageChannel.Reply reply) {
        this.f15002a = arrayList;
        this.f15003b = reply;
    }

    @Override // ib.r
    public final void a(Exception exc) {
        this.f15003b.reply(android.support.v4.media.session.b.F(exc));
    }

    @Override // ib.r
    public final void b() {
        ArrayList arrayList = this.f15002a;
        arrayList.add(0, null);
        this.f15003b.reply(arrayList);
    }
}
