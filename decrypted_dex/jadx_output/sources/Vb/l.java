package Vb;

import com.stub.StubApp;
import kotlin.jvm.internal.PropertyReference0Impl;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class l extends PropertyReference0Impl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7955a = 0;

    public /* synthetic */ l(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, i3);
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
    public final Object get() {
        switch (this.f7955a) {
            case 0:
                return this.receiver.getClass().getSimpleName();
            default:
                return AbstractC1526a.v((q8.d) this.receiver);
        }
    }

    public l(q8.d dVar) {
        super(dVar, AbstractC1526a.class, StubApp.getString2(25763), StubApp.getString2(25764), 1);
    }
}
