package x0;

import Z9.C0366a;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import o0.C1428c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f22646a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f22647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m6.l f22648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m6.l lVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f22648c = lVar;
        this.f22646a = contentResolver;
        this.f22647b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        m6.l lVar = this.f22648c;
        lVar.a(b.c((Context) lVar.f17111c, (C1428c) lVar.j, (C0366a) lVar.f17117i));
    }
}
