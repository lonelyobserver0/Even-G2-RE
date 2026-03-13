package a7;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9292a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i10) {
        super(i3);
        this.f9292a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9292a) {
            case 0:
                U6.a geoJsonSource = (U6.a) obj;
                Intrinsics.checkNotNullParameter(geoJsonSource, "$this$geoJsonSource");
                return Unit.INSTANCE;
            case 1:
                U6.a geoJsonSource2 = (U6.a) obj;
                Intrinsics.checkNotNullParameter(geoJsonSource2, "$this$geoJsonSource");
                return Unit.INSTANCE;
            default:
                String historyFilePath = (String) obj;
                Intrinsics.checkNotNullParameter(historyFilePath, "historyFilePath");
                File file = new File(historyFilePath);
                Intrinsics.checkNotNullParameter(file, "file");
                file.delete();
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j8.d dVar) {
        super(1);
        this.f9292a = 2;
    }
}
