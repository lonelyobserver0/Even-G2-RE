package I8;

import com.mapbox.common.HttpServiceFactory;
import com.stub.StubApp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3234a = new a(0, HttpServiceFactory.class, StubApp.getString2(2877), StubApp.getString2(2876), 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return HttpServiceFactory.getInstance();
    }
}
