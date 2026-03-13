package mb;

import io.flutter.plugin.common.BasicMessageChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicMessageChannel.Reply f17340b;

    public p(ArrayList arrayList, BasicMessageChannel.Reply reply) {
        this.f17339a = arrayList;
        this.f17340b = reply;
    }

    @Override // mb.w
    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f17339a;
        arrayList2.add(0, arrayList);
        this.f17340b.reply(arrayList2);
    }

    @Override // mb.w
    public final void b(m mVar) {
        this.f17340b.reply(android.support.v4.media.session.b.G(mVar));
    }
}
