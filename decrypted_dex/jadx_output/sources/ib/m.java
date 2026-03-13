package ib;

import io.flutter.plugin.common.BasicMessageChannel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicMessageChannel.Reply f15009b;

    public m(ArrayList arrayList, BasicMessageChannel.Reply reply) {
        this.f15008a = arrayList;
        this.f15009b = reply;
    }

    @Override // ib.q
    public final void a(Exception exc) {
        this.f15009b.reply(android.support.v4.media.session.b.F(exc));
    }

    @Override // ib.q
    public final void success(Object obj) {
        ArrayList arrayList = this.f15008a;
        arrayList.add(0, (List) obj);
        this.f15009b.reply(arrayList);
    }
}
