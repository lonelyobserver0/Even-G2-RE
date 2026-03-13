package mb;

import io.flutter.plugin.common.BasicMessageChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicMessageChannel.Reply f17342b;

    public q(ArrayList arrayList, BasicMessageChannel.Reply reply) {
        this.f17341a = arrayList;
        this.f17342b = reply;
    }

    @Override // mb.w
    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f17341a;
        arrayList2.add(0, arrayList);
        this.f17342b.reply(arrayList2);
    }

    @Override // mb.w
    public final void b(m mVar) {
        this.f17342b.reply(android.support.v4.media.session.b.G(mVar));
    }
}
