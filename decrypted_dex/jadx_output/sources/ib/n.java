package ib;

import io.flutter.plugin.common.BasicMessageChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicMessageChannel.Reply f15011b;

    public n(ArrayList arrayList, BasicMessageChannel.Reply reply) {
        this.f15010a = arrayList;
        this.f15011b = reply;
    }

    @Override // ib.q
    public final void a(Exception exc) {
        this.f15011b.reply(android.support.v4.media.session.b.F(exc));
    }

    @Override // ib.q
    public final void success(Object obj) {
        ArrayList arrayList = this.f15010a;
        arrayList.add(0, (e) obj);
        this.f15011b.reply(arrayList);
    }
}
